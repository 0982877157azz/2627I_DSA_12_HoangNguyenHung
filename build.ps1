$ErrorActionPreference = 'Stop'

$root = $PSScriptRoot
$outputRoot = Join-Path $root 'build'

$javac = Get-Command javac -ErrorAction SilentlyContinue
if (-not $javac) {
    $javaHome = [Environment]::GetEnvironmentVariable('JAVA_HOME')
    if ($javaHome) {
        $candidate = Join-Path $javaHome 'bin\javac.exe'
        if (Test-Path -LiteralPath $candidate) {
            $javac = $candidate
        }
    }
}
if (-not $javac) {
    throw 'Khong tim thay javac. Hay cai JDK va them thu muc bin cua JDK vao PATH (hoac dat JAVA_HOME).'
}

$weekFolders = @(Get-ChildItem -LiteralPath $root -Directory | Where-Object { $_.Name -match '^Week\d+$' } | Sort-Object { [int]($_.Name -replace '^Week', '') })
if ($weekFolders.Count -eq 0) {
    throw 'Khong tim thay folder Week1, Week2, ... trong repo.'
}

$compiledCount = 0
foreach ($week in $weekFolders) {
    $sources = @(Get-ChildItem -LiteralPath $week.FullName -Filter '*.java' -File -Recurse | Where-Object { $_.Length -gt 0 } | Sort-Object FullName)
    if ($sources.Count -eq 0) {
        Write-Host "Bo qua $($week.Name): chua co file Java co noi dung."
        continue
    }

    $destination = Join-Path $outputRoot $week.Name
    New-Item -ItemType Directory -Path $destination -Force | Out-Null
    $sourcePaths = @($sources | ForEach-Object { $_.FullName })
    Write-Host "Dang build $($week.Name) ($($sources.Count) file)..."
    & $javac -encoding UTF-8 -d $destination @sourcePaths
    if ($LASTEXITCODE -ne 0) {
        throw "Build that bai: $($week.Name)."
    }
    $compiledCount += $sources.Count
}

if ($compiledCount -eq 0) {
    Write-Host 'Chua co bai Java co noi dung de build.'
    exit 0
}
Write-Host "Build thanh cong $compiledCount file Java. Ket qua nam trong build/."

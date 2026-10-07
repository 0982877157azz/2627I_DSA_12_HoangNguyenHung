# DSA - Hoang Nguyen Hung

Repo nop bai tap DSA theo tung tuan. Moi tuan co mot folder `WeekN` (vi du `Week5`).

## Build bai tap

Can cai JDK 25. Tren Windows, mo PowerShell tai folder repo va chay:

```powershell
./build.ps1
```

Script tu tim cac folder `WeekN` va bien dich nhung file `.java` co noi dung. Folder chua co bai se duoc bo qua.

Trong IntelliJ IDEA, vao **File > Project Structure > Project** va chon JDK da cai tren may. Bieu tuong chiec coc la bieu tuong binh thuong cua file Java. Nut Run chi xuat hien khi file co chuong trinh chay duoc, vi du co ham `main`.

## Them bai hang tuan

1. Tao folder `Week5`, `Week6`, ... tai goc repo.
2. Them cac file `.java` vao folder tuong ung. Ten file phai trung voi ten `public class` trong file.
3. Chay `./build.ps1` de kiem tra bien dich.
4. Commit va push len GitHub. GitHub Actions se tu dong build lai moi khi push.

Moi tuan duoc bien dich rieng vao `build/WeekN`, nen cac tuan co the su dung lai ten class. Folder `build/` duoc bo qua khi commit.

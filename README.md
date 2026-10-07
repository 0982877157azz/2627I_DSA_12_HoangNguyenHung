# DSA - Hoang Nguyen Hung

Repo nop bai tap DSA theo tung tuan. Moi tuan co mot folder `WeekN` (vi du `Week5`).

## Chay bai Week4

Can cai JDK 25 va dung `java`, `javac` trong terminal. Tren Windows, mo PowerShell tai folder repo:

```powershell
./build.ps1
java -cp build/Week4 insertionSort
java -cp build/Week4 insertionSort 5 -2 5 0
```

Ket qua cua lenh cuoi: `[-2, 0, 5, 5]`.

Trong IntelliJ IDEA, vao **File > Project Structure > Project**, chon JDK da cai tren may (hien tai la JDK 25). Mo `Week4/insertionSort.java` va bam nut Run ben canh ham `main`. Bieu tuong chiec coc la bieu tuong binh thuong cua file Java.

## Them bai hang tuan

1. Tao folder `Week5`, `Week6`, ... tai goc repo.
2. Them cac file `.java` vao folder tuong ung. Ten file phai trung voi ten `public class` trong file.
3. Chay `./build.ps1` de bien dich tat ca cac tuan. Folder chua co file Java se duoc bo qua.
4. Commit va push len GitHub. GitHub Actions se tu dong build lai moi khi push.

Moi tuan duoc bien dich rieng vao `build/WeekN`, nen cac tuan co the su dung lai ten class. Folder `build/` duoc bo qua khi commit.

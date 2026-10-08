import java.util.*;

public class insertionSort2 {
    public static void insertionSortDemo2(int n, int[] arr){
        for (int i = 1; i < n; i ++){
            int temp = arr[i];
            int j = i - 1;
            boolean ok = false;
            while (j >= 0 && !ok){
                if (arr[j] > temp){
                    arr[j+1] = arr[j];
                    j--;
                }
                else{
                    ok = true;
                }
            }
            arr[j+1] = temp;
            for (int count = 0; count < n; count++){
                System.out.print(arr[count] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        insertionSortDemo2(n, arr);
    }
}

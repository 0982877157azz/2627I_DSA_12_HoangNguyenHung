import java.util.*;

public class insertionSort{
    public static void insertionSortDemo(int n, int[] arr){
        int i = n - 1;
        int j = i - 1;
        boolean ok = false;
        int temp = arr[i];
        while (j >= 0 & !ok){
            if ( arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
                for (int count = 0; count < n; count++){
                    System.out.print(arr[count] + " ");
                }
                System.out.println();
            }
            else{
                ok = true;
            }
        }
        arr[j+1] = temp;
        for (int count = 0; count < n; count++) {
            System.out.print(arr[count] + " ");
        }
    };

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n] ;
        for (int i = 0; i < n; i ++){
            arr[i] = sc.nextInt();
        }
        insertionSortDemo(n, arr);;
    }
}

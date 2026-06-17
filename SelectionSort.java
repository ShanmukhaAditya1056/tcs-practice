import java.util.Arrays;

public class SelectionSort {
    public static int[] selsrt(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {23, 45, 12, 34, 13};
        int[] res = selsrt(arr);
        System.out.println("The sorted array is: " + Arrays.toString(res));
    }
}
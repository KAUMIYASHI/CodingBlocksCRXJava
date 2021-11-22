public class InsertionSort {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int val = arr[i];
            while (j >= 0 && arr[j] > val) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = val;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 8, 1, 4, 18, 3, 2 };
        insertionSort(arr);
        for (int i : arr)
            System.out.print(i + " ");
    }
}

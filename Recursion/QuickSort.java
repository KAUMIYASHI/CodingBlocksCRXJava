
public class QuickSort {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int[] arr, int low, int high) {
        int l = low;
        int r = high;
        int mid = (l + r) / 2;
        int pivot = arr[mid];

        if (l >= r)
            return;

        while (l <= r) {
            while (arr[l] < pivot) {
                l++;
            }
            while (arr[r] > pivot) {
                r--;
            }
            if (l <= r) {
                swap(arr, l, r);
                l++;
                r--;
            }
            quickSort(arr, low, r);
            quickSort(arr, l, high);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 8, 4, 18, 3, 2 };

        quickSort(arr, 0, arr.length - 1);
        for (int i : arr)
            System.out.print(i + " ");
    }
}

public class BubbleSortRecursive {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubbleSort(int[] arr, int startIndex, int lastIndex) {

        // *********** Method 1 ************

        // if (startIndex >= lastIndex)
        // return;
        // if (arr[startIndex] > arr[startIndex + 1])
        // swap(arr, startIndex, startIndex + 1);
        // bubbleSort(arr, startIndex + 1, lastIndex);
        // bubbleSort(arr, startIndex, lastIndex - 1);

        // *********** Method 2 *****************

        if (lastIndex == 0)
            return;
        if (startIndex == lastIndex) {
            bubbleSort(arr, 0, lastIndex - 1);
            return;
        }
        if (arr[startIndex] > arr[startIndex + 1])
            swap(arr, startIndex, startIndex + 1);
        bubbleSort(arr, startIndex + 1, lastIndex);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 8, 4, 18, 3, 2 };
        bubbleSort(arr, 0, arr.length - 1);
        for (int i : arr)
            System.out.print(i + " ");
    }
}

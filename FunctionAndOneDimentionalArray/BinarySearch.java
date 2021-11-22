public class BinarySearch {

    public static int binarySearch(int[] arr, int min, int max, int key) {
        int mid = (min + max) / 2;

        if (min > max)
            return -1;

        if (arr[mid] == key)
            return mid;
        else if (arr[mid] > key)
            return binarySearch(arr, min, mid - 1, key);
        else
            return binarySearch(arr, mid + 1, max, key);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 45, 55, 88 };
        int key = 200;
        int index = binarySearch(arr, 0, arr.length - 1, key);
        System.err.println(index == -1 ? "Element not Found" : "Element found at index " + index);
    }

}

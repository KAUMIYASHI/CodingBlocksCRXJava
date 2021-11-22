public class LinearSearch {

    public static int linearSearch(int[] arr, int key) {
        int index = -1;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key)
                index = i;
        return index;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 40, 30, 50 };
        int key = 30;
        System.out.println("Element found at index " + linearSearch(arr, key));
    }

}

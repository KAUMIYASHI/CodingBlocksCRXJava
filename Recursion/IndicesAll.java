
public class IndicesAll {

    public static int[] allElement(int[] arr, int startIndex, int key, int count) {
        if (startIndex == arr.length) {
            int base[] = new int[count];
            return base;
        }
        int indices[] = null;
        if (arr[startIndex] == key)
            indices = allElement(arr, startIndex + 1, key, count + 1);
        else
            indices = allElement(arr, startIndex + 1, key, count);

        if (arr[startIndex] == key)
            indices[count] = startIndex;

        return indices;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 8, 8, 3, 4, 5, 8, 7, 5 };
        // int arr[] = { 1, 1, 2, 2 };
        int ans[] = allElement(arr, 0, 8, 0);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}

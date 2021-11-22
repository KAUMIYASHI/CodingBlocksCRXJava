public class MinElementInArray {
    public static void main(String[] args) {
        int arr[] = { 10, 25, 18, 9, 7, 3 };
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }

        System.out.println("Min Element is " + min);
    }
}

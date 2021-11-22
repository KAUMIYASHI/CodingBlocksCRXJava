public class MaxElementInArray {
    public static void main(String[] args) {
        int arr[] = { 10, 25, 18, 9, 7, 3 };
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }

        System.out.println("Max Element is " + max);
    }

}
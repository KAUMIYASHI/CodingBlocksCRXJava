public class MergeSort {

    public static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = arr[mid + i + 1];
        }
        for (int i : L)
            System.out.print(i + " ");
        System.out.println();
        for (int i : R)
            System.out.print(i + " ");
        System.out.println("\n\n");

        int mergedArr[] = new int[n1 + n2];
        int i;
        int j, c = 0;
        for (i = 0, j = 0; i < n1 && j < n2;) {
            if (L[i] < R[j]) {
                mergedArr[c] = L[i];
                c++;
                i++;
            } else {
                mergedArr[c] = L[j];
                c++;
                j++;
            }
        }

        if (i < j) {
            while (i < n1) {
                mergedArr[c] = L[i];
                c++;
                i++;
            }
        } else {
            while (j < n2) {
                mergedArr[c] = L[j];
                c++;
                j++;
            }
        }

        for (int k = 0; k < n1 + n2; k++) {
            arr[l + i] = mergedArr[k];
        }

    }

    public static void mergeSort(int[] arr, int l, int r) {
        int mid = l + (r - l) / 2;
        if (l < r) {
            mergeSort(arr, mid + 1, r);
            mergeSort(arr, l, mid);
            merge(arr, l, mid, r);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 8, 1, 4 };
        mergeSort(arr, 0, arr.length - 1);
        for (int i : arr)
            System.out.print(i + " ");
    }

}

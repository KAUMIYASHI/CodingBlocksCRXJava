public class MergeSort {

    public static int[] merge(int[] L, int R[]) {
        int merged[] = new int[L.length + R.length];
        int i = 0, j = 0, c = 0;
        while (i < L.length && j < R.length) {
            if (L[i] < R[j]) {
                merged[c] = L[i];
                c++;
                i++;
            } else {
                merged[c] = R[j];
                c++;
                j++;
            }
        }

        if (i == L.length) {
            while (j < R.length) {
                merged[c] = R[j];
                c++;
                j++;
            }
        } else {
            while (i < L.length) {
                merged[c] = L[i];
                c++;
                i++;
            }
        }
        return merged;

    }

    public static int[] mergeSort(int[] arr, int l, int r) {
        int mid = (l + r) / 2;
        if (l == r) {
            int baseArr[] = new int[1];
            baseArr[0] = arr[l];
            return baseArr;
        }
        int L[] = mergeSort(arr, mid + 1, r);
        int R[] = mergeSort(arr, l, mid);
        int ans[] = merge(L, R);
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = { 8, 1, 4, 5, 7, 6, 9, 10 };
        int ans[] = mergeSort(arr, 0, arr.length - 1);
        for (int i : ans)
            System.out.print(i + " ");
    }

}

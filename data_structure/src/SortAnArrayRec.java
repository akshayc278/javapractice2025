public class SortAnArrayRec {

    public void sortArray(int[] arr, int s, int d) {
        if (d == arr.length) {
            return;
        }
        checkAndSwap(arr, s, d);
        sortArray(arr, 0, d + 1);
    }

    public void checkAndSwap(int arr[], int s, int d) {
        if (s >= d) {
            return;
        }
        if (arr[s] > arr[d]) {
            int value = arr[d];
            move(arr, s, d);
            arr[s] = value;

        }
        checkAndSwap(arr, s + 1, d);
    }

    public void move(int arr[], int s, int k) {
        if (s >= k) {
            return;
        }
        arr[k] = arr[k - 1];
        move(arr, s, k - 1);

    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 9, 1, 3, 2};
        SortAnArrayRec sortAnArrayRec = new SortAnArrayRec();
        sortAnArrayRec.sortArray(arr, 0, 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

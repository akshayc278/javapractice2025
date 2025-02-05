import java.util.Arrays;

public class QuickSort {
    public int partition(int arr[], int low, int high) {
        int i = low - 1;

        int pivot = arr[high];
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    public void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int[] quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
        return arr;
    }

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int[] arr = {45, 12, 11, 45, 61};
        int op[] = qs.quickSort(arr, 0, arr.length - 1);
        Arrays.stream(op).forEach(x -> System.out.print(x + " "));
    }
}

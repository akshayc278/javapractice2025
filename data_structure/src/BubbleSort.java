import java.util.Arrays;

public class BubbleSort {
    public int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int arr[] = {1, 22, 1, 23, 4, 5, 78};
        int[] op = bubbleSort.bubbleSort(arr);
        Arrays.stream(op).forEach(x -> System.out.print(x + " "));
    }
}

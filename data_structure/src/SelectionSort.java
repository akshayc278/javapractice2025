import java.util.Arrays;

public class SelectionSort {

    public int[] sort(int[] array) {
        int index = 0;

        while (index < array.length - 1) {
            int minIndex = index;
            for (int i = index + 1; i < array.length; i++) {
                if (array[i] < array[index]) {
                    minIndex = i;
                }
            }
            int temp = array[index];
            array[index] = array[minIndex];
            array[minIndex] = temp;
            index++;
        }
        return array;
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] array = {1, 4, 12, 1, 34, 51};
        int[] arrayOp = selectionSort.sort(array);
        Arrays.stream(arrayOp).forEach(x -> System.out.print(x + " "));
    }
}

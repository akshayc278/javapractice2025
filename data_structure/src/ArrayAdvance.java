import java.util.Arrays;

public class ArrayAdvance {
    public static void main(String[] args) {
        Integer[] inputArray = {3, 1, 4, 0, 6, 12, 0, 15};
        ArrayAdvance arrayAdvance = new ArrayAdvance();
        arrayAdvance.findMax(inputArray);
        arrayAdvance.moveZerosToEnd(inputArray);

    }

    public void reverseAnArray(Integer[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public void findMax(Integer[] array) {
        int max = 0;
        int secondMax = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            }
        }
        System.out.println("MAX" + max + " SecondMax" + secondMax);
    }

    public void moveZerosToEnd(Integer[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {

            if (array[start] == 0) {
                while (array[end] == 0) {
                    end--;
                }
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            }
            if (array[start] != 0) {
                start++;

            }
        }
        Arrays.stream(array).forEach(System.out::print);
    }
}

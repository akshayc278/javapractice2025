import java.util.Arrays;

public class ArrayDefinations {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[5];
        for (int i = 0; i < 5; i++) {
            intArray[i] = i + 11;
        }
        Arrays.stream(intArray).forEach(System.out::print);
        System.out.println();
        ArrayDefinations arrayDefinations = new ArrayDefinations();
        intArray = arrayDefinations.deleteFromArray(intArray, 2);
        Arrays.stream(intArray).forEach(System.out::print);
    }

    public void makeZeroAtIndex(Integer[] array, int index) {
        if (index <= array.length) {
            array[index] = 0;
        }
        //arrays are mutable so need of passing it in return
    }

    private Integer[] deleteFromArray(Integer[] array, int index) {
        Integer[] newArray = new Integer[array.length - 1];
        System.out.println(" " + array.length + "   " + newArray.length);
        if (index <= array.length) {
            for (int i = 0; i < array.length - 1; i++) {
                if (i >= index) {
                    newArray[i] = array[i + 1];
                } else {
                    newArray[i] = array[i];
                }
            }

        }
        //see the catch here you can return newArray or array ans is going to be same.
        // The main method referring obj@803 it will come here we will replace array with obj@804(newArray)
        // but the original address 803 still holds all values now in method 803 will get accessed
        // in memory 803 is still available so it will print if no reassigning happens in main class
        array = newArray;
        return array;
    }

    private Integer[] addAtFirst(Integer[] array, int value) {
        Integer[] newArray = new Integer[array.length + 1];
        newArray[0] = value;
        for (int i = 1; i < array.length + 1; i++) {
            newArray[i] = array[i - 1];
        }
        return newArray;
    }

    private Integer[] addAtIndex(Integer[] array, int index, int value) {
        Integer[] newArray = new Integer[array.length + 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = value;
        for (int i = index; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }
        return newArray;
        //we can use 1 loop but in both ways time complexity will be o(n)

    }
}

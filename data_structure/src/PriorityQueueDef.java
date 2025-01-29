public class PriorityQueueDef {

    Integer[] heap;
    int n;

    public PriorityQueueDef(int capacity) {
        heap = new Integer[capacity + 1];
        n = 0;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public void insert(int value) {
        if (n == heap.length - 1) {
            resize(2 * heap.length);
        }
        n++;
        heap[n] = value;
        swim(n);
    }

    public void swim(int k) {
        while (k > 1 && heap[k / 2] < heap[k]) {
            int temp = heap[k];
            heap[k] = heap[k / 2];
            heap[k / 2] = temp;
            k = k / 2;
        }
    }

    public void printValues(){
        for(int i=0;i<n;i++){
            System.out.print(heap[i]+" ");
        }
    }


    public void resize(int n) {
        Integer[] temp = new Integer[n];
        for (int i = 0; i < heap.length; i++) {
            temp[i] = heap[i];
        }
        heap = temp;
    }

    public static void main(String args[]) {
        PriorityQueueDef pdf = new PriorityQueueDef(5);
        System.out.println(pdf.size());
        pdf.insert(4);
        pdf.insert(3);
        pdf.insert(10);
        pdf.insert(1);
        pdf.printValues();
        System.out.println();

    }
}

public class SingleTonEx {

    private static SingleTonEx singleTonExInstance = null;
    public String s;

    private SingleTonEx() {
        s = "Hi Akshay";
    }

    public static synchronized SingleTonEx getInstance() {
        if (singleTonExInstance == null) {
            singleTonExInstance = new SingleTonEx();
        }
        return singleTonExInstance;
    }
}

class TestSingleTon {
    public static void main(String[] args) {
        // SingleTonEx singleTonEx0 = new SingleTonEx(); not work as constructor is private
        SingleTonEx singleTonEx1;//= new SingleTonEx();
        singleTonEx1 = SingleTonEx.getInstance();
        System.out.println(singleTonEx1);
        SingleTonEx singleTonEx2;//= new SingleTonEx();
        singleTonEx2 = SingleTonEx.getInstance();
        System.out.println(singleTonEx2);
    }
}

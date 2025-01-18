public class StringDefinations {
    public static void main(String[] args) {
        String str = "akshay";
        String str2 = "SOSOS";
        StringDefinations stringDefinations = new StringDefinations();
        System.out.println(stringDefinations.isPalindrom(str) + " " + stringDefinations.isPalindrom(str2));

    }

    private boolean isPalindrom(String str) {
        int n = str.length();
        boolean flag = true;
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}

public class TrieDf {
    class TrieDataSet {
        TrieDataSet[] tds;
        boolean isWord;

        public TrieDataSet() {
            tds = new TrieDataSet[26];
            isWord = false;
        }
    }

    TrieDataSet trieDataSet = new TrieDataSet();

    public void addWord(String input) {
        if (input.isEmpty()) {
            return;
        }
        int valueInArray = -1;
        TrieDataSet travalsal = trieDataSet;
        for (int i = 0; i < input.length(); i++) {
            valueInArray = input.charAt(i) - 'a';
            System.out.println("Value" + valueInArray);
            if (travalsal.tds[valueInArray] == null) {
                travalsal.tds[valueInArray] = new TrieDataSet();
                travalsal = travalsal.tds[valueInArray];
            } else {
                travalsal = travalsal.tds[valueInArray];
            }
        }
        travalsal.isWord = true;

    }

    public void checkIfword(String input) {
        int valueInArray = -1;
        TrieDataSet travalsal = trieDataSet;
        for (int i = 0; i < input.length(); i++) {
            valueInArray = input.charAt(i) - 'a';
            if (travalsal.tds[valueInArray] != null) {
                travalsal = travalsal.tds[valueInArray];
            }
        }
        if (travalsal.isWord) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }

    public static void main(String[] args) {
        TrieDf trieDf = new TrieDf();
        trieDf.addWord("akshay");
        trieDf.checkIfword("akshay");
    }
}

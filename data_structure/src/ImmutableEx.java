import java.util.*;

final class ImmutableEx {
    private String userName;
    private Map<String, Integer> data;
    private List<Integer> listOfOtherObj;

    public ImmutableEx(String userName, Map<String, Integer> data,List<Integer> listOfOtherObj) {
        this.userName = userName;
        //this.data=data; Make deep copy
        Map<String, Integer> deepCopy = new HashMap<>();
        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            deepCopy.put(entry.getKey(), entry.getValue());
        }
        this.data = deepCopy;

        this.listOfOtherObj = Collections.unmodifiableList(listOfOtherObj);
    }

    public String getUserName() {
        return userName;
    }

    public List<Integer> getListOfOtherObj() {
        List<Integer> deepCopy = new ArrayList<>();
        for (int i = 0; i < listOfOtherObj.size(); i++) {
            deepCopy.add(listOfOtherObj.get(i));
        }
        return deepCopy;

    }

    public Map<String, Integer> getData() {
        Map<String, Integer> deepCopy = new HashMap<>();
        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            deepCopy.put(entry.getKey(), entry.getValue());
        }
        return deepCopy;
    }

    @Override
    public String toString() {
        return "ImmutableEx{" +
                "userName='" + userName + '\'' +
                ", data=" + data +
                '}';
    }
}

class DemoExample {
    public static void main(String[] args) {
        HashMap<String, Integer> value = new HashMap<>();
        value.put("salary", 10000);
        ImmutableEx ix = new ImmutableEx("akshay", value,new LinkedList<>());
        //ix.put("salaryupdate",12000);
        System.out.println(ix.getData());
    }
}

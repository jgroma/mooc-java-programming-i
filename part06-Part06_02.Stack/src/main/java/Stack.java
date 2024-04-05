import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stackList;

    public Stack() {
        this.stackList = new ArrayList<>();
    }

    public boolean isEmpty() {
        if (stackList.size() == 0) return true;
        return false;
    }

    public void add(String value) {
        this.stackList.add(value);
    }

    public ArrayList<String> values() {
        return this.stackList;
    }

    public String take() {
        return this.stackList.remove(stackList.size()-1);
    }
}

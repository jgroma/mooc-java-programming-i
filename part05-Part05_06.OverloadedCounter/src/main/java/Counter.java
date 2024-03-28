public class Counter {
    private int currentValue;

    public Counter(int startValue) {
        this.currentValue = startValue;
    }

    public Counter() {
        this.currentValue = 0;
    }

    public int value() {
        return this.currentValue;
    }

    public void increase() {
        this.currentValue += 1;
    }

    public void increase (int increaseBy) {
        if (increaseBy > 0) this.currentValue += increaseBy;
    }

    public void decrease() {
        this.currentValue -= 1;
    }

    public void decrease(int decreaseBy) {
        if(decreaseBy > 0) this.currentValue -= decreaseBy;
    }
}

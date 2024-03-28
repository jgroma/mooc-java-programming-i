public class Timer {
    private int hundredthsOfSecond;
    private int seconds;

    public Timer() {
        this.hundredthsOfSecond = 0;
        this.seconds = 0;
    }

    public void advance() {
        if (this.hundredthsOfSecond < 99) {
            this.hundredthsOfSecond += 1;
        } else {
            this.hundredthsOfSecond = 0;
            if (this.seconds < 59) {
                this.seconds += 1;

            } else {
            this.seconds = 0;
            }
        }
    }

    @Override
    public String toString() {
        if (this.seconds < 10 && this.hundredthsOfSecond < 10) {
            return "0" + this.seconds + ":" + "0" + this.hundredthsOfSecond;
        } else if (this.seconds < 10) {
            return "0" + this.seconds + ":" + this.hundredthsOfSecond;
        } else if (this.hundredthsOfSecond < 10) {
            return this.seconds + ":" + "0" + this.hundredthsOfSecond;
        } else {
            return this.seconds + ":" + this.hundredthsOfSecond;
        }
    }
}

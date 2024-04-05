import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> packageContents;

    public Package() {
        this.packageContents = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        this.packageContents.add(gift);
    }

    public int totalWeight() {
        int total = 0;

        for (Gift gift: this.packageContents) {
            total += gift.getWeight();
        }

        return total;
    }
}

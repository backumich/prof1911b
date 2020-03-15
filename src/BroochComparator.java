import java.util.Comparator;

public class BroochComparator implements Comparator<Listener> {
    @Override
    public int compare(Listener o1, Listener o2) {

        if (o1.getBrooch()==o2.getBrooch()) {
            return 0;
        }
        if (o1.getBrooch()<o2.getBrooch()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}

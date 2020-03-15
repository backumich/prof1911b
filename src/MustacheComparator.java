import java.util.Comparator;

public class MustacheComparator implements Comparator<Listener> {

    @Override
    public int compare(Listener o1, Listener o2) {

        if (o1.getMustache()==o2.getMustache()) {
            return 0;
        }
        if (o1.getMustache()<o2.getMustache()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}

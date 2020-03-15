import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        Listener listener1 = new Listener("John","gentleman",0,14);
        Listener listener2 = new Listener("Sam","gentleman",0,15);
        Listener listener3 = new Listener("Richard","gentleman",0,12);
        Listener listener4 = new Listener("Nelly","lady",15,0);
        Listener listener5 = new Listener("Nataly","lady",20,0);
        Listener listener6 = new Listener("Nady","lady",14,0);

        TreeSet<Listener>turnCash = new TreeSet<>(Collections.reverseOrder());
        turnCash.add(listener1);
        turnCash.add(listener2);
        turnCash.add(listener3);
        turnCash.add(listener4);
        turnCash.add(listener5);
        turnCash.add(listener6);
        System.out.println("Comparable");

        for ( Listener br: turnCash) {

            System.out.println(br.toString());
        }

        ArrayList<Listener>list = new ArrayList<>();

        list.add(listener1);
        list.add(listener2);
        list.add(listener3);
        list.add(listener4);
        list.add(listener5);
        list.add(listener6);
        BroochComparator broochComparator = new BroochComparator();
        MustacheComparator mustacheComparator = new MustacheComparator();
        list.sort(mustacheComparator);
        list.sort(broochComparator);
        System.out.println();
        System.out.println();
        System.out.println("Comparator");
        for (Listener o : list ) {
            System.out.println(o);
        }
        System.out.println();
        System.out.println("Stream:");
        list.stream().sorted().collect(Collectors.toList());
        list.forEach(System.out::println);

        System.out.println();
        System.out.println("Stream sort:");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }
}

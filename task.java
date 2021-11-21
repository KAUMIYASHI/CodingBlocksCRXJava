import java.util.*;
import java.util.ListIterator;

public class task {

    public static long minTime(List<Integer> batchSize, List<Integer> processingTime, List<Integer> numTask) {
        ListIterator<Integer> bIt = batchSize.listIterator();
        ListIterator<Integer> pIt = processingTime.listIterator();
        ListIterator<Integer> tIt = numTask.listIterator();
        List<Integer> numberOftimes = new LinkedList<Integer>();
        while (bIt.hasNext()) {
            double x = tIt.next();
            double y = x / bIt.next();
            int n = (int) Math.ceil(y);
            // int n = tIt.next() / bIt.next();
            numberOftimes.add(n);
        }

        List<Integer> timeReq = new LinkedList<Integer>();
        ListIterator<Integer> x = numberOftimes.listIterator();

        while (pIt.hasNext()) {
            timeReq.add((pIt.next() * x.next()));
        }

        return Collections.max(timeReq, null);

    }

    public static void main(String[] args) {

        List<Integer> list1 = List.of(3, 2, 5, 7);
        List<Integer> list2 = List.of(5, 4, 10, 12);
        List<Integer> list3 = List.of(10, 6, 10, 5);
        System.out.println(minTime(list1, list2, list3));
    }
}

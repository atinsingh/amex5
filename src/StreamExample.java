import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 3, 5, 5, 6, 7, 8, 9,10,12);
        Set<Integer> set = list.stream().collect(Collectors.toSet());
        //System.out.println(set.getClass());
        LinkedList<Integer> linkedList = list.stream().collect(Collectors.toCollection(LinkedList::new));
        TreeSet<Integer> collect = list.stream().collect(Collectors.toCollection(TreeSet::new));

        long count = list.stream().filter(i -> i % 2 == 0).count();
        System.out.println("count = " + count);
        Long counting = list.stream().filter(i -> i % 2 == 0).collect(Collectors.counting());
        System.out.println("counting = " + counting);
        Optional<Integer> min = list.stream().max(Comparator.comparingInt(i -> i));
        System.out.println("min.get() = " + min.get());
        Optional<Integer> integer = list.stream().collect(Collectors.maxBy(Comparator.naturalOrder()));
        System.out.println("integer = " + integer.get());

        Map<Boolean, List<Integer>> map = list.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println(map);

        List<String> strings = Arrays.asList("Vivek", "Rocio", "Loue");

        String string = strings.stream().collect(Collectors.joining(","));
        Double avg = list.stream().collect(Collectors.averagingInt(Integer::intValue));
        System.out.println(avg);
        IntSummaryStatistics summary = list.stream().collect(Collectors.summarizingInt(Integer::intValue));

        System.out.println(summary);

        DoubleSummaryStatistics statistics = list.stream().collect(Collectors.summarizingDouble(Double::valueOf));


        System.out.println(statistics);





        System.out.println(string);
    }
}

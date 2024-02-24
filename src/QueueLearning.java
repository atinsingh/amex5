import java.util.*;

public class QueueLearning {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();
        map.put(1,"Adam");
        map.put(2,"John");
        map.put(2,"Isha");
        //map.put(null,"Isha");
        System.out.println("map.get(2) = " + map.get(2));
        System.out.println("map.containsValue(\"Isha\") = " + map.containsValue("Isha"));
        System.out.println("map.containsKey(2) = " + map.containsKey(2));

        Set<Integer> integers = map.keySet();
        Collection<String> values = map.values();

        System.out.println(integers);
        System.out.println("values = " + values);

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(100,"Mitesh");
        map1.put(101,"Mukesh");
        map1.put(102,"Vinny");

        map.putAll(map1);
        map.putIfAbsent(10,"Jimmy");
        Map<String, String> map2 = new HashMap<>();
        System.out.println(map2.isEmpty());
        map.compute(20, (k,v)->v==null?"Dummy"+1: v+1);
        map.computeIfAbsent(10, k-> String.valueOf(k));
        map.forEach(  ( k,v)-> System.out.println("Key " + k + " Value " + v)   ) ;

        String st  =  "Atin";
        String.valueOf(st.charAt(0));
        st.substring(0,1);
        for(Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println("key ===> "+ entry.getKey() + " value ===> "+ entry.getValue()) ;
        }


        System.out.println(map);



    }
}

import java.util.*;
import java.util.function.Predicate;

// Data Structure
//
public class Main {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Aguasta");
        names.add("Mat");
        names.add("John");
        System.out.println(names);
        System.out.println(names.size());
        names.add(3,"Rocio");
        System.out.println(names);
//        for (int i = 0; i<1000000; i++){
//            names.add("Test"+i);
//        }
        System.out.println(names);
        System.out.println("names.get(2) = " + names.get(2));
        System.out.println("Before :  " + names);
         names.add(2, "Isha");
        System.out.println("After : " + names);

        Collections.sort(names);

        List<String> vipNames = Arrays.asList("Patrick","Sam","Julina","Rocio");
        List<String> vipNames2 = Arrays.asList("Rocio","Sam");


        

        names.addAll(0,vipNames);
        System.out.println(names);
        names.removeIf(s->s.length()>=4);
       /// names.retainAll(vipNames2);
        System.out.println(names);
        names.add(null);
        names.add(null);
        names.add(null);
        names.add(null);

        for (String name: names) {
            System.out.println(name);
        }

        for (int i = 0; i < names.size(); i++) {

            if(i==2){
                names.remove(i);
            }
            System.out.println(names.get(i));
        }

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }



        Set<Employee> employees = new TreeSet<>();
        employees.add(new Employee("Adam",20));
        employees.add(new Employee("Adam",20));
        employees.add(new Employee("Adam",20));
        employees.add(new Employee("Adam",20));
        employees.add(new Employee("mat",30));
        employees.add(new Employee("John",22));
        employees.add(new Employee("Jean",32));


//        List<Manager> managers = Arrays.asList(new Manager("Atin",40,"ABC"),new Manager("Vivek",35,"Sales"));
//
//        employees.addAll(managers);
//        System.out.println("employees = " + employees);

        Object[] array = names.toArray();

        System.out.println(array);


        System.out.println(employees);
        Set<String> guests = new TreeSet<>(); // No null allowes
        guests.add("Adam");
        guests.add("John");
        guests.add("Atin");
        guests.add("Atin");

        System.out.println(guests);




    }
}

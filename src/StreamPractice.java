import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {
        Stream<String>  stream = Stream.of("Pizza","Pasta","Noodles","Pasta", "Chicken");
        List<String> collect = stream.map(s -> s.toUpperCase()).distinct().collect(Collectors.toList());
        System.out.println(collect);

        List<Dish>dishes = new ArrayList<>();
        dishes.add(new Dish( "Samosa", 1.5, DishType.VEG, Arrays.asList("Potato","Peas","Salt"),true));
        dishes.add(new Dish( "Butter Chicken", 22.5, DishType.NON_VEG, Arrays.asList("Chicken","Tomato","Salt","Butter"),true));
        dishes.add(new Dish( "Mutton Masala", 30.5, DishType.NON_VEG, Arrays.asList("Goat","Tomato","Salt","Butter"),true));
        dishes.add(new Dish( "Butter Paneer", 20.5, DishType.VEG, Arrays.asList("Tomato","Salt","Butter","Paneer"),false));
        dishes.add(new Dish( "Pasta", 1.5, DishType.NON_VEG, Arrays.asList("Pasta","Sauce","Salt"),false));
        dishes.add(new Dish( "Sandwich", 1.5, DishType.VEG, Arrays.asList("Bread","Cheez","Lettuce","Tomato"),true));
        dishes.add(new Dish( "Avacado Toast", 1.5, DishType.VEGAN, Arrays.asList("Avacado","Bread","Salt"),true));

        //
        List<String> list = dishes.stream().map(Dish::getName).collect(Collectors.toList());

        List<List<String>> collect1 = dishes.stream().map(dish -> dish.getIngredients()).collect(Collectors.toList());

        List<String> ingredients = dishes.stream().flatMap(dish -> dish.getIngredients().stream()).distinct().sorted().collect(Collectors.toList());
        Set<Dish> dishSet = dishes.stream().collect(Collectors.toSet());
        System.out.println(ingredients);


        Map<String, Double> dishMap = dishes.stream().collect(Collectors.toMap(Dish::getName, Dish::getPrice));

        System.out.println(dishMap);
        Map<DishType, List<Dish>> map = dishes.stream().collect(Collectors.groupingBy(Dish::getDishType));
        System.out.println("map = " + map);

        List<Integer> list1 = Arrays.asList(1, 2, 4, 5, 5, 6, 6);

        Integer reduce = list1.stream().reduce(1, (a, b) -> a * b);
        System.out.println(reduce);
        Integer integer = list1.stream().reduce(0, (a, b) -> a + b);
        System.out.println("integer = " + integer);
        Optional<String> optionalS = Optional.of("Atin");
        printGreeting(Optional.of("isha"));

    }

    public static void printGreeting(Optional<String> name){
        System.out.println("Hello " + name.orElse("Human").toUpperCase() + " How ar you");
       //name.ifPresent(s-> System.out.println("Hello "+s.toUpperCase() +" How are you"));
    }
}

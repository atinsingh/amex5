import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

        List<Dish> vegDish = dishes.stream().filter(d -> d.getDishType() == DishType.VEG).collect(Collectors.toList());
        System.out.println(vegDish);
        String string = dishes.stream().filter(d -> d.getDishType() == DishType.VEG).map(dish -> dish.getName()).collect(Collectors.joining(","));
        System.out.println(string);

        List<Dish> costLy = dishes.stream().filter(d -> d.getDishType() == DishType.NON_VEG).filter(d -> d.getPrice() > 20)
                .collect(Collectors.toList());
        System.out.println(costLy);

        List<Double> prices = dishes.stream().map(d -> d.getPrice()).collect(Collectors.toList());
        System.out.println(prices);

        boolean match = dishes.stream().anyMatch(d -> d.getDishType() == DishType.VEG);

        System.out.println(match);
        long count = dishes.stream().filter(d -> d.getDishType() == DishType.NON_VEG).filter(d -> d.getPrice() > 20).count();
        System.out.println(count);


    }
}

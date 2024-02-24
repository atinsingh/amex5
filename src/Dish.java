import java.util.List;

public class Dish {
    private String name;
    private double price;

    private DishType dishType;

    private List<String> ingredients;
    private boolean isFav;

    public Dish(String name, double price, DishType dishType, List<String> ingredients, boolean isFav) {
        this.name = name;
        this.price = price;
        this.dishType = dishType;
        this.ingredients = ingredients;
        this.isFav = isFav;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public DishType getDishType() {
        return dishType;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public boolean isFav() {
        return isFav;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", dishType=" + dishType +
                ", ingredients=" + ingredients +
                ", isFav=" + isFav +
                '}';
    }
}

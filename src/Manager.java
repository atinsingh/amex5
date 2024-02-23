public class Manager extends Employee{
    private String desination;

    public Manager(String name, int age, String desination) {
        super(name, age);
        this.desination = desination;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "desination='" + desination + '\'' +
                '}';
    }
}

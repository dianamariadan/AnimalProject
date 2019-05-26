public class Dog implements Animal {

    private String name = "Dog";

    @Override
    public String sound() {
        return "Wuf";
    }

    @Override
    public String getName() {
        return name;
    }
}

public class Cat  implements Animal{

    private String name = "Cat";

    @Override
    public String sound() {
        return "Meaow";
    }

    @Override
    public String getName() {
        return name;
    }
}

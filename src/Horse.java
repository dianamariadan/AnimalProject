class Horse implements Animal {
    private String name = "Horse";

    @Override
    public String sound() {
        return "Neigh";
    }

    @Override
    public String getName() {
        return name;
    }
}

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(new Horse());
        animalList.add(new Cat());
        animalList.add(new Dog());

        for( int i = 0 ; i < animalList.size(); i++){
            Animal animal = animalList.get(i);
            System.out.println(animal.getName() + " makes " + animal.sound());
        }

    }
}

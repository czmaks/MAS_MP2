import java.util.ArrayList;
import java.util.List;

public class Breed {
    private String name;
    private List<Animal> animals = new ArrayList<>();

    public Breed(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "Breed{" +
                "name='" + name + '\'' +
                ", animals=" + animals +
                '}';
    }
}

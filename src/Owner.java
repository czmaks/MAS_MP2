import java.util.ArrayList;
import java.util.List;

public class Owner {
    private List<Animal> animals = new ArrayList<>();

    private List<Home> homes = new ArrayList<>();
    private String name;
    private String surname;

    public Owner(String name, String surname ){
        this.name = name;
        this.surname = surname;

    }

    public void addHome(Home home) throws Exception {
        if(!homes.contains(home)) {
            homes.add(home);
        }
    }

    public void addAnimal(Animal newAnimal) {
        if(!animals.contains(newAnimal)) {
            animals.add(newAnimal);
            newAnimal.addOwner(this);
        }
    }

    public Animal findAnimal(String name) throws Exception{
        for(Animal animal : animals){
            if(animal.getName() != name) {
                throw new Exception("This owner doesn't have any animal, name: " + this.getName());
            }else{
                return animal;
            }
        }
        return null;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        String info = "Owner: " + getName() + " " + getSurname() + "\n";

        info += "animals: " + "\n";

        for(Animal animal : animals) {
            info += " " + animal.getName() + "\n";
        }

        info += "homes: " + "\n";

        for(Home home : homes) {
            info += " " + home.getStreet() + "\n";
        }

        return info;
    }
}

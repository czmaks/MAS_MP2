import java.util.ArrayList;
import java.util.List;

public class Animal { // aniamal z owner asocjacja kwalifikowana
    private List<Owner> owners = new ArrayList<>(); //asocjajca kwalifikowana
    private List<Breed> breeds = new ArrayList<>(); //asocjacja zwykła
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void addOwner(Owner newOwner) {
        if(!owners.contains(newOwner)) {
            owners.add(newOwner);
            newOwner.addAnimal(this);
        }
    }

    public Owner findOwner(String surname) throws Exception{
        for(Owner owner : owners) {
            if(owner.getSurname() != surname){
                throw new Exception("This animal is homeless, name: " + this.getName());
            }else {
                return owner;
            }
        }
        return null;
    }

    public List<Owner> getOwners() {
        return owners;
    }

    public void setOwners(List<Owner> owners) {
        this.owners = owners;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Breed> getBreeds() {
        return breeds;
    }

    public void setBreeds(List<Breed> breeds) {
        this.breeds = breeds;
    }

    @Override
    public String toString() {
        String info = "Animal: " + getBreeds() + " " + getName() + " " + getAge() + "\n";

        for(Owner owner : owners) {
            info += " " + owner.getName() + "\n";
        }

        return info;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private List<Owner> owners = new ArrayList<>();
    private String type;
    private String name;
    private int age;

    public Animal(String type, String name, int age) {
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    @Override
    public String toString() {
        String info = "Animal: " + getType() + " " + getName() + " " + getAge() + "\n";

        for(Owner owner : owners) {
            info += " " + owner.getName() + "\n";
        }

        return info;
    }
}

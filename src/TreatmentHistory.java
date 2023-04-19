import java.util.Date;

public class TreatmentHistory {
    private Animal animal;
    private Owner owner;
    private Date lastVisit;
    private Date nextVisit;

    public TreatmentHistory(Animal animal, Owner owner, Date lastVisit) {
        this.animal = animal;
        this.owner = owner;
        this.lastVisit = lastVisit;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Date getLastVisit() {
        return lastVisit;
    }

    public void setLastVisit(Date lastVisit) {
        this.lastVisit = lastVisit;
    }

    public Date getNextVisit() {
        return nextVisit;
    }

    public void setNextVisit(Date nextVisit) {
        this.nextVisit = nextVisit;
    }

    @Override
    public String toString() {
        return "TreatmentHistory of: " +
                  animal.getName() +
                ", owner: " + owner.getName() + " " + owner.getSurname() +
                ", lastVisit: " + lastVisit.getDate() + "-" + lastVisit.getMonth() + "-" + lastVisit.getYear() +
                ", nextVisit: " + nextVisit +
                '}';
    }
}

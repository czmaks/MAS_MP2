public class Home {  //kompozycja z owner, home nie moze istniec bez wlasciciela, nie tak jak zwierze
    private String street;
    private Owner owner;

    private Home(String street, Owner owner) {
        this.street = street;
        this.owner = owner;
    }

    public static Home createHome(String street, Owner owner) throws Exception{
        if(owner == null) {
            throw new Exception("Place can't be called home when it's no ones!");
        }
        Home home = new Home(street, owner);

        owner.addHome(home);

        return home;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Home{" +
                "street='" + street + '\'' +
                ", owner=" + owner +
                '}';
    }
}

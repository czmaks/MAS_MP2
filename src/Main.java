import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {

        Owner o1 = new Owner("Maks", "Kowalski");
        Owner o2 = new Owner("Alicja", "Nomak");

        Animal a1 = new Animal("Plamka", 3);
        Animal a2 = new Animal("Typek", 5);
        Animal a3 = new Animal("Reks", 6);

        a1.setBreeds(Arrays.asList(new Breed("Mieszaniec")));

        TreatmentHistory th1 = new TreatmentHistory(a1, o1, new Date(2023, 03, 20));

        o1.addAnimal(a1);
        o2.addAnimal(a2);
        o2.addAnimal(a3);

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        System.out.println(th1 + "\n");
        System.out.println(a1.findOwner("Kowalski"));
        System.out.println(o1.findAnimal("Plamka"));

        Home h1 = Home.createHome("Szkolna 4", o1);

        System.out.println(h1);
        System.out.println(o1);
    }
}
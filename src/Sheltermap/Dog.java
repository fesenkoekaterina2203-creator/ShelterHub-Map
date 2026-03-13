package Sheltermap;

public class Dog extends Animal {
    public Dog(String id, String name, String breed, int age, String temperament) {
        super(id, name, breed, age, temperament);
    }

    @Override
    public String getType() {
        return "DOG";
    }
}
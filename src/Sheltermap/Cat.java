package Sheltermap;

public class Cat extends Animal {
    public Cat(String id, String name, String breed, int age, String temperament) {
        super(id, name, breed, age, temperament);
    }

    @Override
    public String getType() {
        return "CAT";
    }
}
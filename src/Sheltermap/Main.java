package Sheltermap;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Shelter shelter = new Shelter();
        shelter.addAnimal(new Dog("d1", "Рекс", "Овчарка", 2, "дети-да,кошки-да"));
        shelter.addAnimal(new Cat("c1", "Мурка", "Британка", 3, "дети-да,собаки-нет"));
        shelter.addAnimal(new Dog("d2", "Бим", "Лабрадор", 1, "дети-да,кошки-нет"));
        shelter.printAll();
        System.out.println("Всего животных: " + shelter.getTotalCount());
        shelter.findByMaxAge(2);
        shelter.findKidsFriendly();
        Animal rex = shelter.findById("d1");
        System.out.println("Поиск по ID: " + rex.getName());
    }
}

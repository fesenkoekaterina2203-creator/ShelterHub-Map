package Sheltermap;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Shelter shelter = new Shelter();
        shelter.addAnimal(new Dog("d1", "Рекс", "Овчарка", 2, "дружелюбный"));
        shelter.addAnimal(new Cat("c1", "Мурка", "Британка", 3, "агрессивный"));
        shelter.addAnimal(new Dog("d2", "Бим", "Лабрадор", 1, "спокойный"));
        shelter.addAnimal(new Dog("d3", "Бом", "Пекинес", 4, "спокойный"));
        shelter.addAnimal(new Cat("c2", "Кузя", "Сиамский", 1, "дружелюбный"));

        shelter.printAll();
        System.out.println("Всего животных: " + shelter.getTotalCount());
        shelter.findByMaxAge(2);
        shelter.findKidsFriendly();
        Animal rex = shelter.findById("d1");
        System.out.println("Поиск по ID: " + rex.getName());
    }
}

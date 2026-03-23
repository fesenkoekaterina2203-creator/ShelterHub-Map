package Sheltermap;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;


public class Shelter {
    private List<Animal> animals = new ArrayList<>();
    private Map<String, Animal> animalsById = new HashMap<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
        animalsById.put(animal.getId(), animal);
        System.out.println("Добавлено: " + animals.size());
    }
    public Animal findById(String id) {
        return animalsById.get(id);
    }

    public void printAll() {
        System.out.println("\n=== ВСЕ ЖИВОТНЫЕ В ПРИЮТЕ ===");
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " | " +
                    animal.getType() + " | " +
                    animal.getBreed() + " | " +
                    animal.getAge() + " лет");
        }
    }
    public int getTotalCount() {
        return animals.size();
    }
    public void findByMaxAge(int maxAge) {
        System.out.println("\n=== ЖИВОТНЫЕ ДО " + maxAge + " ЛЕТ ===");
        for (Animal animal : animals) {
            if (animal.getAge() <= maxAge) {
                System.out.println(animal.getName() + " | " + animal.getAge() + " лет");
            }
        }
    }
        public void findKidsFriendly () {
            System.out.println("\n=== ДРУЖИТ С ДЕТЬМИ ===");
            animals.stream()
                    .filter( a -> a.getTemperament().toLowerCase().contains("дружелюбный") ||
                            a.getTemperament().toLowerCase().contains("спокойный") )
                    .map( a -> a.getName() + " (" + a.getType() + ")" )
                    .forEach( строка -> System.out.println("✓ " + строка) );
        }


        }


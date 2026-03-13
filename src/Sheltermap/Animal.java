package Sheltermap;



public abstract class Animal {
    protected final String id;
    protected final String name;
    protected final String breed;
    protected final int age;
    protected final String temperament;

    public Animal(String id, String name, String breed, int age, String temperament) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.temperament = temperament;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getBreed() { return breed; }
    public int getAge() { return age; }
    public String getTemperament() { return temperament; }

    public abstract String getType();
}

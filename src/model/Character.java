package Chars;

/**
 * Base Character class representing beings in Middle-earth
 */
public class Character {
    private String name;
    private String race;
    private int age;
    private String location;

    /**
     * Constructor for Character
     */
    public Character(String name, String race, int age, String location) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.location = location;
    }

    /**
     * Get character's name
     */
    public String getName() {
        return name;
    }

    /**
     * Set character's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get character's race
     */
    public String getRace() {
        return race;
    }

    /**
     * Set character's race
     */
    public void setRace(String race) {
        this.race = race;
    }

    /**
     * Get character's age
     */
    public int getAge() {
        return age;
    }

    /**
     * Set character's age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Get character's location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Set character's location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Character speaks
     */
    public void speak(String words) {
        System.out.println(name + " (" + race + ") says: \"" + words + "\"");
    }

    /**
     * Character moves to a new location
     */
    public void move(String newLocation) {
        System.out.println(name + " moves from " + location + " to " + newLocation);
        this.location = newLocation;
    }

    /**
     * Character rests
     */
    public void rest() {
        System.out.println(name + " rests in " + location);
    }

    @Override
    public String toString() {
        return name + " (" + race + "), Age: " + age + ", Location: " + location;
    }
}

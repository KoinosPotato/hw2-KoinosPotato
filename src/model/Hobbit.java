package model;

/**
 * Hobbit class representing hobbits of the Shire
 * Extends FellowshipMember
 */
public class Hobbit extends FellowshipMember {
    private double height;
    private boolean hasOneRing;
    private int resistanceLevel;

    /**
     * Constructor for Hobbit
     */
    public Hobbit(String name, int age, String location, String role, double height) {
        super(name, "Hobbit", age, location, role);
        this.height = height;
        this.hasOneRing = false;
        this.resistanceLevel = 100;
    }

    /**
     * Get hobbit's height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Check if hobbit has the One Ring
     */
    public boolean hasOneRing() {
        return hasOneRing;
    }

    /**
     * Hobbit obtains the One Ring
     */
    public void obtainRing(OneRing ring) {
        this.hasOneRing = true;
        ring.setWearer(this);
        System.out.println(getName() + " obtains the One Ring!");
    }

    /**
     * Hobbit destroys the One Ring
     */
    public void destroyRing(OneRing ring) {
        if (hasOneRing) {
            System.out.println(getName() + " destroys the One Ring in the fires of Mount Doom!");
            this.hasOneRing = false;
            ring.setWearer(null);
        } else {
            System.out.println(getName() + " does not have the One Ring to destroy");
        }
    }

    /**
     * Hobbit resists the ring's corruption
     */
    public void resist() {
        System.out.println(getName() + " resists the ring's corruption. Resistance Level: " + resistanceLevel);
        if (hasOneRing) {
            resistanceLevel -= 10;
            System.out.println("The Ring's influence weakens resistance to: " + resistanceLevel);
        }
    }

    /**
     * Hobbit hides the ring
     */
    public void hideRing() {
        if (hasOneRing) {
            System.out.println(getName() + " hides the One Ring carefully");
        }
    }

    /**
     * Hobbit eats (hobbits are known for eating)
     */
    public void eat() {
        System.out.println(getName() + " enjoys a meal with mushrooms and pipeweed");
    }

    @Override
    public String toString() {
        return super.toString() + ", Height: " + height + " feet, Has One Ring: " + hasOneRing;
    }
}

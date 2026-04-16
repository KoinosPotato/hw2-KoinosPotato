package model;

/**
 * Human class representing humans of Middle-earth
 * Extends FellowshipMember
 */
public class Human extends FellowshipMember {
    private String kingdom;
    private int strength;
    private String swordType;

    /**
     * Constructor for Human
     */
    public Human(String name, int age, String location, String role, String kingdom, String swordType) {
        super(name, "Human", age, location, role);
        this.kingdom = kingdom;
        this.strength = 90;
        this.swordType = swordType;
    }

    /**
     * Get human's kingdom
     */
    public String getKingdom() {
        return kingdom;
    }

    /**
     * Get human's strength level
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Get human's sword type
     */
    public String getSwordType() {
        return swordType;
    }

    /**
     * Human leads the group
     */
    public void lead() {
        System.out.println(getName() + " of " + kingdom + " leads the Fellowship forward");
    }

    /**
     * Human defends allies
     */
    public void defend(String ally) {
        System.out.println(getName() + " places himself between " + ally + " and danger");
    }

    /**
     * Human swings sword
     */
    public void swingSword(String enemy) {
        System.out.println(getName() + " swings " + swordType + " sword at " + enemy + " with great force!");
    }

    /**
     * Human rides a horse
     */
    public void rideHorse(String horseName) {
        System.out.println(getName() + " mounts " + horseName + " and rides forth");
    }

    /**
     * Human displays noble bearing
     */
    public void displayNobleBearing() {
        System.out.println(getName() + " stands tall as the rightful King of Gondor and Arnor");
    }

    @Override
    public String toString() {
        return super.toString() + ", Kingdom: " + kingdom + ", Sword: " + swordType + 
               ", Strength: " + strength;
    }
}

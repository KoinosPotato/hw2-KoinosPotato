package Chars;

/**
 * FellowshipMember class representing members of the Fellowship of the Ring
 * Extends Character with fellowship-specific attributes
 */
public class FellowshipMember extends Character {
    private String role;
    private boolean isAlive;

    /**
     * Constructor for FellowshipMember
     */
    public FellowshipMember(String name, String race, int age, String location, String role) {
        super(name, race, age, location);
        this.role = role;
        this.isAlive = true;
    }

    /**
     * Get fellowship member's role
     */
    public String getRole() {
        return role;
    }

    /**
     * Set fellowship member's role
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Check if fellowship member is alive
     */
    public boolean isAlive() {
        return isAlive;
    }

    /**
     * Fellowship member performs their role
     */
    public void performRole() {
        System.out.println(getName() + " (" + getRole() + ") performs their duty in the Fellowship");
    }

    /**
     * Fellowship member fights
     */
    public void fight(String enemy) {
        if (isAlive) {
            System.out.println(getName() + " (" + getRole() + ") fights against " + enemy);
        } else {
            System.out.println(getName() + " cannot fight because they have fallen...");
        }
    }

    /**
     * Fellowship member falls in battle
     */
    public void fall() {
        System.out.println(getName() + " has fallen in battle...");
        this.isAlive = false;
    }

    @Override
    public String toString() {
        return super.toString() + ", Role: " + role + ", Alive: " + isAlive;
    }
}

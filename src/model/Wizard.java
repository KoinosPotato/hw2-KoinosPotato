package Chars;

/**
 * Wizard class representing wizards of Middle-earth
 * Extends FellowshipMember
 */
public class Wizard extends FellowshipMember {
    private int magicPower;
    private String staffColor;
    private String specialization;

    /**
     * Constructor for Wizard
     */
    public Wizard(String name, int age, String location, String role, String staffColor, String specialization) {
        super(name, "Wizard", age, location, role);
        this.magicPower = 100;
        this.staffColor = staffColor;
        this.specialization = specialization;
    }

    /**
     * Get wizard's magic power level
     */
    public int getMagicPower() {
        return magicPower;
    }

    /**
     * Get wizard's staff color
     */
    public String getStaffColor() {
        return staffColor;
    }

    /**
     * Get wizard's specialization
     */
    public String getSpecialization() {
        return specialization;
    }

    /**
     * Wizard casts a spell
     */
    public void castSpell(String spellName, String target) {
        System.out.println(getName() + " casts " + spellName + " at " + target + " with " + magicPower + "% power!");
        magicPower -= 20;
    }

    /**
     * Wizard summons aid
     */
    public void summon(String creature) {
        System.out.println(getName() + " summons " + creature + " to aid the Fellowship");
    }

    /**
     * Wizard provides wisdom
     */
    public void provideWisdom(String advice) {
        System.out.println(getName() + " imparts wisdom: \"" + advice + "\"");
    }

    /**
     * Wizard restores magic power
     */
    public void rest() {
        super.rest();
        magicPower = 100;
        System.out.println(getName() + " has restored their magic power!");
    }

    /**
     * Wizard confronts evil
     */
    public void confrontEvil(String evil) {
        System.out.println(getName() + " stands against " + evil + " with the power of fire and light!");
    }

    @Override
    public String toString() {
        return super.toString() + ", Specialization: " + specialization + ", Staff Color: " + staffColor + 
               ", Magic Power: " + magicPower;
    }
}

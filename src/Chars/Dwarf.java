package Chars;

/**
 * Dwarf class representing dwarves of Middle-earth
 * Extends FellowshipMember
 */
public class Dwarf extends FellowshipMember {
    private int beardLength;
    private String axeType;
    private int miningSkill;
    private String clan;

    /**
     * Constructor for Dwarf
     */
    public Dwarf(String name, int age, String location, String role, String clan, String axeType) {
        super(name, "Dwarf", age, location, role);
        this.beardLength = 50;
        this.axeType = axeType;
        this.miningSkill = 85;
        this.clan = clan;
    }

    /**
     * Get dwarf's beard length
     */
    public int getBeardLength() {
        return beardLength;
    }

    /**
     * Get dwarf's axe type
     */
    public String getAxeType() {
        return axeType;
    }

    /**
     * Get dwarf's clan
     */
    public String getClan() {
        return clan;
    }

    /**
     * Dwarf mines for ore
     */
    public void mine() {
        System.out.println(getName() + " mines for precious metals! Skill Level: " + miningSkill);
    }

    /**
     * Dwarf forges weapons
     */
    public void forge(String weapon) {
        System.out.println(getName() + " forges a " + weapon + " in the fires of the mountain");
    }

    /**
     * Dwarf attacks with axe
     */
    public void attackWithAxe(String enemy) {
        System.out.println(getName() + " swings " + axeType + " axe at " + enemy);
    }

    /**
     * Dwarf drinks ale
     */
    public void drinkAle() {
        System.out.println(getName() + " drinks a hearty mug of ale");
    }

    /**
     * Dwarf shouts a battle cry
     */
    public void battleCry() {
        System.out.println(getName() + " of Clan " + clan + " bellows a mighty battle cry!");
    }

    @Override
    public String toString() {
        return super.toString() + ", Clan: " + clan + ", Axe Type: " + axeType + 
               ", Beard Length: " + beardLength + ", Mining Skill: " + miningSkill;
    }
}

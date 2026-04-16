package Chars;

/**
 * Elf class representing elves of Middle-earth
 * Extends FellowshipMember
 */
public class Elf extends FellowshipMember {
    private boolean immortal;
    private int archerySkill;
    private String kingdom;

    /**
     * Constructor for Elf
     */
    public Elf(String name, int age, String location, String role, String kingdom, int archerySkill) {
        super(name, "Elf", age, location, role);
        this.immortal = true;
        this.archerySkill = archerySkill;
        this.kingdom = kingdom;
    }

    /**
     * Check if elf is immortal
     */
    public boolean isImmortal() {
        return immortal;
    }

    /**
     * Get elf's archery skill (0-100)
     */
    public int getArcherySkill() {
        return archerySkill;
    }

    /**
     * Get elf's kingdom
     */
    public String getKingdom() {
        return kingdom;
    }

    /**
     * Elf shoots an arrow
     */
    public void shootArrow(String target) {
        int damage = (archerySkill / 10) * 10;
        System.out.println(getName() + " shoots an arrow at " + target + " with " + damage + "% accuracy!");
    }

    /**
     * Elf senses danger
     */
    public void senseDanger() {
        System.out.println(getName() + " senses evil approaching from the east");
    }

    /**
     * Elf sings
     */
    public void singElvenSong() {
        System.out.println(getName() + " sings a beautiful Elven song that echoes through the mountains");
    }

    /**
     * Elf gracefully evades
     */
    public void evade(String threat) {
        System.out.println(getName() + " gracefully evades " + threat + " with Elven agility");
    }

    @Override
    public String toString() {
        return super.toString() + ", Kingdom: " + kingdom + ", Archery Skill: " + archerySkill + 
               ", Immortal: " + immortal;
    }
}

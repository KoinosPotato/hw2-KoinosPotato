package Chars;

/**
 * OneRing class representing the One Ring object from Lord of the Rings
 */
public class OneRing {
    private FellowshipMember wearer;
    private String location;
    private int corruptionLevel;
    private boolean discovered;

    /**
     * Constructor for OneRing
     */
    public OneRing(String initialLocation) {
        this.wearer = null;
        this.location = initialLocation;
        this.corruptionLevel = 0;
        this.discovered = false;
    }

    /**
     * Get the wearer of the ring
     */
    public FellowshipMember getWearer() {
        return wearer;
    }

    /**
     * Set the wearer of the ring
     */
    public void setWearer(FellowshipMember member) {
        this.wearer = member;
    }

    /**
     * Get ring's location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Set ring's location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Get corruption level (0-100)
     */
    public int getCorruptionLevel() {
        return corruptionLevel;
    }

    /**
     * Check if ring is discovered
     */
    public boolean isDiscovered() {
        return discovered;
    }

    /**
     * Discover the ring
     */
    public void discover() {
        this.discovered = true;
        System.out.println("The One Ring has been discovered!");
    }

    /**
     * Ring corrupts the wearer
     */
    public void corrupt() {
        if (wearer != null) {
            corruptionLevel += 15;
            System.out.println("The One Ring corrupts " + wearer.getName() + 
                             "! Corruption level: " + corruptionLevel);
        }
    }

    /**
     * Ring influences the wearer's thoughts
     */
    public void influence(String temptation) {
        if (wearer != null) {
            System.out.println("The One Ring whispers to " + wearer.getName() + ": \"" + temptation + "\"");
            corruptionLevel += 5;
        }
    }

    /**
     * Ring binds to its wearer
     */
    public void bindToWearer() {
        if (wearer != null) {
            System.out.println("The One Ring binds itself to " + wearer.getName() + " forever");
        }
    }

    /**
     * Ring reveals invisible wearers
     */
    public void revealInvisible() {
        System.out.println("The One Ring grants invisibility to its wearer at the cost of their soul...");
    }

    /**
     * Ring can be destroyed only in Mount Doom
     */
    public void destroyInMountDoom() {
        System.out.println("The One Ring is cast into the fires of Mount Doom and destroyed!");
        System.out.println("Sauron's power is broken! All his servants and armies fall!");
    }

    /**
     * Ring calls to those who seek it
     */
    public void callToRing() {
        System.out.println("The One Ring calls out: 'Find me... Bring me to Sauron...'");
    }

    @Override
    public String toString() {
        String wearerName = (wearer != null) ? wearer.getName() : "None";
        return "The One Ring - Location: " + location + ", Wearer: " + wearerName + 
               ", Corruption: " + corruptionLevel + ", Discovered: " + discovered;
    }
}

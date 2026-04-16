package Story;

import Chars.*;

/**
 * LordOfTheRingsStory
 * Main class that tells the story of the Fellowship of the Ring
 * Demonstrates the usage of all character and object classes
 */
public class LordOfTheRingsStory {
    public static void main(String[] args) {
        System.out.println("========== THE FELLOWSHIP OF THE RING ==========\n");

        // Create the One Ring
        System.out.println("--- Creating the One Ring ---");
        OneRing theOneRing = new OneRing("Bag End, The Shire");
        System.out.println(theOneRing);
        System.out.println();

        // Create Fellowship Members
        System.out.println("--- Creating Fellowship Members ---");
        
        // Hobbits
        Hobbit frodo = new Hobbit("Frodo Baggins", 50, "Bag End", "Ring Bearer", 3.5);
        Hobbit sam = new Hobbit("Samwise Gamgee", 38, "Bag End", "Gardener", 3.3);
        Hobbit merry = new Hobbit("Meriadoc Brandybuck", 37, "Buckland", "Scout", 3.2);
        Hobbit pippin = new Hobbit("Peregrin Took", 29, "Tuckborough", "Scout", 3.1);

        // Elf
        Elf legolas = new Elf("Legolas", 2931, "Mirkwood", "Archer", "Mirkwood", 95);

        // Dwarf
        Dwarf gimli = new Dwarf("Gimli", 139, "Khazad-dûm", "Warrior", "Durin", "Double-bladed");

        // Humans
        Human aragorn = new Human("Aragorn", 87, "Rivendell", "Leader", "Gondor and Arnor", "Anduril");
        Human boromir = new Human("Boromir", 41, "Gondor", "Warrior", "Gondor", "Sword of Gondor");

        // Wizard
        Wizard gandalf = new Wizard("Gandalf", 2019, "Rivendell", "Guide", "Grey", "Fire and Light");

        System.out.println("Frodo: " + frodo);
        System.out.println("Sam: " + sam);
        System.out.println("Legolas: " + legolas);
        System.out.println("Gimli: " + gimli);
        System.out.println("Aragorn: " + aragorn);
        System.out.println("Gandalf: " + gandalf);
        System.out.println();

        // Array of Fellowship Members
        System.out.println("--- The Fellowship Assembles ---");
        FellowshipMember[] fellowshipArray = {frodo, sam, legolas, gimli, aragorn, boromir, gandalf, merry, pippin};
        
        System.out.println("Array of " + fellowshipArray.length + " Fellowship Members:");
        for (int i = 0; i < fellowshipArray.length; i++) {
            System.out.println("  " + (i + 1) + ". " + fellowshipArray[i].getName() + 
                             " (" + fellowshipArray[i].getRole() + ")");
        }
        System.out.println();

        // Story begins
        System.out.println("--- THE QUEST BEGINS ---\n");

        //Frodo discovers the Ring
        gandalf.speak("Frodo, this Ring has come to you. You must take it.");
        theOneRing.discover();
        frodo.obtainRing(theOneRing);
        frodo.hideRing();
        System.out.println();

        System.out.println("\nMembers of the Fellowship perform their roles:");
        for (FellowshipMember member : fellowshipArray) {
            member.performRole();
        }
        System.out.println();

        // Aragorn leads
        System.out.println("\n--- Aragorn takes command ---");
        aragorn.displayNobleBearing();
        aragorn.lead();
        aragorn.speak("We must reach Mordor and destroy the Ring!");
        System.out.println();

        //On the journey
        System.out.println("\n--- The Fellowship travels through Moria ---");
        System.out.println("Gandalf leads the way:");
        gandalf.move("Moria - The Dwarf Kingdom");
        gandalf.provideWisdom("We must be careful. There are older and fouler things than Orcs in the deep.");
        
        System.out.println("\nLegolas scouts ahead:");
        legolas.move("Lothlorien");
        legolas.senseDanger();
        legolas.shootArrow("Attacking Orc");
        
        System.out.println("\nGimli mines for information:");
        gimli.move("Moria");
        gimli.battleCry();
        gimli.attackWithAxe("Goblin");
        gimli.drinkAle();
        
        System.out.println("\nThe Hobbits stay close:");
        sam.rest();
        sam.eat();
        System.out.println();

        System.out.println("\nThe Ring begins to corrupt Frodo:");
        for (int i = 0; i < 3; i++) {
            System.out.println("\n--- Journey Day " + (i + 1) + " ---");
            theOneRing.influence("You could use my power to rule the world, Frodo...");
            frodo.resist();
        }
        System.out.println();

        //Battle scenes
        
        // Loop through fellowship fighting
        System.out.println("\nThe Fellowship fights bravely:");
        Hobbit[] hobbits = {frodo, sam, merry, pippin};
        for (Hobbit hobbit : hobbits) {
            hobbit.fight("Orc army");
        }
        System.out.println();
        
        System.out.println("The skilled warriors:");
        aragorn.swingSword("Sauron's Lieutenant");
        legolas.shootArrow("Dark Tower Guard");
        gimli.attackWithAxe("Enemy Dwarf");
        boromir.fight("Wave of Orcs");
        System.out.println();

        System.out.println("\nBoromir, corrupted by the Ring's influence, falls...");
        boromir.fall();
        aragorn.defend("Boromir");
        aragorn.speak("Boromir! No!");
        System.out.println();

        System.out.println("\nThe Ring calls to all who seek it:");
        theOneRing.callToRing();
        
        System.out.println("\nFrodo and Sam continue to Mount Doom:");
        frodo.move("Mount Doom");
        sam.move("Mount Doom");
        frodo.speak("Sam, I cannot do this alone.");
        sam.speak("That's what I'm here for. I will help you, Mr. Frodo.");
        System.out.println();

        //Gandalf confronts evil
        System.out.println("--- Gandalf makes his stand ---");
        gandalf.move("Gondor");
        gandalf.confrontEvil("The Enemy of Middle-earth");
        gandalf.castSpell("Holy Light", "Dark Forces");
        gandalf.summon("Great Eagles");
        System.out.println();

        System.out.println("\nFrodo climbs the fires of Mount Doom:");
        System.out.println("The Ring's corruption reaches its peak:");
        theOneRing.bindToWearer();
        System.out.println();
        
        System.out.println("At last, in the fires of Mount Doom:");
        frodo.destroyRing(theOneRing);
        theOneRing.destroyInMountDoom();
        System.out.println();

        System.out.println("\nThe survivors rest and celebrate:");
        System.out.println();
        
        for (FellowshipMember member : fellowshipArray) {
            if (member.isAlive()) {
                member.rest();
                member.speak("We have succeeded! Middle-earth is saved!");
            }
        }
        System.out.println();
        
        System.out.println("The Fellowship's legacy lives on forever in legend.");
        System.out.println("Final Ring Status: " + theOneRing);
        System.out.println("\n========== THE END ==========");
    }
}

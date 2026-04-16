# CSCD211 Homework 2: Lord of the Rings - Fictional Universe

## Fictional Universe Description

### Overview
The project models the fictional universe of The Lord of the Rings.

### Characters and Races

**Base Character Type: Character**
- A general representation of any being in Middle-earth
- Attributes: name, race, age, location
- Behaviors: speak, move, rest

**Fellowship Members (extends Character)**
- Specialized characters who are part of the Fellowship
- Attributes: role, isAlive
- Behaviors: performRole, fight, fall

**Hobbit (extends FellowshipMember)**
- Small beings from the Shire, known for courage and loyalty
- Unique Attributes: height, hasOneRing, resistanceLevel
- Unique Behaviors: obtainRing, destroyRing, resist, hideRing, eat
- Key Members: Frodo (Ring Bearer), Samwise (Gardener), Meriadoc & Peregrin (Scouts)

**Elf (extends FellowshipMember)**
- Immortal and graceful warriors from Mirkwood and other Elven kingdoms
- Unique Attributes: immortal, archerySkill, kingdom
- Unique Behaviors: shootArrow, senseDanger, singElvenSong, evade
- Key Member: Legolas (Archer of Mirkwood)

**Dwarf (extends FellowshipMember)**
- Skilled miners and warriors from the mountains
- Unique Attributes: beardLength, axeType, miningSkill, clan
- Unique Behaviors: mine, forge, attackWithAxe, drinkAle, battleCry
- Key Member: Gimli (Warrior of Clan Durin)

**Human (extends FellowshipMember)**
- Noble beings with great strength and leadership abilities
- Unique Attributes: kingdom, strength, swordType
- Unique Behaviors: lead, defend, swingSword, rideHorse, displayNobleBearing
- Key Members: Aragorn (King and Leader), Boromir (Warrior of Gondor)

**Wizard (extends FellowshipMember)**
- Ancient and powerful beings with magical abilities
- Unique Attributes: magicPower, staffColor, specialization
- Unique Behaviors: castSpell, summon, provideWisdom, confrontEvil
- Key Member: Gandalf (Guide of the Fellowship, specialization in Fire and Light)

### Object: The One Ring

**The One Ring** is a sentient object of immense power created by the dark lord Sauron.
- **Attributes:** 
  - wearer: The current wearer of the ring
  - location: Where the ring is located
  - corruptionLevel: How much the ring has corrupted its wearer (0-100)
  - discovered: Whether the ring has been found
  
- **Behaviors:** 
  - corrupt(): Increases the wearer's corruption
  - influence(): Whispers temptations to the wearer
  - bindToWearer(): Permanently binds the ring to its wearer
  - revealInvisible(): Makes the wearer invisible
  - callToRing(): Calls out to those seeking power
  - destroyInMountDoom(): Can only be destroyed in the fires of Mount Doom

### Inheritance Hierarchy

```
Character (Base Class)
    └── FellowshipMember
            ├── Hobbit
            ├── Elf
            ├── Dwarf
            ├── Human
            └── Wizard

OneRing (Object Class)
```

## UML Class Diagram

```
┌─────────────────────────────────────────────────────────────┐
│                      Character                              │
├─────────────────────────────────────────────────────────────┤
│ - name: String                                              │
│ - race: String                                              │
│ - age: int                                                  │
│ - location: String                                          │
├─────────────────────────────────────────────────────────────┤
│ + getName(): String                                         │
│ + getRace(): String                                         │
│ + getAge(): int                                             │
│ + getLocation(): String                                     │
│ + speak(String): void                                       │
│ + move(String): void                                        │
│ + rest(): void                                              │
└─────────────────────────────────────────────────────────────┘
                           △
                           │ extends
                ┌──────────┴──────────┐
                │                     │
      ┌─────────────────────────┐   (other races)
      │    FellowshipMember     │
      ├─────────────────────────┤
      │ - role: String          │
      │ - isAlive: boolean      │
      ├─────────────────────────┤
      │ + getRole(): String     │
      │ + isAlive(): boolean    │
      │ + performRole(): void   │
      │ + fight(String): void   │
      │ + fall(): void          │
      └─────────────────────────┘
             △ extends △ extends △ extends △ extends
             │         │         │         │
    ┌────────┴───┐  ┌──┴──┐  ┌──┴──┐  ┌──┴──┐  ┌──────────┐
    │   Hobbit   │  │ Elf │  │Dwarf│  │Human│  │  Wizard  │
    ├────────────┤  ├─────┤  ├─────┤  ├─────┤  ├──────────┤
    │ - height   │  │-imm │  │-bd  │  │-kgd │  │ -magic   │
    │ - hasRing  │  │-arch│  │-axe │  │-str │  │ -staff   │
    │ - resist   │  │-kgd │  │-clan│  │-swrd│  │ -spec    │
    ├────────────┤  ├─────┤  ├─────┤  ├─────┤  ├──────────┤
    │+obtainRing │  │+shoot│  │+mine│  │+lead│  │+castSpel │
    │+destroyRng │  │+sense│  │+forge│ │+def │  │+summon   │
    │+resist     │  │+sing │  │+attack│ │+ride│  │+provideW │
    │+hideRing   │  │+evade│  │+drink│  │+disp│  │+confront │
    │+eat        │  │      │  │+cry  │  │     │  │          │
    └────────────┘  └─────┘  └─────┘  └─────┘  └──────────┘


┌─────────────────────────────────────────────────────────────┐
│                    The One Ring (Object)                    │
├─────────────────────────────────────────────────────────────┤
│ - wearer: FellowshipMember                                  │
│ - location: String                                          │
│ - corruptionLevel: int                                      │
│ - discovered: boolean                                       │
├─────────────────────────────────────────────────────────────┤
│ + getWearer(): FellowshipMember                             │
│ + setWearer(FellowshipMember): void                         │
│ + getLocation(): String                                     │
│ + setLocation(String): void                                 │
│ + getCorruptionLevel(): int                                 │
│ + isDiscovered(): boolean                                   │
│ + discover(): void                                          │
│ + corrupt(): void                                           │
│ + influence(String): void                                   │
│ + bindToWearer(): void                                      │
│ + revealInvisible(): void                                   │
│ + destroyInMountDoom(): void                                │
│ + callToRing(): void                                        │
└─────────────────────────────────────────────────────────────┘
```
## Code Editor/IDE Used
- **Visual Studio Code** with Java Extension Pack
- Language: Java 14+

## Github URL
- https://github.com/KoinosPotato/hw2-KoinosPotato

## Git Client Used
- **GitHub Desktop** 

---
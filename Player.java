package com.frontier.entities;

public class Player {

    private static int numOfPlayers;

    private String name;
    private String race;
    private String playerClass;
    private int hitpoints;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private boolean isAlive;

    public Player(String name, String race, String playerClass, int hitpoints) {
        this.name = name;
        this.race = race;
        this.playerClass = playerClass;
        this.setHitpoints(hitpoints);
        randStrength();
        randDexterity();
        randConstitution();
        randIntelligence();
        randWisdom();
        randCharisma();
        numOfPlayers++;
        this.isAlive = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(String playerClass) {
        this.playerClass = playerClass;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints += hitpoints;
        if (this.hitpoints <= 0) {
            this.hitpoints = 0;
            System.out.println("Player " + this.getName() + " has been killed.");
            this.isAlive = false;
        }
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    /** Generates a random strength stat for the player */
    public void randStrength() {
        int[] randomRoll = Dice.rollMultiple6(4);
        strength = Dice.highestThree(randomRoll);
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    /** Generates a random dexterity stat for the player */
    public void randDexterity() {
        int[] randomRoll = Dice.rollMultiple6(4);
        dexterity = Dice.highestThree(randomRoll);
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    /** Generates a random constitution stat for the player */
    public void randConstitution() {
        int[] randomRoll = Dice.rollMultiple6(4);
        constitution = Dice.highestThree(randomRoll);
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    /** Generates a random intelligence stat for the player */
    public void randIntelligence() {
        int[] randomRoll = Dice.rollMultiple6(4);
        intelligence = Dice.highestThree(randomRoll);
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    /** Generates a random wisdom stat for the player */
    public void randWisdom() {
        int[] randomRoll = Dice.rollMultiple6(4);
        wisdom = Dice.highestThree(randomRoll);
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    /** Generates a random charisma stat for the player */
    public void randCharisma() {
        int[] randomRoll = Dice.rollMultiple6(4);
        charisma = Dice.highestThree(randomRoll);
    }

    @Override
    public String toString() {
        return  "Name: '" + name + '\'' + '\n' +
                "Race: '" + race + '\'' + '\n' +
                "PlayerClass: '" + playerClass + '\'' + '\n' +
                "Hitpoints: " + hitpoints + '\n' +
                "Strength: " + strength + '\n' +
                "Dexterity: " + dexterity + '\n' +
                "Constitution: " + constitution + '\n' +
                "Intelligence: " + intelligence + '\n' +
                "Wisdom: " + wisdom + '\n' +
                "Charisma: " + charisma + '\n' +
                "isAlive: " + isAlive;
    }
}

package com.frontier.entities;

/**
 * Base player class
 * @author Joshua S. Garrett
 * @version 0.1
*/
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

    /**
     * Constructor
     * @param name
     * @param race
     * @param playerClass
     * @param hitpoints
     */
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

    /**
     * @return player name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name player's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return race
     */
    public String getRace() {
        return race;
    }

    /**
     * @param race player's race
     */
    public void setRace(String race) {
        this.race = race;
    }

    /**
     * @return player's class
     */
    public String getPlayerClass() {
        return playerClass;
    }

    /**
     * @param playerClass player's class
     */
    public void setPlayerClass(String playerClass) {
        this.playerClass = playerClass;
    }

    /**
     * @return player's hitpoints
     */
    public int getHitpoints() {
        return hitpoints;
    }

    /**
     * @param hitpoints player's hitpoints
     */
    public void setHitpoints(int hitpoints) {
        this.hitpoints += hitpoints;
        if (this.hitpoints <= 0) {
            this.hitpoints = 0;
            System.out.println("Player " + this.getName() + " has been killed.");
            this.isAlive = false;
        }
    }

    /**
     * @return player's strength
     */
    public int getStrength() {
        return strength;
    }

    /**
     * @param strength player's strength stat
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     * Generates a random strength stat for the player
     */
    public void randStrength() {
        int[] randomRoll = Dice.rollMultiple6(4);
        strength = Dice.highestThree(randomRoll);
    }

    /**
     * @return player's dexterity stat
     */
    public int getDexterity() {
        return dexterity;
    }

    /**
     * @param dexterity player's dexterity stat
     */
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    /**
     * Generates a random dexterity stat for the player
     */
    public void randDexterity() {
        int[] randomRoll = Dice.rollMultiple6(4);
        dexterity = Dice.highestThree(randomRoll);
    }

    /**
     * @return player's constitution stat
     */
    public int getConstitution() {
        return constitution;
    }

    /**
     * @param constitution player's constitution stat
     */
    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    /**
     * Generates a random constitution stat for the player
     */
    public void randConstitution() {
        int[] randomRoll = Dice.rollMultiple6(4);
        constitution = Dice.highestThree(randomRoll);
    }

    /**
     * @return player's intelligence stat
     */
    public int getIntelligence() {
        return intelligence;
    }

    /**
     * @param intelligence player's intelligence stat
     */
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    /**
     * Generates a random intelligence stat for the player
     */
    public void randIntelligence() {
        int[] randomRoll = Dice.rollMultiple6(4);
        intelligence = Dice.highestThree(randomRoll);
    }

    /**
     * @return player's wisdom stat
     */
    public int getWisdom() {
        return wisdom;
    }

    /**
     * @param wisdom player's wisdom stat
     */
    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    /**
     * Generates a random wisdom stat for the player
     */
    public void randWisdom() {
        int[] randomRoll = Dice.rollMultiple6(4);
        wisdom = Dice.highestThree(randomRoll);
    }

    /**
     * @return player's charisma stat
     */
    public int getCharisma() {
        return charisma;
    }

    /**
     * @param charisma player's charisma stat
     */
    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    /**
     * Generates a random charisma stat for the player
     */
    public void randCharisma() {
        int[] randomRoll = Dice.rollMultiple6(4);
        charisma = Dice.highestThree(randomRoll);
    }

    /**
     *
     * @return player stat report
     */
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

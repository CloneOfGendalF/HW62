package com.geektech;

public class GameEntity {
    private String Name;
    private int HP;
    private int DMG;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getDMG() {
        return DMG;
    }

    public void setDMG(int DMG) {
        this.DMG = DMG;
    }
}

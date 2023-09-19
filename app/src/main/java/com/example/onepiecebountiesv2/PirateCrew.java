package com.example.onepiecebountiesv2;

import java.util.ArrayList;
import java.util.Iterator;

public class PirateCrew implements Iterable<Character>{
    private String name;
    private ArrayList<Character> members;

    public PirateCrew(String name) {
        this.name = name;
        members = new ArrayList<>();
    }

    public void addCharacter(Character character) {
        members.add(character);
    }

    public void removeCharacter(Character character) {
        members.remove(character);
    }

    public ArrayList<Character> getMembers() {
        return members;
    }

    public Iterator<Character> iterator() {
        return members.iterator();
    }
}

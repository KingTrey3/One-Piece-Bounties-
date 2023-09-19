package com.example.onepiecebountiesv2;

import android.os.Parcel;
import android.os.Parcelable;

public class Character {
    private String name;
    private Integer bounty;
    private Long bountyL;
    private String imageName;
    private PirateCrew crew;
    //private ArrayList<Character>

    public Character(String name, Integer bounty, String image, PirateCrew crew) {
        this.name = name;
        this.bounty = bounty;
        this.imageName = image;
        crew.addCharacter(this);
    }
    public Character(String name, Long bountyL, String image, PirateCrew crew) {
        this.name = name;
        this.bountyL = bountyL;
        this.imageName = image;
        crew.addCharacter(this);
    }

    public String getName() {
        return this.name;
    }
    public Integer getBounty() {
        return this.bounty;
    }
    public void setBounty(Integer newBounty) {
        this.bounty = newBounty;
    }
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String nameOfImage) {
        this.imageName = nameOfImage;
    }

}

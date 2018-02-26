package com.gti.spring.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created by sushilmainali on 25/02/2018.
 */

@MappedSuperclass
public abstract class Goat  extends Animal{

    @Column
    boolean hasBeards;


    @Column
    boolean givesWool;


    public boolean isHasBeards() {
        return hasBeards;
    }

    public void setHasBeards(boolean hasBeards) {
        this.hasBeards = hasBeards;
    }

    public boolean isGivesWool() {
        return givesWool;
    }

    public void setGivesWool(boolean givesWool) {
        this.givesWool = givesWool;
    }
}

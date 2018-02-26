package com.gti.spring.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by sushilmainali on 25/02/2018.
 */
@Entity
@DiscriminatorValue("MountainGoat")
public class MountainGoat extends Goat{


    public MountainGoat() {
    }

    @Column
    boolean gazedOnMountainSlope;
    @Column
    boolean  canClimbSteepSlopes;

    public boolean isGazedOnMountainSlope() {
        return gazedOnMountainSlope;
    }

    public void setGazedOnMountainSlope(boolean gazedOnMountainSlope) {
        this.gazedOnMountainSlope = gazedOnMountainSlope;
    }

    public boolean isCanClimbSteepSlopes() {
        return canClimbSteepSlopes;
    }

    public void setCanClimbSteepSlopes(boolean canClimbSteepSlopes) {
        this.canClimbSteepSlopes = canClimbSteepSlopes;
    }
}

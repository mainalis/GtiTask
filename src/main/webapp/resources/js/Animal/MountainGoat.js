/**
 * Created by sushilmainali on 25/02/2018.
 */


'use strict';

class MountainGoat extends Animal {

    constructor() {

        super("aa", "red", Date.now(), 24, "erere", "kkkkk","Male", 12, true);

    }




}

MountainGoat.prototype.setGazeLoacation = function(canGazeOnSlope)
{
    this.gazedOnMountainSlope = canGazeOnSlope;

}



MountainGoat.prototype.setClimbSteepSlopes = function(canClimb)
{
    this.canClimbSteepSlopes = canGazeOnSlope;

}

MountainGoat.prototype.setBeards = function(hasBeards)
{
    this.hasBeards = hasBeards;

}


MountainGoat.prototype.setWools = function(hasWools)
{
    this.givesWool = hasWools;

}

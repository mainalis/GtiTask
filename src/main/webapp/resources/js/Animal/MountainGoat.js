

'use strict';

class MountainGoat extends Animal {

    constructor(animalObj) {

        super(animalObj.scientificName, animalObj.color, animalObj.birthDate, 
        		animalObj.weight, animalObj.givenName, animalObj.breed,animalObj.sex, animalObj.height, animalObj.hasHorns);

        this.gazedOnMountainSlope = true;
        this.hasBeards = true;
        this.canClimbSteepSlopes = true;
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

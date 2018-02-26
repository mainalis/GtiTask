'use strict';

class Cow extends Animal {
	
	constructor(animalObj) {

        super(animalObj.scientificName, animalObj.color, animalObj.birthDate, 
        		animalObj.weight, animalObj.givenName, animalObj.breed,animalObj.sex, animalObj.height, animalObj.hasHorns);

        this.earTagId ='';
        this.tagColor = '';
        this.taggedDate = '';
    }

}

Cow.prototype.setEarTagId = function(earTagId)
{
    this.earTagId = earTagId;

}



Cow.prototype.setTagColor = function(tagColor)
{
    this.tagColor = tagColor;

}

Cow.prototype.setTagedDate = function(tagedDate)
{
    this.taggedDate = tagedDate;

}

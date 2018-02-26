package com.gti.spring.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by sushilmainali on 24/02/2018.
 */
@Entity
@Table(name = "animal")
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name ="ANIMAL_TYPE", discriminatorType = DiscriminatorType.STRING)
public abstract class Animal  {

    @Id @GeneratedValue
    private long id;

    @Column(nullable = false)
    String scientificName;

    @Column (nullable = false)
    String color;

    @Column (nullable = false)
    Date birthDate;

    @Column (nullable = false)
    Integer weight;

    @Column (nullable = false)
    String givenName;

    @Column (nullable = false)
    String breed;

    @Column (nullable = false)
    String sex;

    @Column (nullable = false)
    Double height;

    @Column
    boolean hasHorns;

    @Column(name = "ANIMAL_TYPE", insertable = false, updatable = false)
    String animalType;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public boolean isHasHorns() {
        return hasHorns;
    }

    public void setHasHorns(boolean hasHorns) {
        this.hasHorns = hasHorns;
    }

    
    public String getAnimalType()
    {
        return animalType;
    }

    public void setAnimalType(String animalType)
    {
        this.animalType = animalType;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", scientificName='" + scientificName + '\'' +
                ", color='" + color + '\'' +
                ", birthDate=" + birthDate +
                ", weight=" + weight +
                ", givenName='" + givenName + '\'' +
                ", breed='" + breed + '\'' +
                ", sex='" + sex + '\'' +
                ", height=" + height +
                ", hasHorns=" + hasHorns +
                '}';
    }
}

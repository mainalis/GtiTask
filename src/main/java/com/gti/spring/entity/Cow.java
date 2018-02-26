package com.gti.spring.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by sushilmainali on 25/02/2018.
 */
@Entity
@DiscriminatorValue("Cow")
public class Cow extends Animal {

    @Column
    Integer earTagId;
    @Column
    String tagColor;
    @Column
    Date taggedDate;
}

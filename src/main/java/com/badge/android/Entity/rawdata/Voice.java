package com.badge.android.Entity.rawdata;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Getter
@Setter
@Entity
public class Voice extends MetaData{
    @Id
    @GeneratedValue
    private Long id;
    protected double frequency;
    protected  double decimal;

}

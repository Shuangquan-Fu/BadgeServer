package com.badge.android.Entity.rawdata;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Getter
@Setter
@Entity
@Table(name="movement")
public class Movement extends MetaData {
    @Id
    @GeneratedValue
    private Long id;

    protected float x;

    protected float y;

    protected float z;



}

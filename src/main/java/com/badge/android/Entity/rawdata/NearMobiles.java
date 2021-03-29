package com.badge.android.Entity.rawdata;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Setter
@Getter
@Entity
@Table(name = "nearphones")
public class NearMobiles extends MetaData {
    @Id
    @GeneratedValue
    private Long id;

    protected String macAddress;

}

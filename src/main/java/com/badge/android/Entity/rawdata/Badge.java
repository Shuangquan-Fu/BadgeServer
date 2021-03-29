package com.badge.android.Entity.rawdata;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Data
@Getter
@Setter
@Entity
@Table(name="badge")
public class Badge extends MetaData {
    @Id
    @GeneratedValue
    private Long id;

    protected String mac_address;

    protected String userName;

    protected String password;

    protected int userId;



}

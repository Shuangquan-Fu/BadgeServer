package com.badge.android.Entity.rawdata;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Setter
@Getter
@Entity
@Table(name = "near_macs")
public class NearMacs {

    @Id
    @GenericGenerator(name = "generator",strategy="increment")
    @GeneratedValue(generator="generator")
    @Column(name="id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "nearphones_id")
    protected NearMobiles nearMobiles;

    protected String mac_addr;



}

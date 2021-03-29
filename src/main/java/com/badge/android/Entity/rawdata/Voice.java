package com.badge.android.Entity.rawdata;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Getter
@Setter
@Entity
@Table(name = "voice")
public class Voice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="frequency")
    protected double frequency;
    @Column(name="decVal")
    protected  double decimal;

    @Transient
    protected String type;
    @Column(name = "badge_id")
    protected Integer badge_id;
    @Column(name="dataset_id")
    protected Integer dataset_id;

}

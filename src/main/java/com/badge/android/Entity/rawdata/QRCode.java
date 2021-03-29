package com.badge.android.Entity.rawdata;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Setter
@Getter
@Entity
@Table(name="QRCode")
public class QRCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    protected String QRCode;
    @Transient
    protected String type;
    @Column(name = "badge_id")
    protected Integer badge_id;
    @Column(name="dataset_id")
    protected Integer dataset_id;
}

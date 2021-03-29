package com.badge.android.Entity.rawdata;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Setter
@Getter
@Entity
@Table(name = "nearphones")
public class NearMobiles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Transient
    protected String type;
    @Column(name = "badge_id")
    protected Integer badge_id;
    @Column(name="dataset_id")
    protected Integer dataset_id;

    @Column(name = "time_stamp")
    protected Long time_stamp;

}

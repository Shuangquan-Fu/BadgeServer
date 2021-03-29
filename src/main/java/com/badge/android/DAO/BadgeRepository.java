package com.badge.android.DAO;


import com.badge.android.Entity.rawdata.Badge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BadgeRepository extends JpaRepository<Badge,Long> {
    public Badge findByIdAndPassword(long id, String password);
}

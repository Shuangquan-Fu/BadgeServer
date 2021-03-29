package com.badge.android.DAO;


import com.badge.android.Entity.rawdata.Badge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BadgeRepository extends JpaRepository<Badge,Long> {
    public Badge findByBadge_idAndPassword(String badge_id, String password);
}

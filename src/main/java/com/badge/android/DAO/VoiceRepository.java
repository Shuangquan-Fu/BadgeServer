package com.badge.android.DAO;

import com.badge.android.Entity.rawdata.Voice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoiceRepository extends JpaRepository<Voice,Long> {
}

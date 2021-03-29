package com.badge.android.DAO;

import com.badge.android.Entity.rawdata.QRCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QRCodeRepository extends JpaRepository<QRCode,Long> {
}

package com.badge.android.Service;

import com.badge.android.Entity.rawdata.*;

public interface AndroidDeviceService {
    /**
     * Login through Badge
     */
    public boolean login(Badge badge);

    /**
     * save movement
     */
    public void saveMovement(Movement movement);

    /**
     * save QR code
     */
    public void saveQRCode(QRCode qrCode);

    /**
     * save voice
     */
    public void saveVoice(Voice voice);

    /**
     * save near mobiles
     */
    public void saveNearMobiles(NearMobiles nearMobiles);
}

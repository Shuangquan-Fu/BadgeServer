package com.badge.android.Service.Impl;

import com.badge.GlobalParameters;
import com.badge.android.DAO.*;
import com.badge.android.Entity.rawdata.*;
import com.badge.android.Service.AndroidDeviceService;
import com.badge.android.Utils.AES;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AndroidDataServiceImpl implements AndroidDeviceService {
    @Autowired
    BadgeRepository badgeRepository;
    @Autowired
    MovementRepository movementRepository;
    @Autowired
    QRCodeRepository qrCodeRepository;
    @Autowired
    VoiceRepository voiceRepository;
    @Autowired
    NearMobilesRepository nearMobilesRepository;

    @Override
    public boolean login(Badge badge) {
//        Badge user = badgeRepository(badge.getBadge_id(), AES.Decryption.decrypt(badge.getPassword(),
//                GlobalParameters.Encryption.secretKey,"MD5"));
        Badge user = badgeRepository.findByIdAndPassword(badge.getId(),AES.Decryption.decrypt(badge.getPassword(),
                GlobalParameters.Encryption.secretKey,"MD5"));
        if (user == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public void saveMovement(Movement movement) {
        movementRepository.save(movement);
    }

    @Override
    public void saveQRCode(QRCode qrCode) {
        qrCodeRepository.save(qrCode);
    }

    @Override
    public void saveVoice(Voice voice) {
        voiceRepository.save(voice);
    }

    @Override
    public void saveNearMobiles(NearMobiles nearMobiles) {
        nearMobilesRepository.save(nearMobiles);
    }
}

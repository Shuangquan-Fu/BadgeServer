package com.badge.android.Web;

import com.badge.android.Service.AndroidDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dev")
public class DeviceController{
    @Autowired
    AndroidDeviceService androidDeviceService;

//    @GetMapping("/login")
//    public String login




}

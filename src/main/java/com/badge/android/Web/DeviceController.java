package com.badge.android.Web;

import com.badge.android.Service.AndroidDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/dev")
public class DeviceController{
    @Autowired
    AndroidDeviceService androidDeviceService;

    @GetMapping(value="/login")
    public Object login(@RequestBody GSon, HttpSession session){



    }

    




}

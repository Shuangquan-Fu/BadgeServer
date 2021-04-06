package com.badge.android.Web;

import com.badge.android.Entity.Utils.AndroidResponse;
import com.badge.android.Service.AndroidDeviceService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/dev")
public class DeviceController{
    @Autowired
    AndroidDeviceService androidDeviceService;
    @Autowired
    AndroidResponse androidResponse;

    ObjectMapper mapper = new ObjectMapper();

    @GetMapping(value="/login")
    @ResponseBody // 服务器返回json
    public String login(HttpSession session){
        return "jj";
    }



}

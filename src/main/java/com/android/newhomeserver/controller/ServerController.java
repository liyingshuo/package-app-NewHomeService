package com.android.newhomeserver.controller;

import com.android.newhomeserver.application.Application;
import com.android.newhomeserver.info.HomeInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ServerController {
    @RequestMapping(value = "/request")
    public @ResponseBody
    String request(@RequestParam(value="type") Integer type) {
        String res = null;
        switch (type) {
            case 100:
                res = Application.generateHomeInfoListString();
                break;
            case 200:
                res = "200";
                break;
            default:
                break;
        }
        return res;
    }
}

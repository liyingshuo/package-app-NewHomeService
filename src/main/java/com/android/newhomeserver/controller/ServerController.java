package com.android.newhomeserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ServerController {
    @RequestMapping(value = "/request")
    public @ResponseBody
    String request(@RequestParam(value="id") Integer id) {
        String res=null;
        switch (id) {
            case 1:
                res = "A";
                break;
            case 2:
                res = "B";
                break;
            default:
                res = "none";
                break;
        }
        return res;
    }
}

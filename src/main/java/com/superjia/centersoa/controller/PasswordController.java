package com.superjia.centersoa.controller;

import com.superjia.centersoa.model.PasswordBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author Klien Zhang
 * @CreateTime: 2016-07-08
 * @UpdateTime: 2016-07-8
 * @description:
 */
@Controller(value = "passwordchanger")
public class PasswordController {

    public @ResponseBody Map<String, String> changePassword(@RequestBody PasswordBean pwd){

        return null;
    }
}

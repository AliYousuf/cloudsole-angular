package com.cloudsole.angular.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tmichels on 8/3/14.
 */

@RequestMapping("/restangular")
public class RestangularController {

    @RequestMapping("/layout")
    public String layout(){
        return "restangular/layout";
    }
}

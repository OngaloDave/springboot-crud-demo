package com.ensat.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Homepage controller.
 */
@RestController
public class IndexController {

    @GetMapping("/")
    Responsestatus(Httpstatus.Ok)
    String index() {
        return "index";
    }

}

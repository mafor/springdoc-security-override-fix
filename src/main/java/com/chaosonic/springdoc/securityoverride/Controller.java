package com.chaosonic.springdoc.securityoverride;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/secure")
    @ResponseBody
    public String secured() {
        return "It works!";
    }

    @Tag(name = SecurityOverrideCustomizer.UNSECURED)
    @GetMapping("/open")
    @ResponseBody
    public String open() {
        return "It works!";
    }
}

package com.humayun.SweetTech.Resource;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("")
@RestController
public class HelloResource {

    @GetMapping("/all")
    public String hello() {
        return "Hello Youtube";
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/admin")
    public String securedHello() {
        return "index";
    }

    @PreAuthorize("hasAnyRole('OTHERS')")
    @GetMapping("/show")
    public String alternate() {
        return "show";
    }
}



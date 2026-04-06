package com.cob.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BannerController {

    @GetMapping(path = "/check-banner")
    public ResponseEntity<String> checkBanner(){
        return ResponseEntity.ok("Banner is working fine!");
    }

}

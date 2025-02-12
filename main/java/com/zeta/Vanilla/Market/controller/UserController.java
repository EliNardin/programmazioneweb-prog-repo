package com.zeta.Vanilla.Market.controller;

import com.zeta.Vanilla.Market.dto.Response;
import com.zeta.Vanilla.Market.service.interf.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;


    @GetMapping("/get-all")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<Response> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }


/*
    public ResponseEntity<?> getAllUsers() {
    try {
        Response response = userService.getAllUsers();
        return ResponseEntity.ok(response);
    } catch (Exception e) {
        return ResponseEntity.status(500).body("Errore interno del server: " + e.getMessage());
    }
} */

    @GetMapping("/my-info")
    public ResponseEntity<Response> getUserInfoAndOrderHistory(){
        return ResponseEntity.ok(userService.getUserInfoAndOrderHistory());
    }
}

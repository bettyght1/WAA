package com.example.lab.controller;

import com.example.lab.domain.AuthenticationRequest;
import com.example.lab.domain.AuthenticationResponse;
import com.example.lab.service.MyUserDetailService;
import com.example.lab.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    AuthenticationManager authenticationManager;
    MyUserDetailService myUserDetailService;
    JwtUtil jwtUtil;

    @Autowired
    public void setAuthenticationManager(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }
    @Autowired
    public void setMyUserDetailService(MyUserDetailService myUserDetailService){
        this.myUserDetailService = myUserDetailService;
    }
    @Autowired
    public void setJwtUtil(JwtUtil jwtUtil){
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/authenticate")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authRequest) throws Exception{
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
        }catch(BadCredentialsException bcExp){
            throw new Exception("Incorrect User Name and Password", bcExp);
        }
        final UserDetails userDetails = myUserDetailService.loadUserByUsername(authRequest.getUsername());
        final String jwt = jwtUtil.generateToken(userDetails);
        return ResponseEntity.ok(new AuthenticationResponse(jwt));
    }
}

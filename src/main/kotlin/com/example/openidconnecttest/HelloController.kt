package com.example.openidconnecttest

import org.springframework.http.ResponseEntity
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(value = "oauthlogintest")
class HelloController {
    @GetMapping("/")
    fun hi(authentication: OAuth2AuthenticationToken): ResponseEntity<Map<String, Any>> {
        return ResponseEntity.ok(authentication.getPrincipal().getAttributes());
    }
}
package me.shinhyunseop.springbootdeveloper.config.jwt;

import lombok.Getter;

@Getter
public class JwtFactory {
    private String subject = "test@email.com";
    private Date issudAt = new Date();
}

package com.sparta.b2c.member.dto.request;

public record SignupRequest(
        String email,
        String password,
        String name
) {
}
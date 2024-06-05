package com.ssafy.kdkd.security.oauth2.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum OAuth2Provider {
    NAVER("naver"),
    KAKAO("kakao");

    private final String registrationId;
}

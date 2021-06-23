package com.moon.mall.user.domain.shared;

public enum DomainExceptionCode {

    ID_SHOULD_BE_POSITIVE("ID必须大于0"),
    ;
    private String message;

    DomainExceptionCode(String message) {
        this.message = message;
    }

    public String getMessage(Object... param) {
        return String.format(message, param);
    }
}

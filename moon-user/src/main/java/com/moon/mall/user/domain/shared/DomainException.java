package com.moon.mall.user.domain.shared;

import java.util.Optional;

public class DomainException extends RuntimeException {

    private static final long serialVersionUID = -6376088672694974306L;
    private DomainExceptionCode code;

    private final String message;

    public DomainException(DomainExceptionCode code, Object... param) {
        super(code.getMessage(param));
        message = code.getMessage(param);
        this.code = code;
    }


    public DomainException(DomainExceptionCode code, Throwable throwable, Object... param) {
        super(code.getMessage(param), throwable);
        message = code.getMessage(param);
        this.code = code;
    }

    public static DomainException error(DomainExceptionCode code, Object... param) {
        return new DomainException(code, param);
    }

    public static DomainException error(DomainExceptionCode code, Throwable throwable, Object... param) {
        return new DomainException(code, throwable, param);
    }

    public DomainExceptionCode getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return Optional.ofNullable(message)
                .orElse(code.name());
    }
}

package com.moon.mall.user.domain.model.user;

import com.moon.mall.user.domain.shared.IdObject;

/**
 * 用户ID
 */
public class UserId extends IdObject {

    public static final UserId NULL_USER_ID = new UserId();

    public UserId(long value) {
        super(value);
    }

    private UserId() {
        super();
    }
}

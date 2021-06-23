package com.moon.mall.user.domain.model.user;

/**
 * 用户状态
 */
public enum UserStatus {
    NORMAL(1, "正常"),
    FROZE(2, "冻结");
    private int val;
    private String desc;

    UserStatus(int val, String desc) {
        this.val = val;
        this.desc = desc;
    }

    public static UserStatus fromVal(int val) {
        for (UserStatus type : values()) {
            if (type.val == val) {
                return type;
            }
        }
        return null;
    }
}

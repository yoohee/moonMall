package com.moon.mall.user.domain.model.user;

/**
 * 性别
 */
public enum Gender {
    MALE(1,"男"),
    FEMALE(2,"女");
    private int val;
    private String desc;

    Gender(int val, String desc) {
        this.val = val;
        this.desc = desc;
    }

    public static Gender fromVal(int val) {
        for (Gender type : values()) {
            if (type.val == val) {
                return type;
            }
        }
        return null;
    }
}

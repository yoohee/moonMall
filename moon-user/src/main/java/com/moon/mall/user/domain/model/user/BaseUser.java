package com.moon.mall.user.domain.model.user;

import com.moon.mall.user.domain.shared.BaseDomain;
import lombok.Value;

/**
 * 用户领域模型
 */
@Value
public class BaseUser extends BaseDomain {


    /**
     * 用户ID
     */
    UserId userId;
    /**
     * 昵称
     */
    String nickName;
    /**
     * 手机号码
     */
    String mobilePhone;
    /**
     * 密码
     */
    String passWord;
    /**
     * 头像地址
     */
    String userAvatar;

    /**
     * 性别
     */
    Gender gender;

    /**
     * 年龄
     */
    Integer age;
    /**
     * 用户状态
     */
    UserStatus userStatus;


}

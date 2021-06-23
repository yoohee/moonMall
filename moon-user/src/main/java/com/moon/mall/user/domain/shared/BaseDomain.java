package com.moon.mall.user.domain.shared;

import lombok.Data;
import lombok.Value;

import java.time.LocalDateTime;

/**
 * 基础领域模型
 */
@Data
public class BaseDomain implements ValueObject<BaseDomain> {


    /**
     * 创建时间
     */
    LocalDateTime createTime;
    /**
     * 创建人
     */
    String createUser;
    /**
     * 最后修改时间
     */
    LocalDateTime updateTime;
    /**
     * 最后修改人
     */
    String updateUser;

    @Override
    public boolean sameValueAs(BaseDomain obj) {
        return this.equals(obj);
    }
}

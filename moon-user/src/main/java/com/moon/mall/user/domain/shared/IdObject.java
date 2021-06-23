package com.moon.mall.user.domain.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

import java.util.Objects;

import static com.moon.mall.user.domain.shared.DomainExceptionCode.ID_SHOULD_BE_POSITIVE;

/**
 * 数据库主键ID对象
 */
@Getter
public class IdObject implements ValueObject<IdObject> {

    private final long value;

    @JsonCreator
    public IdObject(long value) {
        if (value <= 0) {
            throw DomainException.error(ID_SHOULD_BE_POSITIVE);
        }
        this.value = value;
    }

    protected IdObject() {
        this.value = 0;
    }

    @JsonValue
    public long getValue() {
        return value;
    }

    @Override
    public boolean sameValueAs(IdObject obj) {
        return obj != null && this.value == obj.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IdObject idObject = (IdObject) o;
        return sameValueAs(idObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}

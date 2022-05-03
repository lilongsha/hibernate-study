package com.mzvzm.type;

import com.mzvzm.entity.Gender;
import org.hibernate.usertype.UserTypeSupport;

import java.sql.Types;

/**
 * @Author lilongsha
 * @Description
 * @Date 2022/4/28 17:11
 */
public class GenderType extends UserTypeSupport<Gender> {
    public GenderType() {
        super(Gender.class, Types.CHAR);
    }
}

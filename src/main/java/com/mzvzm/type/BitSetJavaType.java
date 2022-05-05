package com.mzvzm.type;

import org.hibernate.type.descriptor.WrapperOptions;
import org.hibernate.type.descriptor.java.AbstractClassJavaType;
import org.hibernate.type.descriptor.java.MutabilityPlan;
import org.hibernate.type.descriptor.jdbc.JdbcType;
import org.hibernate.type.descriptor.jdbc.JdbcTypeIndicators;

import java.sql.Types;
import java.util.BitSet;

/**
 * @Author lilongsha
 * @Description
 * @Date 2022/5/3 11:21
 */
public class BitSetJavaType extends AbstractClassJavaType<BitSet> {

    public static final BitSetJavaType INSTANCE = new BitSetJavaType();

    public BitSetJavaType() {
        super(BitSet.class);
    }

    @Override
    public MutabilityPlan<BitSet> getMutabilityPlan() {
        return super.getMutabilityPlan();
    }

    @Override
    public <X> X unwrap(BitSet value, Class<X> type, WrapperOptions options) {
        return null;
    }

    @Override
    public <X> BitSet wrap(X value, WrapperOptions options) {
        return null;
    }
}

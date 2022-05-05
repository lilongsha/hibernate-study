package com.mzvzm.instantiator;

import com.mzvzm.entity.Name;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.metamodel.spi.EmbeddableInstantiator;
import org.hibernate.metamodel.spi.ValueAccess;

/**
 * @Author lilongsha
 * @Description
 * @Date 2022/5/3 15:40
 */
public class NameInstantiator implements EmbeddableInstantiator {
    @Override
    public Object instantiate(ValueAccess valueAccess, SessionFactoryImplementor sessionFactory) {
        String first = valueAccess.getValue(0, String.class);
        String middle = valueAccess.getValue(1, String.class);
        String last = valueAccess.getValue(2, String.class);
        return new Name(first, middle, last);
    }

    @Override
    public boolean isInstance(Object object, SessionFactoryImplementor sessionFactory) {
        return false;
    }

    @Override
    public boolean isSameClass(Object object, SessionFactoryImplementor sessionFactory) {
        return false;
    }
}

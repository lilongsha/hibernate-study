package com.mzvzm.genera;

import com.mzvzm.annotation.GeneratedUuidValue;
import org.hibernate.Session;
import org.hibernate.tuple.AnnotationValueGeneration;
import org.hibernate.tuple.GenerationTiming;
import org.hibernate.tuple.ValueGenerator;

import java.util.UUID;

/**
 * @Author lilongsha
 * @Description
 * @Date 2022/5/3 13:37
 */
public class UuidValueGeneration implements AnnotationValueGeneration<GeneratedUuidValue>, ValueGenerator<UUID> {
    private GenerationTiming timing;

    @Override
    public void initialize(GeneratedUuidValue annotation, Class<?> propertyType) {
        timing = annotation.timing();
    }

    @Override
    public GenerationTiming getGenerationTiming() {
        return timing;
    }

    @Override
    public ValueGenerator<?> getValueGenerator() {
        return this;
    }

    @Override
    public boolean referenceColumnInSql() {
        return false;
    }

    @Override
    public String getDatabaseGeneratedReferencedColumnValue() {
        return null;
    }

    @Override
    public UUID generateValue(Session session, Object owner) {
        return UUID.randomUUID();
    }
}

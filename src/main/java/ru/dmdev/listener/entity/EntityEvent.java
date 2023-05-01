package ru.dmdev.listener.entity;

import java.util.EventObject;

public class EntityEvent extends EventObject {

    private final AccessType accessType;

    public EntityEvent(Object entity, AccessType type) {
        super(entity);
        this.accessType = type;
    }

    public AccessType getAccessType() {
        return accessType;
    }
}

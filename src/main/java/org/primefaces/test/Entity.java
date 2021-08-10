package org.primefaces.test;

import java.io.Serializable;
import java.util.Objects;

public class Entity implements Serializable {

    private final String name;

    public Entity(String name) {
        this.name = Objects.requireNonNull(name);
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Entity entity = (Entity) o;

        return name.equals(entity.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

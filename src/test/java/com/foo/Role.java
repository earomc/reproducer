package com.foo;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;

import java.util.Objects;

@Entity(value = "roles")
public class Role {

    /*
    PRESIDENT("President"),
    VICE_PRESIDENT("Vice President"),
    MAYOR("Mayor"),
    VICE_MAYOR("Vice Mayor");
     */

    @Id
    private String name;

    public Role() {}

    public Role(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}

package com.foo;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import dev.morphia.annotations.PostLoad;

import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/**
 * @author earomc
 * represents a persistable SMPPlayer. Also called offline player.
 */

@Entity(value = "players")
public class SMPPlayer {

    @Id
    protected String uuidString;

    protected Set<Role> roles;

    public SMPPlayer() {
        this.uuidString = UUID.randomUUID().toString();
    }


    public UUID getUniqueId() {
        return UUID.fromString(uuidString);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SMPPlayer)) return false;
        SMPPlayer that = (SMPPlayer) o;
        return Objects.equals(uuidString, that.uuidString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuidString);
    }

    public boolean isOnline() {
        return false;
    }

    @PostLoad
    public void postLoad() {
        //this.offlinePlayer = Bukkit.getOfflinePlayer(UUID.fromString(uuidString));
    }

    public Set<Role> getRoles() {
        return roles;
    }
}


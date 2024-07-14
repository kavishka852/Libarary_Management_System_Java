package com.library.management.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
    private int id;
    private String username;
    private String password;
    private String enabled;
    private String user_role;

    public User() {
    }

    public User(int id) {
        this.id = id;
    }

    public User(int id, String username, String password, String enabled, String user_role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.user_role = user_role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public String getUser_role() {
        return user_role;
    }

    public void setUser_role(String user_role) {
        this.user_role = user_role;
    }
}

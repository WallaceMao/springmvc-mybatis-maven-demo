package com.wallace.demo.springmvc.model;

import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * Created by  on 2017/6/21.Wallace
 */
public class User {
    private long id;
    private long version = 0L;
    private Boolean accountExpired = false;
    private Boolean accountLocked = false;
    private Boolean enabled = true;
    private String password;
    private Boolean passwordExpired = false;
    /**
     * username具有唯一约束
     */
    private String username;
    private String realName;

    public User() {
    }

    public User(long id) {
        this.id = id;
    }

    public User(String username, String password, String realName) {
        this.password = password;
        this.username = username;
        this.realName = realName;
    }

    public User(long id, String username, String password, String realName) {
        this.id = id;
        this.password = password;
        this.username = username;
        this.realName = realName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public Boolean getAccountExpired() {
        return accountExpired;
    }

    public void setAccountExpired(Boolean accountExpired) {
        this.accountExpired = accountExpired;
    }

    public Boolean getAccountLocked() {
        return accountLocked;
    }

    public void setAccountLocked(Boolean accountLocked) {
        this.accountLocked = accountLocked;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getPasswordExpired() {
        return passwordExpired;
    }

    public void setPasswordExpired(Boolean passwordExpired) {
        this.passwordExpired = passwordExpired;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}

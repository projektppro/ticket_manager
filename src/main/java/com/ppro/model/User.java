package com.ppro.model;

import javax.persistence.*;

/**
 * Created by Arci on 22.11.2016.
 */
@Entity
@Table(name = "customuser")
public class User {
    private Integer id;
    private String password;
    private String username;
    private Boolean accountnotexpired;
    private Boolean accounnotlocked;
    private Boolean credentialsnotexpired;
    private Boolean enable;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "accountnotexpired")
    public Boolean getAccountnotexpired() {
        return accountnotexpired;
    }

    public void setAccountnotexpired(Boolean accountnotexpired) {
        this.accountnotexpired = accountnotexpired;
    }

    @Basic
    @Column(name = "accounnotlocked")
    public Boolean getAccounnotlocked() {
        return accounnotlocked;
    }

    public void setAccounnotlocked(Boolean accounnotlocked) {
        this.accounnotlocked = accounnotlocked;
    }

    @Basic
    @Column(name = "credentialsnotexpired")
    public Boolean getCredentialsnotexpired() {
        return credentialsnotexpired;
    }

    public void setCredentialsnotexpired(Boolean credentialsnotexpired) {
        this.credentialsnotexpired = credentialsnotexpired;
    }

    @Basic
    @Column(name = "enable")
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (username != null ? !username.equals(user.username) : user.username != null) return false;
        if (accountnotexpired != null ? !accountnotexpired.equals(user.accountnotexpired) : user.accountnotexpired != null)
            return false;
        if (accounnotlocked != null ? !accounnotlocked.equals(user.accounnotlocked) : user.accounnotlocked != null)
            return false;
        if (credentialsnotexpired != null ? !credentialsnotexpired.equals(user.credentialsnotexpired) : user.credentialsnotexpired != null)
            return false;
        if (enable != null ? !enable.equals(user.enable) : user.enable != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (accountnotexpired != null ? accountnotexpired.hashCode() : 0);
        result = 31 * result + (accounnotlocked != null ? accounnotlocked.hashCode() : 0);
        result = 31 * result + (credentialsnotexpired != null ? credentialsnotexpired.hashCode() : 0);
        result = 31 * result + (enable != null ? enable.hashCode() : 0);
        return result;
    }
}

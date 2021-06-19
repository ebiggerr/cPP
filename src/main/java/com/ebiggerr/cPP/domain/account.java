package com.ebiggerr.cPP.domain;

import javax.persistence.*;

/**
 * Base class for account
 */
@MappedSuperclass
public class account {

    @Id
    @Column(name="accountid")
    public long id;

    public account(long id){
        this.id=id;
    }

    public account() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    /**
     * Extends from base class to add more attributes
     * Id, Username, Password
     */
    @Entity
    @Table(name = "account")
    public static class accountRequest extends account {

        @Column(name="accountusername")
        private String username;

        @Column(name="accountpassword")
        private String password;


        public accountRequest(long id,String username, String password) {
            super(id);
            this.username = username;
            this.password = password;
        }

        public accountRequest() {
            super();
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

    }
}

package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "session")
public class SessionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long sessionId;
    private String sessionToken;

    @ManyToOne(cascade = CascadeType.ALL)
    private UserEntity userEntity;

    public SessionEntity() {
    }

    public SessionEntity(long sessionId, String sessionToken, UserEntity userEntity) {
        this.sessionId = sessionId;
        this.sessionToken = sessionToken;
        this.userEntity = userEntity;
    }

    public long getSessionId() {
        return sessionId;
    }

    public void setSessionId(long sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }
}

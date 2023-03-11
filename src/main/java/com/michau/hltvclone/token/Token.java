package com.michau.hltvclone.token;

import com.michau.hltvclone.user.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Token {
    @Id
    @GeneratedValue
    @Column(name = "TOKEN_ID")
    private Integer id;
    @Column(name = "TOKEN", unique = true)
    private String token;
    @Enumerated(EnumType.STRING)
    @Column(name = "TOKEN_TYPE")
    private TokenType tokenType = TokenType.BEARER;
    @Column(name = "REVOKED")
    private boolean revoked;
    @Column(name = "EXPIRED")
    private boolean expired;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}

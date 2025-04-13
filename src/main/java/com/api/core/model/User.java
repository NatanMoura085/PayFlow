package com.api.core.model;

import com.api.core.enums.ROLE;

import java.util.List;

public class User {
    private Long id;
    private String nome;
    private String email;
    private ROLE role;
    private List<Order> orders;
    private List<Payment> payments;


    public User(Long id, String nome, String email, ROLE role) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public ROLE getRole() {
        return role;
    }

    public void setId(Long id) {
        this.id = id;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole(ROLE role) {
        this.role = role;
    }


}

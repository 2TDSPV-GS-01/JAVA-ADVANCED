package com.fonteviva.apirest.dto;

public class AuthRequest {
    private String email;
    private String senha;
    // Getters/Setters


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
package com.example.bdbiblioteca1.model;

public class Usuario {
    private String nome;
    private int senha;
    private String nivel;

    public Usuario(String nome, int senha, String nivel) {
        this.nome = nome;
        this.senha = senha;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private int getSenha() {
        return senha;
    }

    private void setSenha(int senha) {
        this.senha = senha;
    }

    public String getNivel() {
        return nivel;
    }
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    public void selecionar(){
        System.out.println("Conteúdo selecionado");
    }
}


package br.com.andersonsantos;

import java.util.List;

/**
 * @author ander
 */
public class Pessoa {

    private String nome;

    private String sexo;

    private int idade;

    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}

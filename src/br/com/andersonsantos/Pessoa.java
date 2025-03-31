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


    public List<Pessoa> popularPessoas() {
        Pessoa p1 = new Pessoa("Anderson", "Masculino");
        Pessoa p2 = new Pessoa("Nataly", "Feminino");
        Pessoa p3 = new Pessoa("Josiane", "Feminino");
        Pessoa p4 = new Pessoa("Anderson", "Masculino");
        Pessoa p5 = new Pessoa("Joana", "Feminino");

        return List.of(p1, p2, p3, p4, p5);
    }
}

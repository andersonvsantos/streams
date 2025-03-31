package br.com.andersonsantos;

import java.util.List;

/**
 * @author ander
 */
public class Pessoa {

    private String nome;

    private String sexo;

    private int idade;

    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Pessoa> popularPessoas() {
        Pessoa p1 = new Pessoa("Anderson", "Masculino", 22);
        Pessoa p2 = new Pessoa("Nataly", "Feminino", 22);
        Pessoa p3 = new Pessoa("Josiane", "Feminino", 37);
        Pessoa p4 = new Pessoa("Anderson", "Masculino", 42);
        Pessoa p5 = new Pessoa("Joana", "Feminino", 69);

        return List.of(p1, p2, p3, p4, p5);
    }
}

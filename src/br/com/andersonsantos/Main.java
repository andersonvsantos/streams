package br.com.andersonsantos;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ander
 */
public class Main {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();

        List<Pessoa> listaMulheres = lista.stream().filter(pessoa -> pessoa.getSexo().equals("Feminino"))
                .collect(Collectors.toList());

        listaMulheres.forEach(p -> System.out.println(p.getNome()));
    }
}

package br.com.andersonsantos;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author ander
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Pessoa> listaPessoas = new ArrayList<>();
        String opcao = "";

        while (!opcao.equals("n")) {
            System.out.println("Informe o nome e o sexo(m/f) separados po virgula:");
            String resposta = scanner.nextLine();
            String[] respostaSeparado = resposta.split(",");
            Pessoa novaPessoa = new Pessoa(respostaSeparado[0], respostaSeparado[1]);
            listaPessoas.add(novaPessoa);
            System.out.println("Deseja inserir mais pessoas? s/n");
            opcao = scanner.nextLine().toLowerCase();
        }

        listaPessoas.forEach(p -> System.out.println());

        List<Pessoa> listaMulheres = listaPessoas.stream().filter(pessoa -> pessoa.getSexo().equals("f"))
                .collect(Collectors.toList());

        System.out.println("Lista de mulheres");
        System.out.println("*****************");
        listaMulheres.forEach(p -> System.out.println(p.getNome()));
        System.out.println("*****************");
    }
}

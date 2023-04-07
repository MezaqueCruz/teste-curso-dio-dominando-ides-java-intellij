package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("O problema dos 3 corpos", 300);
        System.out.println(livro1);
           /*int a = 5;
        int b = 3;
        System.out.println("Hello World! " + (a+b));*/
    }
}

class Livro {
    private String nome;
    private Integer npumPaginas;

    public Livro(String nome, Integer npumPaginas) {
        this.nome = nome;
        this.npumPaginas = npumPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNpumPaginas() {
        return npumPaginas;
    }

    public void setNpumPaginas(Integer npumPaginas) {
        this.npumPaginas = npumPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", npumPaginas=" + npumPaginas +
                '}';
    }
}
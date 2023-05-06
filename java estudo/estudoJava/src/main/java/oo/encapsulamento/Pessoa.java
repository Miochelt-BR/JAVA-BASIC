package oo.encapsulamento;

public class Pessoa {
    private int idade ;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade >=0){
            this.idade = idade;

        }

    }
}

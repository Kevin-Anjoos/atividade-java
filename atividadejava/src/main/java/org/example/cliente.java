package org.example;

public class cliente {
    private String Nome;
    private int idade;
    private pet pet;

    //contrutor.


    public cliente(String nome, int idade, org.example.pet pet) {
        Nome = nome;
        this.idade = idade;
        this.pet = pet;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public org.example.pet getPet() {
        return pet;
    }

    public void setPet(org.example.pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "cliente{" +
                "Nome='" + Nome + '\'' +
                ", idade=" + idade +
                ", pet=" + pet +
                '}';
    }
}

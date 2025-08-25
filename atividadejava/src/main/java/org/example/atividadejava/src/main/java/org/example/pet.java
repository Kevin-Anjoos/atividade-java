package org.example;

public class pet {
    private String nomepet;
    private int idade;
    private String raca;

    //contrutor.

    public pet(String nomepet, int idade, String raca) {
        this.nomepet = nomepet;
        this.idade = idade;
        this.raca = raca;
    }

    public String getNomepet() {
        return nomepet;
    }

    public void setNomepet(String nomepet) {
        this.nomepet = nomepet;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "pet{" +
                "nomepet='" + nomepet + '\'' +
                ", idade=" + idade +
                ", raca='" + raca + '\'' +
                '}';
    }
}

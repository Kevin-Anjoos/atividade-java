package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        pet p1 = new pet("Thor",2,"pit");
        cliente c1 = new cliente("Marta",25,p1);

        System.out.println(c1.toString());
    }
}

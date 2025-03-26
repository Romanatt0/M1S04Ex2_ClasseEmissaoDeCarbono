package main;

import classes.EmissaoCabono;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        EmissaoCabono Carro = new EmissaoCabono(20);

        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite o tempo em minutos: ");
        double tempo = entrada.nextDouble();

        System.out.printf("A emissao de carbono desse objeto é: %.2f km/h", Carro.calcularEmissao(tempo));
    }
}
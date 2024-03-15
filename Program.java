package Fatec.aulas.Grace.Atividades;

import java.util.Locale;
import java.util.Scanner;

public class Program{
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Circulo c1 = new Circulo();
        Scanner lerDado = new Scanner(System.in);
        double R;


        System.out.print("Insira o valor do raio: ");
        R = lerDado.nextDouble();
        c1.setRaio(R);


        System.out.printf("Diâmetro: %.2f %n" +
                "Área: %.2f %n" +
                "Circunferência: %.2f %n",
                c1.diametro(), c1.area(), c1.circunferencia());

    }
}

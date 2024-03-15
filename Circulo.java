package Fatec.aulas.Grace.Atividades.cinco05;

public class Circulo {
    private double raio;
    private final double PI = 3.14159;
    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public double diametro(){
        return 2 * getRaio();
    }

    public double area(){
        return PI * Math.pow(getRaio() , 2);
    }

    public double circunferencia(){
        return 2 * PI * getRaio();
    }

}

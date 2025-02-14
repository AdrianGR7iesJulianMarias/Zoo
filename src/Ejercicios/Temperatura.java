package Ejercicios;

public class Temperatura {

    private static double temperaturaC;
    private static double temperaturaF;

    public Temperatura() {}
    public static double getTemperaturaC() {return temperaturaC;}
    public static double getTemperaturaF() {return temperaturaF;}

    public static void setTemperaturaC(double temperaturaC) {Temperatura.temperaturaC = temperaturaC;}
    public static void setTemperaturaF(double temperaturaF) {Temperatura.temperaturaF = temperaturaF;}

    public static double celsiusToFarenheit(double temperaturaC) {return (temperaturaC * 9 / 5) + 32;}
    public static double farenheitToCelsius(double temperaturaF) {return (temperaturaF - 32) * 5 / 9;}
}
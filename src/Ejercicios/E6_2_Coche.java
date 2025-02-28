package Ejercicios;

public class E6_2_Coche {
    private int velocidad;


    public E6_2_Coche() {
        this.velocidad = 0;
    }

    public int getVelocidad() {
        return velocidad;
    }
    public void acelera(int velocidad) {
        this.velocidad += velocidad;

    }

    public void frena(int velocidad) {
        this.velocidad -= velocidad;
        System.out.println("hola2");
    }


}




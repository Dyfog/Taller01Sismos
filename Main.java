import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] sismos = llenarSismos();
        leerMayorSismo(sismos);
        System.out.println(contarSismosMayor5(sismos));
        mandaSms(sismos);
    }
    public static double[] llenarSismos (){
        double[] arreglo = new double[168];
        for (int i=0;i<arreglo.length;i++){
            arreglo[i]= (Math.floor((Math.random()*10)*10))/10;
            System.out.println(arreglo[i]);
        }
        return arreglo;
    }
    public static void leerSismos(double[] sismos){
        for (double sismo : sismos) {
            System.out.println(sismo);
        }
    }
    public static void leerMayorSismo(double[] sismos){
        double mayorSismo = 0;
        for (double sismo : sismos) {
            if (sismo > mayorSismo) {
                mayorSismo = sismo;
            }
        }
        System.out.println(mayorSismo);
    }
    public static int contarSismosMayor5 (double[] sismos){
        int cantSismos = 0;
        for (double sismo : sismos){
            if (sismo>=5){
                cantSismos++;
            }
        }
        return cantSismos;
    }
    public static void mandaSms (double[] sismos){
        for (double sismo : sismos){
            if (sismo>=7){
                System.out.println("En estos momentos hay un sismo de gran intensidad (mayor o igual a 7), por lo que debe evacuar lo antes posible");
            }
        }
    }
    public static void menu (){
        Scanner in = new Scanner(System.in);
        System.out.println("Bienvenido, ingrese una de las siguientes opciones:");
        System.out.println("1.-Ingresar datos");
        System.out.println("2.-Mostrar sismo de mayor magnitud");
        System.out.println("1.-Ingresar datos");
        System.out.println("1.-Ingresar datos");

    }
}

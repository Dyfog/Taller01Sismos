import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
        System.out.println("El sismo de mayor intensidad fue de: "+mayorSismo);
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
        double[] sismos = new double[168];
        Scanner in = new Scanner(System.in);
        System.out.println("Bienvenido, ingrese una de las siguientes opciones:");
        System.out.println("1.-Ingresar datos");
        System.out.println("2.-Mostrar sismo de mayor magnitud");
        System.out.println("3.-Contar sismos mayores o iguales a 5");
        System.out.println("4.-Enviar SMS por cada sismo mayor o igual a 7.0");
        System.out.println("5.-Salir del programa");
        int eleccion = in.nextInt();
        switch (validarRangoNumero(eleccion,1,5)){
            case 1:
                sismos = llenarSismos();
                System.out.println("Datos ingresados exitosamente!");
                break;
            case 2:
                leerMayorSismo(sismos);
                break;
            case 3:
                System.out.println("La cantidad de sismos de intensidad mayor o igual a 5 fueron: "+contarSismosMayor5(sismos));
                break;
            case 4:
                mandaSms(sismos);
                break;
            case 5:
                System.out.println("Está seguro?");
                System.out.println("1.-Si");
                System.out.println("2.-No");
                int salir = validarRangoNumero(in.nextInt(),1,2);
                if (salir==2){
                    menu();
                }

        }
    }
    public static int validarRangoNumero (int numero,int min,int max){
        Scanner in = new Scanner(System.in);
        try{
            while (numero<min || numero>max){
                System.out.println("El numero no esta dentro de los parametros, ingrese nuevamente: ");
                numero = in.nextInt();
            }
            return numero;
        }catch (Exception e){
            System.out.println("el valor ingresado no es valido, ingrese nuevamente");
            validarRangoNumero(numero,min,max);
        }
        return numero;
    }
}

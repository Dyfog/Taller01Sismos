public class Main {
    public static void main(String[] args) {
        double[] sismos = new double[168];
        sismos = llenar_sismos();
    }
    public static double[] llenar_sismos (){
        double[] arreglo = new double[168];
        for (int i=0;i<arreglo.length;i++){
            arreglo[i]= (double)(Math.round(((Math.random()*10)*100d)/100d));
            System.out.println(arreglo[i]);
        }
        return arreglo;
    }
}

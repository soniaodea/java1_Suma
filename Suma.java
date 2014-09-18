import java.util.Scanner;

public class Suma {

    public static void main(String args[]){
       //aqui creamos el scanner para escanear cualquier cosa en este caso el de los numeros que ingresemos
        Scanner sc = new Scanner(System.in);
        int numero1,numero2,suma;
        System.out.println("ingresa el numero1:n");
        numero1 = sc.nextInt();
        System.out.println("ingresa el numero2:n");
        numero2 = sc.nextInt();
        //aqui se leen los dos numeros XD 
        suma = numero1+numero2;
        System.out.println("la suma de ambos numeros es:"+suma);
    }
    
}

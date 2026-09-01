package ejercicios;
import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    System.out.print("Ingresa tu nombre: ");
    String name=scanner.nextLine();
    System.out.print("Ingresa tu edad: ");
    int ed=scanner.nextInt();
    System.out.println("Hola "+name);
    System.out.println("Tienes "+ed+" años");
    scanner.close();
}
}
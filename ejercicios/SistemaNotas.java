package ejercicios;
import java.util.Scanner;
public class SistemaNotas {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nombre del estudiante: ");
        scanner.nextLine();
        System.out.print("Nota 1: ");
        Double nota1=scanner.nextDouble();
        System.out.print("Nota 2: ");
        Double nota2=scanner.nextDouble();
        System.out.print("Nota 3: ");
        Double nota3=scanner.nextDouble();
        scanner.close();
        Double promedio = (nota1+nota2+nota3)/3;
        String estado=promedio>=51?"Aprobado":"Reprobado";
        System.out.printf("Promedio: %.2f%n",promedio);
        System.out.println("Estado: "+estado); 
    }
}

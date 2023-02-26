import java.text.DecimalFormat;
import java.util.Scanner;

public class Empleado {
    Scanner leer = new Scanner(System.in);
    String Nombre, Apellido, Puesto;
    int Edad;
    double salario;
    DecimalFormat formato = new DecimalFormat("###.##");

    public Empleado() {
        System.out.println("*****BIENVENIDO AL SISTEMA DE EMPLEADOS*****");
        System.out.println("Como haz estado?");
    }

    public void lectura() {
        System.out.println("Escriba el nombre del empleado");
        Nombre = leer.nextLine();
        System.out.println("Escriba el apellido del empleado");
        Apellido = leer.nextLine();
        System.out.println("Escriba el puesto del empleado");
        Puesto = leer.nextLine();
        System.out.println("Escriba la edad del empleado");
        Edad = leer.nextInt();
        System.out.println("Escriba el salario del empleado");
        salario = leer.nextDouble();

    }

    public void mensaje() {
        System.out.println("Nombre completo: " + Nombre
                + " " + Apellido +
                "\n Edad: " + Edad +
                "\n Puesto: " + Puesto
                + "\n Salario base: $" + formato.format(salario));
    }

}
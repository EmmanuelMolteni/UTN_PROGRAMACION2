
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author manu7
 */
public class TPSemana1 {

  public static void main(String[] args) {
    HolaMundo saludar = new HolaMundo();
    saludar.saludo();
    MostrarValores infoAlumno = new MostrarValores();
    infoAlumno.mostrar();
    RegistrarUsuario usuario = new RegistrarUsuario();
    usuario.registro();
    Operaciones calcular = new Operaciones();
    calcular.calcular();
    CharEscape chEscap = new CharEscape();
    chEscap.mostrar();
    Conversiones convert = new Conversiones();
    convert.dividir();
    ErrorEjemplo mostrar = new ErrorEjemplo();
    mostrar.mostrarErrorSolucionado();
  }
}

class HolaMundo {
  public void saludo(){
    System.out.println("Hola Java!");
  }
}

class MostrarValores {
  public void mostrar(){
    int edad;
    String nombre;
    double altura;
    boolean estudiante;
    
    edad = 18;
    nombre = "Pepe";
    altura = 1.65;
    estudiante = true;
    
    System.out.println(nombre + " " + edad + " "+ altura + " " + estudiante);
  }
}

class RegistrarUsuario {
  public void registro(){
    Scanner input = new Scanner(System.in);
    String nombre;
    int edad;
    System.out.println("Ingrese nombre");
    nombre = input.nextLine();
    System.out.println("Ingrese edad");
    edad = Integer.parseInt(input.nextLine());
    
    System.out.println("Nombre es: " + nombre);
    System.out.println("Edad es: " + edad);
  }
}

class Operaciones {
  public void calcular(){
    Scanner input = new Scanner(System.in);
    int num1, num2, suma, resta, mult;
    double div;
    
    System.out.println("Ingrese primer numero");
    num1 = Integer.parseInt(input.nextLine());
    System.out.println("Ingrese segundo numero");
    num2 = Integer.parseInt(input.nextLine());
    
    suma = num1 + num2;
    resta = num1 - num2;
    mult = num1 * num2;
    
    div = (double)num1 / (double)num2;
    
    System.out.println("result suma: " + suma);
    System.out.println("result resta: " + resta);
    System.out.println("result mult: " + mult);
    System.out.println("result div: " + div);
  }
}


class CharEscape {
  public void mostrar(){
    System.out.println("Nombre: Juan Perez\n");
    System.out.println("Edad: 30 anios\n");
    System.out.println("Direccion: \"Calle falsa 1234\"");
  }
}

class Conversiones {
  public void dividir(){
    Scanner input = new Scanner(System.in);
    int resultadoEntero;
    double resultadoDouble;
    System.out.println("Ingrese primer valor");
    int num1 = Integer.parseInt(input.nextLine());
    int num2 = Integer.parseInt(input.nextLine());
    
    resultadoEntero = num1 / num2;
    resultadoDouble = (double)num1 / (double)num2;
    System.out.println("division entera: " + resultadoEntero);
    System.out.println("division double: " + resultadoDouble);
  }
}

class ErrorEjemplo{
  public void mostrarErrorSolucionado(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingresa tu nombre: ");
    String nombre = scanner.nextLine();
    System.out.println("Hola, " + nombre);
  }
}
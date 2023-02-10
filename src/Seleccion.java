
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ivamar
 */
public class Seleccion {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        MetodosCuenta CreadorCuenta= new MetodosCuenta();
        int opcion;
                
        do {
        System.out.println("====== BANCO UNIVERSAL ======");
        System.out.println("Seleccione una opción: ");
        System.out.println();
        System.out.println("1. Alta de cuentas");
        System.out.println("2. Consulta de una cuenta");
        System.out.println("3. Modificar cuentas");
        System.out.println("4. Anular cuentas");
        System.out.println("5. Listado de cuentas");
        System.out.println("0. Salir");
            opcion = tcl.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Estoy en metodo 1");
                   CreadorCuenta.NuevaCuenta();
                    break;
                case 2:
                    System.out.println("Estoy en metodo 2");

                    break;
                case 3:
                    System.out.println("Estoy en metodo 3");

                    break;
                case 4:
                    System.out.println("Estoy en metodo 4");

                    break;
                case 5:
                    System.out.println("Estoy en metodo 5");

                    break;
            }
        } while (opcion != 0 );
        
    }

}

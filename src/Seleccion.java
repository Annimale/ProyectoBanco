
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
        MetodosCuenta CreadorCuenta = new MetodosCuenta();
        Cuenta cuentaprueba = new Cuenta();
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
                    System.out.println("Dando de alta su cuenta");
                    CreadorCuenta.NuevaCuenta();
                    break;
                case 2:
                    System.out.println("Realizando consulta de su cuenta");
                    CreadorCuenta.verCuenta(cuentaprueba);
                    break;
                case 3:
                    System.out.println("Modificando su cuenta");
                    CreadorCuenta.ModificarCuenta();
                    break;
                case 4:
                    System.out.println("Anulando su cuenta");
                    CreadorCuenta.anularCuenta();
                    break;
                case 5:
                    System.out.println("Listado total de cuentas disponibles");
                    CreadorCuenta.visualizarCuentas();
                    break;
            }
        } while (opcion != 0);

    }

}

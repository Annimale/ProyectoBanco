
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ivamar
 */
public class MetodosCuenta {

    private ArrayList<Cuenta> cuentasTotales = new ArrayList();
    private int total;

    public MetodosCuenta() {
        cuentasTotales = new ArrayList();
        total = 0;
    }

    public Cuenta buscarCuenta() {
        int numero;
        String nombre;
        String numcta;
        Scanner tcl = new Scanner(System.in);
        Cuenta penas;
        System.out.println("Digame si quiere buscar su cuenta por: 1 Nombre  2 Numero de cuenta");
        numero = tcl.nextInt();
        tcl.nextLine();

        if (numero == 1) {
            System.out.println("Introduce el nombre de la cuenta a buscar");
            nombre = tcl.nextLine();
            penas = poscuentanombre(nombre);
        } else {
            System.out.println("Introduce el numero de cuenta a buscar");
            numcta = tcl.nextLine();
            penas = poscuenta(numcta);
        }
        return penas;
    }

    public Cuenta poscuentanombre(String nombre) {
        for (int i = 0; i < cuentasTotales.size(); i++) {
            if (cuentasTotales.get(i).getNombre().equals(nombre)) {
                return cuentasTotales.get(i);
            }
        }
        return null;
    }

    public Cuenta poscuenta(String numcta) {
        for (int i = 0; i < cuentasTotales.size(); i++) {
            if (cuentasTotales.get(i).getCuenta().equals(numcta)) {
                return cuentasTotales.get(i);
            }
        }
        return null;
    }

    public int NuevaCuenta() {
        Cuenta nueva = new Cuenta();
        Scanner tcl = new Scanner(System.in);
        int posicion = 0;
        String nom, nomCuenta;
        double saldo, intereses;
        boolean erroneo = false;

        do {
            try {

                System.out.println("Introduzca su nombre");
                nom = tcl.nextLine();
               // erroneo = true;
                nueva.setNombre(nom);
                //erroneo = false;
            } catch (Exception e) {
                System.out.println("El error es: " + e.getMessage());
            }

        } while (erroneo);

        do {
            try {
                System.out.println("Introduzca su numero de cuenta");
                nomCuenta = tcl.nextLine();
                //erroneo = true;
                nueva.setCuenta(nomCuenta);
                for (int i = 0; i < cuentasTotales.size(); i++) {
                    if (cuentasTotales.get(i).getCuenta().equals(nomCuenta)) {
                        throw new Exception("Esta cuenta ya existe");

                    }

                }
                //erroneo = false;
            } catch (Exception e) {
                System.out.println("El error es: " + e.getMessage());
            }
        } while (erroneo);

        do {
            try {
                System.out.println("Introduzca su saldo");
                saldo = tcl.nextDouble();
                //erroneo = true;

                nueva.setSaldo(saldo);
               // erroneo = false;
            } catch (Exception e) {
                System.out.println("El error es:  " + e.getMessage());
            }
        } while (erroneo);

        do {
            try {
                System.out.println("Introduzca su interes");
                intereses = tcl.nextDouble();
                //erroneo = true;
                nueva.setTipoDeInteres(intereses);
               // erroneo = false;
            } catch (Exception e) {
                System.out.println("El error es:   " + e.getMessage());
            }
        } while (erroneo);

        cuentasTotales.add(nueva);
        return posicion;
    }
    public static void main(String[] args) {
    }
}


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

    public void ModificarCuenta() {
        Scanner tcl = new Scanner(System.in);
        int posicion = cuentasTotales.indexOf(buscarCuenta());
        System.out.println("Introduzca su nuevo nombre");
        try {
            String newName = tcl.nextLine();
            cuentasTotales.get(posicion).setNombre(newName);

        } catch (Exception a) {
            System.out.println(a.getMessage());
        }

        System.out.println("Introduzca su nuevo saldo");
        try {
            int newSaldo = tcl.nextInt();
            cuentasTotales.get(posicion).setSaldo(newSaldo);
        } catch (Exception a) {
            System.out.println(a.getMessage());
        }

        System.out.println("Introduzca su nuevo tipo de interes");
        try {
            int newInteres = tcl.nextInt();
            cuentasTotales.get(posicion).setTipoDeInteres(newInteres);

        } catch (Exception a) {
            System.out.println(a.getMessage());
        }

    }

    public void anularCuenta(){
        int posicion = cuentasTotales.indexOf(buscarCuenta());
        if (cuentasTotales.get(posicion).getSaldo() == 0) {
            cuentasTotales.remove(posicion);

        } else {
            System.out.println("Su cuenta tiene que tener 0 de saldo");
        }
    }

    public void verCuenta(Cuenta cuenta) {
        System.out.println("El numero de la cuenta es: " + cuenta.getCuenta());
        System.out.println("El nombre de la cuenta es: " + cuenta.getNombre());
        System.out.println("El saldo de la cuenta es de: " + cuenta.getSaldo() + "  euros");
        System.out.println("Y su tipo de interés es del: " + cuenta.getTipoDeInteres() + " %");

    }

    public void visualizarCuentas() {
        System.out.println("Tenemos las siguientes cuentas");
        for (int i = 0; i < cuentasTotales.size(); i++) {
            System.out.println(cuentasTotales.get(i).getCuenta() + " ,");

        }

    }

}


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
        ArrayList<Cuenta> cuentasTotales = new ArrayList();
        int total;
    }

    public Cuenta buscarCuenta() {
        int numero;
        String nombre;
        String numcta;
        Scanner tcl = new Scanner(System.in);
        Cuenta penas=null;
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

    public void NuevaCuenta() {
        boolean booleano = false;
        do {
            try {
                Scanner tcl = new Scanner(System.in);
                System.out.println("Introduzca 1 para crear su nueva cuenta, y 2 si quiere volver al menu de seleccion");
                int opcion = tcl.nextInt();
                tcl.nextLine();
                switch (opcion) {
                    case 1:
                        Cuenta newCuenta;
                        System.out.print("Introduzca su numero de cuenta : ");
                        String numCuenta = tcl.nextLine();
                        System.out.print("\nIntroduzca su nombre: ");
                        String nombre = tcl.nextLine();
                        System.out.print("\nIntroduzca el saldo: ");
                        double saldo = tcl.nextDouble();
                        System.out.print("\nIntroduzca el tipo de interés : ");
                        double tipoDeInteres = tcl.nextDouble();
                        newCuenta = new Cuenta(numCuenta, nombre, saldo, tipoDeInteres);
                        cuentasTotales.add(newCuenta);
                        System.out.println("La posición en la que se encuenta la cuenta creada es la " + total);
                        total++;
                        break;
                    case 2:
                        booleano = false;
                        break;

                }
            } catch (Exception e) {
                booleano = true;
                System.out.println(e.getMessage());
            }
        } while (booleano);
    }

    public void ModificarCuenta() {
        int posicion = cuentasTotales.indexOf(buscarCuenta());
        Scanner tcl = new Scanner(System.in);

        System.out.print("Introduzca el numero de cuenta de su nueva cuenta: ");
        String nCuenta = tcl.nextLine();
        try {
            cuentasTotales.get(posicion).setCuenta(nCuenta);
        } catch(errorDatos e) {
            System.out.println(e.getMessage());
        }
        

        System.out.print("\nIntroduzca el nombre de su nueva cuenta: ");
        String nombre = tcl.nextLine();
        try {
            cuentasTotales.get(posicion).setNombre(nombre);
        } catch(errorDatos e) {
            System.out.println(e.getMessage());
        }
        

        System.out.print("\nIntroduzca el saldo de su nueva cuenta: ");
        double saldo = tcl.nextDouble();
        
        try {
            cuentasTotales.get(posicion).setSaldo(saldo);
        } catch(errorDatos e) {
            System.out.println(e.getMessage());
        }
        

        System.out.print("\nIntroduzca el interes de su nueva cuenta: ");
        double tipoDeInteres = tcl.nextDouble();
        try {
            cuentasTotales.get(posicion).setTipoDeInteres(tipoDeInteres);
        } catch(errorDatos e) {
            System.out.println(e.getMessage());
        }
        
    }

    public void anularCuenta() {
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
        System.out.println("Y su tipo de interés es del: " + cuenta.getTipoDeInteres()+ " %");

    }
    public void ConsultarCuenta() {
        int posicion = cuentasTotales.indexOf(buscarCuenta());
        System.out.println("\nEl nombre de la cuenta es " + cuentasTotales.get(posicion).getNombre());
        System.out.println("El numero de la cuenta es " + cuentasTotales.get(posicion).getCuenta());
        System.out.println("El saldo de la cuenta es " + cuentasTotales.get(posicion).getSaldo());
        System.out.println("El interés de la cuenta es " + cuentasTotales.get(posicion).getTipoDeInteres());
    }

    public void visualizarCuentas() {
        System.out.println("Tenemos las siguientes cuentas");
        for (int i = 0; i < cuentasTotales.size(); i++) {
            System.out.println("La cuenta en la posición " + i + " tiene estos datos: ");
            System.out.println("Nombre de la cuenta es: " + cuentasTotales.get(i).getNombre());
            System.out.println("Numero de la cuenta es: " + cuentasTotales.get(i).getCuenta());
            System.out.println("Saldo de la cuenta es: " + cuentasTotales.get(i).getSaldo());
            System.out.println("Interes de la cuenta es: " + cuentasTotales.get(i).getTipoDeInteres());

        }

    }

}

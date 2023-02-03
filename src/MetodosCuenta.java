
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

    private static ArrayList<Cuenta> cuentasTotales = new ArrayList();
    private int total;

    public static void buscarCuenta() {
        int numero;
        Scanner tcl = new Scanner(System.in);

        System.out.println("Digame si quiere buscar su cuenta por: 1 Nombre  2 Numero de cuenta");
        numero = tcl.nextInt();
        if (numero == 1) {
            //HACER METODO POSCUENTANOMBRE

        } else {
            //HACER METODO POSCUENTA
        }
    }

    public static Cuenta poscuentanombre(String nombre) {
        for (int i = 0; i < cuentasTotales.size(); i++) {
            if (cuentasTotales.get(i).getNombre().equals(nombre)) {
                return cuentasTotales.get(i);
            }
        }
        return null;
    }

}

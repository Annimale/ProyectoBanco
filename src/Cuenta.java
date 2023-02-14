
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ivamar
 */
class errorDatos extends Exception {

    public errorDatos(String msj) {
        super(msj);
    }
}

public class Cuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoDeInteres;

    public Cuenta(String nombre, String cuenta, double saldo, double tipoDeInteres) throws errorDatos {
        if (tipoDeInteres < 0) {
            throw new errorDatos("El tipo de interes no puede ser menor a 0");
        } else {
            this.tipoDeInteres = tipoDeInteres;
        }
        if (nombre.equals("")) {
            throw new errorDatos("El nombre no puede estar vacio");
        } else {
            this.nombre = nombre;
        }
        if (cuenta.equals("")) {
            throw new errorDatos("La cuenta no puede estar vacia");
        } else {
            this.cuenta = cuenta;
        }
        if (saldo < 0) {
            throw new errorDatos("Saldo negativo");
        } else {
            this.saldo = saldo;
        }

        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoDeInteres = tipoDeInteres;
    }

    public void reintegro(double cantidad) throws errorDatos {
        if (this.saldo < cantidad) {
            throw new errorDatos("No puede ingresar una cantidad mayor al saldo");
        } else {
            this.saldo = cantidad - this.saldo;
        }

    }

    public Cuenta() {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoDeInteres = tipoDeInteres;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTipoDeInteres() {
        return tipoDeInteres;
    }

    public void setNombre(String nombre) throws errorDatos {
        if (nombre.equals("")) {
            throw new errorDatos("El nombre no puede estar vacio");
        } else {
            this.nombre = nombre;
        }
    }

    public void setCuenta(String cuenta) throws errorDatos {
        if (cuenta.equals("")) {
            throw new errorDatos("La cuenta no puede estar vacia");
        } else {
            this.cuenta = cuenta;
        }
    }

    public void setSaldo(double saldo) throws errorDatos {
        if (saldo < 0) {
            throw new errorDatos("Saldo negativo");
        } else {
            this.saldo = saldo;
        }
    }

    public void setTipoDeInteres(double tipoDeInteres) throws errorDatos {
        if (tipoDeInteres < 0) {
            throw new errorDatos("El tipo de interes no puede ser menor a 0");
        } else {
            this.tipoDeInteres = tipoDeInteres;
        }
    }
}

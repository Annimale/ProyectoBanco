/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivamar
 */
public class Cuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoDeInteres;

    public Cuenta(String nombre, String cuenta, double saldo, double tipoDeInteres) throws Exception {
        if (tipoDeInteres < 0) {
            throw new Exception("El tipo de interes no puede ser menor a 0");
        }
        if (nombre.equals("")) {
            throw new Exception("El nombre no puede estar vacio");
        }
        if (cuenta.equals("")) {
            throw new Exception("La cuenta no puede estar vacia");
        }
        if (saldo < 0) {
            throw new Exception("Saldo negativo");
        }

        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoDeInteres = tipoDeInteres;
    }

    public void reintegro(double cantidad) throws Exception {
        if (this.saldo < cantidad) {
            throw new Exception("No puede ingresar una cantidad mayor al saldo");
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

    public void setNombre(String nombre) throws Exception {
       if (nombre.equals("")) {
            throw new Exception("El nombre no puede estar vacio");
        }
       this.nombre = nombre;
    }

    public void setCuenta(String cuenta) throws Exception{
        if (cuenta.equals("")) {
            throw new Exception("La cuenta no puede estar vacia");
        }
        this.cuenta = cuenta;
    }

    public void setSaldo(double saldo) throws Exception{
        if (saldo < 0) {
            throw new Exception("Saldo negativo");
        }
        this.saldo = saldo;
    }

    public void setTipoDeInteres(double tipoDeInteres) throws Exception{
        if (tipoDeInteres < 0) {
            throw new Exception("El tipo de interes no puede ser menor a 0");
        }
        this.tipoDeInteres=tipoDeInteres;
    }
    

}

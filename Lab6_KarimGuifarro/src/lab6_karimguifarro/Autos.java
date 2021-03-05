/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_karimguifarro;


public class Autos {
    private String VIN,marca,modelo,carroceria,color;
    private int cant_pasajeros,capacidad_maletero,precio,potencia;

    public Autos() {
    }

    public Autos(String VIN, String marca, String modelo, String carroceria, String color, int cant_pasajeros, int capacidad_maletero, int precio, int potencia) {
        this.VIN = VIN;
        this.marca = marca;
        this.modelo = modelo;
        this.carroceria = carroceria;
        this.color = color;
        this.cant_pasajeros = cant_pasajeros;
        this.capacidad_maletero = capacidad_maletero;
        this.precio = precio;
        this.potencia = potencia;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCant_pasajeros() {
        return cant_pasajeros;
    }

    public void setCant_pasajeros(int cant_pasajeros) {
        this.cant_pasajeros = cant_pasajeros;
    }

    public int getCapacidad_maletero() {
        return capacidad_maletero;
    }

    public void setCapacidad_maletero(int capacidad_maletero) {
        this.capacidad_maletero = capacidad_maletero;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
}

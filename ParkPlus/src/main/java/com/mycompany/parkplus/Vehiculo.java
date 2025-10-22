/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parkplus;

/**
 *
 * @author pchin
 */
public class Vehiculo {
    
    private String placa;
    private String carnet;
    private String nombre;

    public Vehiculo(String placa, String carnet, String nombre) {
        this.placa = placa;
        this.carnet = carnet;
        this.nombre = nombre;
    }

    public String getPlaca() {
        return placa;
    }
    public String getCarnet() {
        return carnet;
    }
    public String getNombre() {
        return nombre;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

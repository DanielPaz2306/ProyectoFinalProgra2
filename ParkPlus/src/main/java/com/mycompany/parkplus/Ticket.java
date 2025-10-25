/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parkplus;
import java.time.LocalDateTime; 

/**
 *
 * @author pchin
 */
public class Ticket {
    private Vehiculo vehiculo;
    private String tarifa; //F = FLAT ; V = VARIABLE
    private LocalDateTime fecha;
    private String tipoVehiculo; // M = MOTO | C = CARRO | CT = CATEDRATICO
    private String lugarAsignado; 
    private String idTicket;
    public long totalTicket;

    public Ticket(Vehiculo vehiculo, String tarifa, LocalDateTime fecha, String tipoVehiculo, String lugarAsignado, String idTicket, long totalTicket) {
        this.vehiculo = vehiculo;
        this.tarifa = tarifa;
        this.fecha = fecha;
        this.tipoVehiculo = tipoVehiculo;
        this.lugarAsignado = lugarAsignado;
        this.idTicket = idTicket;
        this.totalTicket = totalTicket;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public String getTarifa() {
        return tarifa;
    }
    public LocalDateTime getFecha() {
        return fecha;
    }
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }
    public String getLugarAsignado() {
        return lugarAsignado;
    }
    public String getIdTicket() {
        return idTicket;
    }
    public long getTotalTicket() {
        return totalTicket;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
    public void setLugarAsignado(String lugarAsignado) {
        this.lugarAsignado = lugarAsignado;
    }
    public void setIdTicket(String idTicket) {
        this.idTicket = idTicket;
    }
    public void setTotalTicket(long totalTicket) {
        this.totalTicket = totalTicket;
    }
    
    public void generarTicket(){
        
    }
    
    
}

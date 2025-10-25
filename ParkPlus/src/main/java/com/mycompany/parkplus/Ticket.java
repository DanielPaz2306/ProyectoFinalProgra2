/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parkplus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;


/**
 *
 * @author pchin
 */
public class Ticket {

    private Vehiculo vehiculo;
    private String tarifa; //F = FLAT ; V = VARIABLE
    private String fecha;
    private String tipoVehiculo; // M = MOTO | C = CARRO | CT = CATEDRATICO
    private Integer lugarAsignado; 
    private String idTicket;
    public long totalTicket;

    public Ticket(Vehiculo vehiculo, String tarifa, String fecha, String tipoVehiculo, Integer lugarAsignado, String idTicket, long totalTicket) {
        this.vehiculo = vehiculo;
        this.tarifa = tarifa;
        this.fecha = fecha;
        this.tipoVehiculo = tipoVehiculo;
        this.lugarAsignado = lugarAsignado;
        this.totalTicket = totalTicket;
    } //Para Ticket Flat
    
    public Ticket(Vehiculo vehiculo, String tarifa, String fecha, String tipoVehiculo, Integer lugarAsignado) {
        this.vehiculo = vehiculo;
        this.tarifa = tarifa;
        this.fecha = fecha;
        this.tipoVehiculo = tipoVehiculo;
        this.lugarAsignado = lugarAsignado;
    } //Para Ticket Variable

    
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public String getTarifa() {
        return tarifa;
    }
    public String getFecha() {
        return fecha;
    }
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }
    public Integer getLugarAsignado() {
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
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
    public void setLugarAsignado(Integer lugarAsignado) {
        this.lugarAsignado = lugarAsignado;
    }
    public void setIdTicket(String idTicket) {
        this.idTicket = idTicket;
    }
    public void setTotalTicket(long totalTicket) {
        this.totalTicket = totalTicket;
    }
    
    public void imprimirTicketFlatCarro(){
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("MM/dd");
        String fechaFormateada = ahora.format(formato);
        JOptionPane.showMessageDialog(null,
                  "ID Ticket: " + this.idTicket
                + "Fecha de Ingreso: " + this.fecha
                + "Fecha de Salida: " + fechaFormateada
                + "Placa: " + this.vehiculo.getPlaca()
                + "Nombre: "+ this.vehiculo.getNombre()
                + "Carnet: "+ this.vehiculo.getCarnet()
                + "Tarifa Pagada: "+ this.tarifa
                + "Tipo de Vehiculo: "+ this.vehiculo.getTipo()
                + "Lugar Asignado: C"+ this.lugarAsignado
                + "Total a Pagar: Q"+ this.totalTicket);
    }
    public void imprimirTicketFlatMoto(){
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("MM/dd");
        String fechaFormateada = ahora.format(formato);
        JOptionPane.showMessageDialog(null,
                  "ID Ticket: " + this.idTicket
                + "Fecha de Ingreso: " + this.fecha
                + "Fecha de Salida: " + fechaFormateada
                + "Placa: " + this.vehiculo.getPlaca()
                + "Nombre: "+ this.vehiculo.getNombre()
                + "Carnet: "+ this.vehiculo.getCarnet()
                + "Tarifa Pagada: "+ this.tarifa
                + "Tipo de Vehiculo: "+ this.vehiculo.getTipo()
                + "Lugar Asignado: M"+ this.lugarAsignado
                + "Total a Pagar: Q"+ this.totalTicket);
    }
    public void imprimirTicketFlatCatedratico(){
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("MM/dd");
        String fechaFormateada = ahora.format(formato);
        JOptionPane.showMessageDialog(null,
                  "ID Ticket: " + this.idTicket
                + "Fecha de Ingreso: " + this.fecha
                + "Fecha de Salida: " + fechaFormateada
                + "Placa: " + this.vehiculo.getPlaca()
                + "Nombre: "+ this.vehiculo.getNombre()
                + "Carnet: "+ this.vehiculo.getCarnet()
                + "Tarifa Pagada: "+ this.tarifa
                + "Tipo de Vehiculo: "+ this.vehiculo.getTipo()
                + "Lugar Asignado: CT"+ this.lugarAsignado
                + "Total a Pagar: Q"+ this.totalTicket);
    }
    
    public void imprimirTicketVariableCarro(){
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("MM/dd");
        String fechaFormateada = ahora.format(formato);
        JOptionPane.showMessageDialog(null,
                  "ID Ticket: " + this.idTicket
                + "Fecha de Ingreso: " + this.fecha
                + "Fecha de Salida: " + fechaFormateada
                + "Placa: " + this.vehiculo.getPlaca()
                + "Nombre: "+ this.vehiculo.getNombre()
                + "Carnet: "+ this.vehiculo.getCarnet()
                + "Tarifa Pagada: "+ this.tarifa
                + "Tipo de Vehiculo: "+ this.vehiculo.getTipo()
                + "Lugar Asignado: C"+ this.lugarAsignado
                + "Total a Pagar: Q"+ this.totalTicket);
    }
    public void imprimirTicketVariableMoto(){
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("MM/dd");
        String fechaFormateada = ahora.format(formato);
        JOptionPane.showMessageDialog(null,
                  "ID Ticket: " + this.idTicket
                + "Fecha de Ingreso: " + this.fecha
                + "Fecha de Salida: " + fechaFormateada
                + "Placa: " + this.vehiculo.getPlaca()
                + "Nombre: "+ this.vehiculo.getNombre()
                + "Carnet: "+ this.vehiculo.getCarnet()
                + "Tarifa Pagada: "+ this.tarifa
                + "Tipo de Vehiculo: "+ this.vehiculo.getTipo()
                + "Lugar Asignado: M"+ this.lugarAsignado
                + "Total a Pagar: Q"+ this.totalTicket);
    }
    public void imprimirTicketVariableCatedratico(){
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("MM/dd");
        String fechaFormateada = ahora.format(formato);
        JOptionPane.showMessageDialog(null,
                  "ID Ticket: " + this.idTicket
                + "Fecha de Ingreso: " + this.fecha
                + "Fecha de Salida: " + fechaFormateada
                + "Placa: " + this.vehiculo.getPlaca()
                + "Nombre: "+ this.vehiculo.getNombre()
                + "Carnet: "+ this.vehiculo.getCarnet()
                + "Tarifa Pagada: "+ this.tarifa
                + "Tipo de Vehiculo: "+ this.vehiculo.getTipo()
                + "Lugar Asignado: CT"+ this.lugarAsignado
                + "Total a Pagar: Q"+ this.totalTicket);
    }
}

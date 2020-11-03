package edu.hotel.modelo;

public class Habitacion {
    private int numHabitacion = 0;
    private String tipoHabitacion ;
    private String telefono ;
    private String bano ;
    private String calefaccion ;

    public Habitacion(){
    }
    
    public Habitacion(int numHabitacion, String tipoHabitacion, String telefono, String bano, String calefaccion) {
        this.numHabitacion = numHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.telefono = telefono;
        this.bano = bano;
        this.calefaccion = calefaccion;
    }
    
    public int getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getBano() {
        return bano;
    }

    public void setBano(String bano) {
        this.bano = bano;
    }

    public String getCalefaccion() {
        return calefaccion;
    }

    public void setCalefaccion(String calefaccion) {
        this.calefaccion = calefaccion;
    }

    
    
}

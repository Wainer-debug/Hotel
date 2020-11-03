package edu.hotel.modelo;

public class DesayunoHuesped {
    
    private String bebidas;
    private String desayuno;

    public DesayunoHuesped() {
    }

    public DesayunoHuesped(String bebidas, String desayuno) {
        this.bebidas = bebidas;
        this.desayuno = desayuno;
    }

    public String getBebidas() {
        return bebidas;
    }

    public void setBebidas(String bebidas) {
        this.bebidas = bebidas;
    }

    public String getDesayuno() {
        return desayuno;
    }

    public void setDesayuno(String desayuno) {
        this.desayuno = desayuno;
    }
    
    
    
    
}

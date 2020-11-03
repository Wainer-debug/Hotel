package edu.hotel.modelo;

public class DatosHuesped {
    private String nombre;
    private String apellido;
    private String direccion;
    private String profesion;
    private String estadoCivil;
    private String horaDespertar;

    public DatosHuesped() {
    }

    public DatosHuesped(String nombre, String apellido, String direccion, String profesion, String estadoCivil, String horaDespertar) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.profesion = profesion;
        this.estadoCivil = estadoCivil;
        this.horaDespertar = horaDespertar;
    }
    
//    public void impDatosHues(){
//        System.out.println("El nombre del turista es = " + this.nombre);
//        System.out.println("y su apellido es = " + this.apellido);
//        System.out.println("Reside en la dirección = " + this.direccion);
//        System.out.println("Su profesión es = " + this.profesion);
//        System.out.println("y su estado civil actualmente es = " + this.estadoCivil);
//    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getHoraDespertar() {
        return horaDespertar;
    }

    public void setHoraDespertar(String horaDespertar) {
        this.horaDespertar = horaDespertar;
    }

    
}

package edu.hotel.controlador;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import edu.hotel.modelo.DatosHuesped;
import edu.hotel.modelo.Habitacion;
import java.util.ArrayList;

@Named(value = "turistaSession")
@SessionScoped
public class turistaSession implements Serializable {

    private Habitacion objHabi = new Habitacion();
    private ArrayList<Habitacion> listaHabitacion = new ArrayList<>();
    
    private DatosHuesped objHues = new DatosHuesped();
    private ArrayList<DatosHuesped> listaHuesped = new ArrayList<>();    
    
    public turistaSession() {
    }
    
    public void imprimirDatoHuesped(){
        listaHuesped.add(new DatosHuesped(objHues.getNombre(),objHues.getApellido(),objHues.getDireccion(),
                objHues.getProfesion(),objHues.getEstadoCivil(),objHues.getHoraDespertar()));
    }
    
    public void imprimirDatoHabitacion(){
        listaHabitacion.add(new Habitacion(objHabi.getNumHabitacion(),objHabi.getTipoHabitacion(),
        objHabi.getTelefono(),objHabi.getBano(),objHabi.getCalefaccion()));
    }
    
    public DatosHuesped getObjHues() {
        return objHues;
    }

    public void setObjHues(DatosHuesped objHues) {
        this.objHues = objHues;
    }

    public Habitacion getObjHabi() {
        return objHabi;
    }

    public void setObjHabi(Habitacion objHabi) {
        this.objHabi = objHabi;
    }

    public ArrayList<Habitacion> getListaHabitacion() {
        return listaHabitacion;
    }

    public void setListaHabitacion(ArrayList<Habitacion> listaHabitacion) {
        this.listaHabitacion = listaHabitacion;
    }

    public ArrayList<DatosHuesped> getListaHuesped() {
        return listaHuesped;
    }

    public void setListaHuesped(ArrayList<DatosHuesped> listaHuesped) {
        this.listaHuesped = listaHuesped;
    }
    
}

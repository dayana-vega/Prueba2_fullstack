package com.EduTech.prueba2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "instructores")
public class Instructor extends Usuario {

    private String especialidad;
    private String biografia;

    public Instructor(){
        super();
    }

    public Instructor(Long id,String rut, String nombre, String correo, String contrasena, String estado,
    java.time.LocalDateTime fechaIngreso, Rol rol,String especialidad, String biografia) {
        super(id, rut, nombre, correo, contrasena, estado, fechaIngreso, rol);
        this.especialidad = especialidad;
        this.biografia = biografia;
    }

    
    /**
     * @return String return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * @return String return the biografia
     */
    public String getBiografia() {
        return biografia;
    }

    /**
     * @param biografia the biografia to set
     */
    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

}

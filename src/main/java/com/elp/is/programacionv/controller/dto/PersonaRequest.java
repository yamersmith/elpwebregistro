package com.elp.is.programacionv.controller.dto;

public class PersonaRequest {

    private String nombre;
    private String apellido;
    private int edad;

    public PersonaRequest() {
    }

    public PersonaRequest(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
    


}

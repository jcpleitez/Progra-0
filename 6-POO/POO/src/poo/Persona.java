package poo;

import javax.swing.JOptionPane;

/**
 *
 * @author jcpleitez
 */
public class Persona {
    
    private String nombres;
    private String apellidos;
    private int edad;
    private double peso;
    private double estatura;
    private String correo;
    private String pais;
    private int telefono;

    public Persona() {
    }

    public Persona(String nombres, String apellidos, int edad, double peso, double estatura, String correo, String pais, int telefono) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
        this.correo = correo;
        this.pais = pais;
        this.telefono = telefono;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public void Registrarme(){
        
        this.nombres = JOptionPane.showInputDialog("Ingrese su nombre");        
        this.apellidos = JOptionPane.showInputDialog("Ingrese su apellidos");
    }
    
    
}

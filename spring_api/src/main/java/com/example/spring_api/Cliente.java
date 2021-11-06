/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.spring_api;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 *
 * @author manuel
 */
@Entity
public class Cliente {
    
    private @Id @GeneratedValue Integer cliente_id;
    private String nombre_usuario;
    private String contrasena;
    private String nombre;
    private String apellidos;
    private String correo_electronico;
    private Integer edad;
    private double estatura;
    private double peso;
    private double imc;
    private double geb;
    private double eta;
    private Date fecha_creacion;
    private Date fecha_actualizacion;
    
    Cliente (){}

    public Cliente(String nombre_usuario, String contrasena, String nombre, String apellidos, String correo_electronico) {
        this.nombre_usuario = nombre_usuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo_electronico = correo_electronico;
    }
   
    
    Cliente (Integer cliente_id, String nombre_usuario,
             String contrasena, String nombre, String apellidos,
             String correo_electronico, Integer edad, double estatura,
             double peso, double imc, double geb, double eta,
             Date fecha_creacion, Date fecha_actualizacion){
              
             this.cliente_id = cliente_id;
             this.nombre_usuario = nombre_usuario;
             this.contrasena = contrasena;
             this.nombre = nombre;
             this.apellidos = apellidos;
             this.correo_electronico = correo_electronico;
             this.edad = edad;
             this.estatura = estatura;
             this.peso = peso;
             this.imc = imc;
             this.geb = geb;
             this.eta = eta;
             this.fecha_creacion = fecha_creacion;
             this.fecha_actualizacion = fecha_actualizacion;
                     
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.cliente_id, this.nombre_usuario, 
                this.correo_electronico);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.nombre_usuario, other.nombre_usuario)) {
            return false;
        }
        if (!Objects.equals(this.correo_electronico, other.correo_electronico)) {
            return false;
        }
        if (!Objects.equals(this.cliente_id, other.cliente_id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cliente_id=" + cliente_id + ", nombre_usuario=" + nombre_usuario + ", contrasena=" + contrasena + ", nombre=" + nombre + ", apellidos=" + apellidos + ", correo_electronico=" + correo_electronico + ", edad=" + edad + ", estatura=" + estatura + ", peso=" + peso + ", imc=" + imc + ", geb=" + geb + ", eta=" + eta + ", fecha_creacion=" + fecha_creacion + ", fecha_actualizacion=" + fecha_actualizacion + '}';
    }

    public Integer getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Integer cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public double getGeb() {
        return geb;
    }

    public void setGeb(double geb) {
        this.geb = geb;
    }

    public double getEta() {
        return eta;
    }

    public void setEta(double eta) {
        this.eta = eta;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Date getFecha_actualizacion() {
        return fecha_actualizacion;
    }

    public void setFecha_actualizacion(Date fecha_actualizacion) {
        this.fecha_actualizacion = fecha_actualizacion;
    }
    
    
    
    
    
    
}

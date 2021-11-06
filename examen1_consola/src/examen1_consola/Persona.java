/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_consola;

import java.security.SecureRandom;

/**
 *
 * @author manuel
 */

public class Persona {
    
    private String nombre,nss;
    private int edad;
    private char sexo;
    private double peso, altura;
 
    final int FALTA_PESO = -1;
    final int PESO_NORMAL = 0;
    final int SOBRE_PESO = 1;
  
    public Persona(String nombre, int edad,char sexo, double peso,
            double altura) throws SexoIncorrecto {
        this.nombre = nombre;
        this.edad = edad;
        this.nss = Persona.generaNSS();
        
        if (Persona.comprobarSexo(sexo))
            this.sexo = sexo;
        else 
            throw new SexoIncorrecto();
        
        this.peso = peso;
        this.altura = altura;
    }
    
    public int calcularIMC(){
        double imc = -2.0;
        imc = Math.round(this.peso/(Math.pow(this.altura, 2)));
        // Hombre
        if (this.sexo == 'M' || this.sexo == 'm'){
            // Falta de peso
            if (imc < 20)
                return FALTA_PESO;
            // Peso normal
            else if ( imc >= 20 || imc <= 25)
                return PESO_NORMAL;
            // Sobrepeso
            else
                return SOBRE_PESO;
        // Mujer
        }else {
            // Falta de peso
            if (imc < 19)
                return FALTA_PESO;
            // Peso normal
            else if ( imc >= 19 || imc <= 24)
                return PESO_NORMAL;
            // Sobrepeso
            else
                return SOBRE_PESO;
        }
    }
    
    public String output_IMC(){
        switch(this.calcularIMC()){
            case -1: return "FALTA_PESO";
            case 0: return "PESO_NORMAL";
            case 1: return "SOBRE_PESO";
        }
        return null;
    }
    
    public boolean esMayorDeEdad(){
        if (this.edad > 18)
            return true;
        else
            return false;
    }
    
    public String output_esMayorDeEdad(){
        if (this.esMayorDeEdad()) return "Mayor de edad";
        else return "Menor de edad";
    }
    
    private static boolean comprobarSexo(char sexo){
        
        if (sexo == 'M' || sexo == 'm' || sexo == 'F' || sexo == 'f') {
            return true;
        }else
            return false;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre +",\n" + "edad=" + edad +",\n"+ "nss=" 
                + nss +",\n"+ "sexo=" + sexo +",\n"+ "peso=" + peso +",\n"+ "altura=" 
                + altura +"\n"+ '}';
    }
    
    private static String generaNSS() {
        
        String cadena_low = "abcdefghijklmnopqrstuvwxyz";
        String cadena_upper = cadena_low.toUpperCase();
        String numero = "0123456789";

        String random_str = cadena_low + cadena_upper + numero;
        SecureRandom random = new SecureRandom();

        StringBuilder sb = new StringBuilder(8);

        for (int i = 0; i < 8; i++) {
            int cadena_rnd = random.nextInt(random_str.length());
            char rnd_Char = random_str.charAt(cadena_rnd);

            sb.append(rnd_Char);
        }

        return sb.toString();
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

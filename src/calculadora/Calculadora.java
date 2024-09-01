/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author alnog
 */
public class Calculadora {
    
    
    public Calculadora(){

    }
    
    public double Sumar(double numero1, double numero2 ){
        return numero1 + numero2;
    }  
    
    public double Restar(double numero1, double numero2 ){
        return numero1 - numero2;
    }
    
    public double Multiplicar(double numero1, double numero2 ){
        return numero1 * numero2;
    }
    
    public String Dividir(double numero1, double numero2 ){
        if (numero2 != 0 || numero1 != 0) {
            String resultado = Double.toString(numero1/numero2);
            resultado = resultado.replace(".0", "");
            return resultado;
        }
        return "no se puede dividir entre 0";
    }
    
   public String ValidarSimbolos(short PosicionSimbolo, short LocalizarPosicionSimbolo, String Cadena,short  Opcion){
            switch(Opcion){
                case 1:
                        Cadena = Cadena + "+";
                        return Cadena;
                case 2:
                        Cadena = Cadena + "-";
                        return Cadena;
                case 3: 
                        Cadena = Cadena + "*";
                        return Cadena;
                case 4:
                        Cadena = Cadena + "/";
                        return Cadena;
            }
            return "Que tan estupido debes ser para que te salga esto?";
        }
    }
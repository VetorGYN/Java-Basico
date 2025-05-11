package com.mycompany.calculadora;

public class Calculadora {
    private double num1;
    private double num2;
    
    public void setNumeros(double n1, double n2){
        this.num1 = n1;
        this.num2 = n2;
    }
    
    public double getNumero1(){
        return num1;
    }
    
    public double getNumero2(){
        return num2;
    }
    
    public double soma(){
        return getNumero1() + getNumero2();
    }
    public double subtracao(){
        return getNumero1() - getNumero2();
    }
    public double multiplicacao(){
        return getNumero1() * getNumero2();
    }
    public double divisao(){
        return getNumero1() / getNumero2();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.funcao.matematica;

/**
 *
 * @author Dell
 */
public class FuncaoMatematica {
    
    private int numberTwo;
    private int numberOne;
    
    public FuncaoMatematica(int numberTwo, int numberOne){
        
        this.numberTwo = numberTwo;
        this.numberOne =  numberOne;
    
    }
    
    public void setNumberTwo(int numberTwo){
        
     this.numberTwo =  numberTwo;
    
    }
    
    public void setNumberOne(int numberOne){
    
        this.numberOne = numberOne;
    }
    
    public int getNumberTwo(){
    
        return numberTwo;
    }
    
    
    public int getNumberOne(){
    
        return numberOne;
    }
    
    public int sum(){
        
        int result = numberOne + numberTwo;
        return result;
    }
    
    public int subtract(){
        
        int result = numberOne - numberTwo;
        return result;
        
    }
    @Override
    public String toString(){
        return String.format(" Primeiro valor%d %n Segundo valor %d %n Resultados Soma %d %n Subtração %d  ",getNumberOne(),getNumberTwo(),sum(),subtract() );
    }
}

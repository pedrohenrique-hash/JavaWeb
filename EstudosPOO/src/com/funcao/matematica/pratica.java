/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.funcao.matematica;

/**
 *
 * @author Dell
 */
public class pratica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FuncaoMatematica funcMat = new FuncaoMatematica(0,0);
        
        funcMat.setNumberOne(5);
        
        funcMat.setNumberTwo(8);
        
        
        
        System.out.println(funcMat.getNumberOne());
        
        System.out.println(funcMat.sum());
        
        System.out.println(funcMat.toString());
        
    }
    
}

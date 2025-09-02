/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maonamassa3.model;

import com.mycompany.maonamassa3.model.enums.ETipoCombustivel;

/**
 *
 * @author Usuário
 */
public class Motor {
     private int potencia;
    private ETipoCombustivel tipoCombustivel;
    
    public Motor() {}
    
    public Motor(int potencia, ETipoCombustivel tipoCombustivel) {
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
    }
    
    // Getters e Setters
    public int getPotencia() { return potencia; }
    public void setPotencia(int potencia) { this.potencia = potencia; }
    
    public ETipoCombustivel getTipoCombustivel() { return tipoCombustivel; }
    public void setTipoCombustivel(ETipoCombustivel tipoCombustivel) { 
        this.tipoCombustivel = tipoCombustivel; 
    }
    
    @Override
    public String toString() {
        return potencia + "cv - " + tipoCombustivel;
    }
}

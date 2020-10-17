/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author Vitor Assis
 */
public enum Nota {
    //Lista enumerada
    BOM(10, 'B', "Bom"),
    RUIM(5, 'R', "Ruim"),
    INSUFICIENTE(0, 'I', "Insuficiente");
    
    //Atributos da lista
    private int notaNum;
    private char notaSigla;
    private String notaGrande;
    
    //Getters

    /**
     * @return the notaNum
     */
    public int getNotaNum() {
        return notaNum;
    }

    /**
     * @return the notaSigla
     */
    public char getNotaSigla() {
        return notaSigla;
    }

    /**
     * @return the nota
     */
    public String getNotaGrande() {
        return notaGrande;
    }
    
    //Construtor completão
    private Nota(int notaNum, char notaSigla, String notaGrande) {
        this.notaNum = notaNum;
        this.notaSigla = notaSigla;
        this.notaGrande = notaGrande;
    }
    
}

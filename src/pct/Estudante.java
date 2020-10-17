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
public class Estudante {
    //Atributos
    private String nome;
    private int rm;
    private Nota nota;
    
    //Métodos
    public void apresentarEstudante(){
        System.out.println("Nome: " + nome);
        System.out.println("RM: " + rm);
        System.out.println("Nota: " + nota.getNotaNum());
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRm() {
        return this.rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public Nota getNota() {
        return this.nota;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }
    
}

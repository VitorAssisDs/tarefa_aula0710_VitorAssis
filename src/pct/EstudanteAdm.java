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
public class EstudanteAdm extends Estudante{
    //Atributos
    private String areaEstagio;
    private int periodoEstagio;
    
    //Métodos
    public void apresentarEstudanteAdm(){
        System.out.println("Área do estágio: " + getAreaEstagio());
        System.out.println("Período do estágio: " + getPeriodoEstagio());
    }

    @Override
    public void apresentarEstudante() {
        super.apresentarEstudante();
        this.apresentarEstudanteAdm();
    }

    public String getAreaEstagio() {
        return areaEstagio;
    }

    public void setAreaEstagio(String areaEstagio) {
        this.areaEstagio = areaEstagio;
    }

    public int getPeriodoEstagio() {
        return periodoEstagio;
    }

    public void setPeriodoEstagio(int periodoEstagio) {
        this.periodoEstagio = periodoEstagio;
    }
    
    public EstudanteAdm(){
        this.setAreaEstagio("Escritório");
        this.setPeriodoEstagio(10);
    }

    public EstudanteAdm(String areaEstagio, int periodoEstagio) {
        this.areaEstagio = areaEstagio;
        this.periodoEstagio = periodoEstagio;
    } 
}

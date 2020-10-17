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
public class TesteEstudante {
    public static void main(String[] args) {
        
        //Criação e instância de um objeto de classe Estudante
        Estudante estudante = new Estudante();
        
        estudante.setNome("Vitor Assis");
        estudante.setRm(861498);
        estudante.setNota(Nota.BOM);
      
        estudante.apresentarEstudante();
        
        //Criação e instância de um objeto da classe EstudanteAdm
        EstudanteAdm estudanteAdm = new EstudanteAdm();

        //Construção do EstudanteAdm
        estudanteAdm.setNome("Vitor Assis");
        estudanteAdm.setRm(861498);
        estudanteAdm.setNota(Nota.BOM);
        estudanteAdm.setAreaEstagio("Back-End");
        estudanteAdm.setPeriodoEstagio(9);
        
        //Imprimindo EstudanteAdm
        System.out.println("\t\t -- Perfil do Estudante --");
        estudanteAdm.apresentarEstudante();
    }
}
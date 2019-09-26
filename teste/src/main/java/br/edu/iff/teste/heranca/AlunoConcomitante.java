package br.edu.iff.teste.heranca;

/**
 *
 * @author luizcanf
 */
public class AlunoConcomitante extends Aluno {
    
    long matriculaEM;
    String escolaEM;
    boolean apresentouCertificadoEM;
    
    public boolean podeSolicitarDiploma() {
        if (apresentouCertificadoEM && super.podeSolicitarDiploma()) {
            //Poderia ser tambem if (apresentouCertificadoEM && concluiuMaterias && entregouDocumentacoes) {
            return true;
        } else {
            return false;
        }
    }

}

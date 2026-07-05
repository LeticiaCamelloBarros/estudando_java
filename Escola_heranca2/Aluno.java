package escola2;

public class Aluno extends Pessoa {
	//aluno tem tudo q pessoa tem mais algo só dele - herença de diferença
	
 protected int matricula ; 
 protected String curso ;
 //ele também tem o método fazerAniv de pessoa
 public void pagarMensalidade() {
	 System.out.println("pagando mensalidade de aluno"+this.nome);
 }
 //ele tem os getters e setters de pessoa 
 //getters e setters especificos de aluno 
 public int getMatricula() {
	return matricula;
 }
 public void setMatricula(int matricula) {
	this.matricula = matricula;
 }
 public String getCurso() {
	return curso;
 }
 public void setCurso(String curso) {
	this.curso = curso;
 }
}


package escola;

public class Professor extends Pessoa {
	//professor é filha de pessoa
	//
	
  private char especialidade ; 
  private double salario ; 
  public void receberAumento(int aum) {
	  this.setSalario(this.getSalario()+aum);
  }
  public char getEspecialidade() {
	return especialidade;
  }
  public void setEspecialidade(char especialidade) {
	this.especialidade = especialidade;
  }
  public double getSalario() {
	return salario;
  }
  public void setSalario(double salario) {
	this.salario = salario;
  }
  
}

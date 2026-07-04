package escola;

public class Pessoa {
	//Pessoa é a superclasse das outras três 
  private int idade ; 
  @Override
public String toString() {
	return "Pessoa [idade=" + idade + ", sexo=" + sexo + ", nome=" + nome + "]";
}
  private char sexo ; 
  private String nome ;
 //getters e setters ;  
  public int getIdade() {
	return idade;
  }
  public void setIdade(int idade) {
	this.idade = idade;
  }
  public char getSexo() {
	return sexo;
  }
  public void setSexo(char sexo) {
	this.sexo = sexo;
  }
  public String getNome() {
	return nome;
  }
  public void setNome(String nome) {
	this.nome = nome;
  } 
  public void fazerAniv() {
	  this.setIdade(this.getIdade()+1);
  }
}

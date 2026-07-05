package fauna;

public abstract  class Animal {
protected  int idade ; 
protected double peso ; 
protected int membros ; 
//toda vez q tivemos métodos abstratos em uma classe, ela também será abstrata . 
 public abstract  void  locomover () ;
 public abstract void alimentar ();
 public abstract void emitirSom();
 //getters e setters : 
 public int getIdade() {
	return idade;
 }
 public void setIdade(int idade) {
	this.idade = idade;
 }
 public double getPeso() {
	return peso;
 }
 public void setPeso(double peso) {
	this.peso = peso;
 }
 public int getMembros() {
	return membros;
 }
 public void setMembros(int membros) {
	this.membros = membros;
 }
 
}

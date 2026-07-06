package Social_midea;

public class Pessoa {
protected int idade ; 
protected  String nome ; 
protected char sexo ;
protected int experiencia ; 
//construtor 
public Pessoa(String nome,int idade ,char sexo) {
	this.setNome(nome);
	this.setIdade(idade);
	this.setSexo(sexo);
}
//getters e setters 
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public char getSexo() {
	return sexo;
}
public void setSexo(char sexo) {
	this.sexo = sexo;
}
public int getExperiencia() {
	return experiencia;
}
public void setExperiencia(int experiencia) {
	this.experiencia = experiencia;
}
//métodos concretos  :
public void ganharExperiencia() {
	this.setExperiencia(this.getExperiencia()+1);
}
//método toString
@Override
public String toString() {
	return "Pessoa{" +"\n titulo="+this.getNome()
	+"\n sexo= "+this.getSexo()
	+"\n idade= "+this.getIdade()
	+"\n experiência= "+this.getExperiencia();
	
}
}

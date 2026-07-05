package escola2;

public abstract class Pessoa {
protected int idade ; 
protected char sexo ; 
protected String nome ; 
//pq o acesso protegido dá acesso a sua classe e a suas filhas .
final public void fazerAniv() {
	//esse final sinaliza que fazerAniv não pode ser sobrescrito
 this.setIdade(this.getIdade()+1);
}
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
@Override
public String toString() {
	return "Pessoa [idade=" + idade + ", sexo=" + sexo + ", nome=" + nome + "]";
}


}


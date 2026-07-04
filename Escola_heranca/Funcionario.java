package escola;

public class Funcionario extends Pessoa{
private char setor ; 
private boolean trabalhando ;
public char getSetor() {
	return setor;
}
public void setSetor(char setor) {
	this.setor = setor;
}
public boolean getTrabalhando() {
	return this.trabalhando;
}
public void setTrabalhando(boolean trabalhando) {
	this.trabalhando = trabalhando;
} 
public void mudarTrabalhando() {
	this.setTrabalhando(!(this.trabalhando));
}
}

package Social_midea;

public class Inscrito extends Pessoa {
private String loguin ; 
private int totAssistindo ; 
//construtor 
public Inscrito(String nome,int idade,char sexo,String loguin) {
	super(nome, idade, sexo);
	this.setLoguin(loguin);
	this.setTotAssistindo(0);
}
public void viewMaisum() {
	this.setTotAssistindo(this.getTotAssistindo()+1);
}
public String isLoguin() {
	return loguin;
}
public void setLoguin(String loguin) {
	this.loguin = loguin;
}
public int getTotAssistindo() {
	return totAssistindo;
}
public void setTotAssistindo(int totAssistindo) {
	this.totAssistindo = totAssistindo;
}

}

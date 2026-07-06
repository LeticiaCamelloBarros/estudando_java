package Social_midea;

public class Visualizacao {
private Inscrito espectador;
private  Video filme;
//a instância de Inscrito e a instãncia de Video são atributos da classe Visualização
//construtor 
public Visualizacao(Video filme,Inscrito espectador) {
	this.setEspectador(espectador);
    this.setFilme(filme);
    this.espectador.setTotAssistindo(this.espectador.getTotAssistindo()+1);
    this.filme.setViews(this.filme.getViews()+1);
} 
//getters e setters 
public Inscrito getEspectador() {
	return espectador;
}
public void setEspectador(Inscrito espectador) {
	this.espectador = espectador;
}
public Video getFilme() {
	return filme;
}
public void setFilme(Video filme) {
	this.filme = filme;
}
//métodos sobrescritos (da classe object ) 
@Override
public String toString() {
	return "Visualização{" + "espectador= " + this.getEspectador() +
			"\nfilme= " + this.getFilme()+"}";
}
//métodos sobrecarregados - avaliar .
public void avaliar() {
	this.filme.setAvaliacao(5);
}
public void avaliar (int nota_num) {
	this.filme.setAvaliacao(nota_num);
}
public void avaliar (float nota_porc) {
	int tot = 0 ;
	if (nota_porc<=30) {
		tot = 3;
	}else if (nota_porc<=50) {
		tot = 5;
	}else if (nota_porc<=80) {
		tot = 8 ; 
	}else {
		tot = 10;
	}
	this.filme.setAvaliacao(tot);
}
}

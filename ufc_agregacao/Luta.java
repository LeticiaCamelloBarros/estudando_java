package ufc;
import java.util.Random;
public class Luta {
	//atributos 
	//na poo podemos criar tipos abstratos de dados 
	//e transformar as nossas classes em determinados tipos : 
	//o desafiado e desafiante são instâncias da classe lutador
private Lutador desafiado ; 
private Lutador desafiante ; 
private int rounds ;
private boolean aprovada ; 
//relacionamento do tipo tem 1 é o q a gente chama de agregação
//métodos publicos 
public void marcarLutar(Lutador l1,Lutador l2) {
	if ((l1.getCategoria().equals(l2.getCategoria()))&&l1!=l2) {
		//usa equals pq l1 e l2 são um tipo abstrato
		this.setAprovada(true) ;
		this.setDesafiado(l1);
		this.setDesafiante(l2); 
	}else {
		this.setAprovada(false) ;
		this.setDesafiado(null);
		this.setDesafiante(null); 
	}
}
public void lutar() {
	if (this.getAprovada()) {
		//posso usar os metodos das classes nos objetos/atributos
	this.setRounds(this.getRounds()+1);
	 desafiado.apresentar();
	 desafiante.apresentar();
	 
	 Random aleatorio = new Random();
	 //vai sortear 3 resultados : 0 , 1 ou 2 
	 int vencedor = aleatorio.nextInt(3);
	 switch(vencedor) {
	 case 0 : 
		 System.out.println("Empatou");
		 this.desafiado.empatarLuta();
		 this.desafiante.empatarLuta();
		 break ;
		 //cada case do switch case deve ter um break 
	 case 1 : 
		 System.out.println(desafiado.getNome()+"ganhou a luta");
		 this.desafiado.ganharLuta();
		 this.desafiante.perderLuta();
		 break;
	 case 2 :
		System.out.println(desafiante.getNome()+"ganhou a luta");
		this.desafiado.perderLuta();
		this.desafiante.ganharLuta();
		break;
	 }
	}else {
		System.out.println("a luta não foi aprovada");
		
	}
}
//métodos especiais 
public Lutador getDesafiado() {
	return this.desafiado ; 
}
public Lutador getDesafiante() {
	return this.desafiante ; 
}
public void setDesafiado(Lutador l1) {
   this.desafiado = l1	;
}
public void setDesafiante (Lutador l2) {
	this.desafiante = l2;
}
public int getRounds() {
	return this.rounds;
}
public void setRounds(int rounds) {
	this.rounds = rounds; 
}
public boolean getAprovada() {
	return this.aprovada;
}
public void setAprovada(boolean aprovada) {
	this.aprovada = aprovada ; 
}
}

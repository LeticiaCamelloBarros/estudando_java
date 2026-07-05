package fauna;

public class Peixe extends Animal {
private String corEscama;

@Override
public void locomover() {
	System.out.println("nadando");
}

@Override
public void alimentar() {
System.out.println("comendo algas");	
}

@Override
public void emitirSom() {
System.out.println("peixe não emite som");	
}
public void soltarBolhas() {
	System.out.println("blup");
}
public String getcorEscama() {
	return this.corEscama;
}
public void setcorEscama(String cor) {
     this.corEscama = cor;
}
}

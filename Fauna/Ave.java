package fauna;

public class Ave extends Animal  {
private String corPena;

@Override
public void locomover() {
   System.out.println("voando");	
}

@Override
public void alimentar() {
	// TODO Auto-generated method stub
	System.out.println("comendo frutas");
}

@Override
public void emitirSom() {
   System.out.println("som de ave");	
}
public String getcorPena () {
	return this.corPena;
}
public void setcorPena (String cor) {
	this.corPena = cor;
}
}

package fauna;

public class Mamifero extends Animal {
    protected String corPelos;
	@Override
	public void locomover() {
		System.out.println("andando");
		this.setPeso(this.getPeso()+0.5);
	}

	@Override
	public void alimentar() {
		if (this.getIdade() < 1 ){
			System.out.println("mamando");
			this.setPeso(this.getPeso()-0.2);
		}else {
    System.out.println("comendo");
	this.setPeso(this.getPeso()-0.5);
		}}

	@Override
	public void emitirSom() {
       System.out.println("som de mamífero");		
	}
//quando eu tenho método abstrato na mãe eu sou obrigado a desenvolver na mãe ;
//mamifero não vai ter métodos adicionais, apenas atributos .

	public String getCorPelos() {
		return corPelos;
	}

	public void setCorPelos(String corPelos) {
		this.corPelos = corPelos;
	}
	
}

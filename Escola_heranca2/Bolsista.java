package escola2;

final public class Bolsista extends Aluno {
	//estamos usando final para indicar que essa classe é folha 
    private float bolsa ; 
    @Override
    public void pagarMensalidade() {
    	// o atributo nome vem de Pessoa que é ancestral de Bolsista
    	System.out.println(this.nome+"é bolsista ,pagamento facilitado!");
    }
    public void renovarBolsa() {
    	System.out.println("renovando bolsa de "+this.nome);
    }
	public float getBolsa() {
		return bolsa;
	}
	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
    
}

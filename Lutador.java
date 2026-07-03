package ufc;

public class Lutador {
   private String nome;
   private String nacionalidade;
   private int idade;
   private double peso;
   private String categoria;
   private int derrotas ;
   private int vitorias ;
   private int empates ; 
   //construtor 
   public Lutador (String nome,String nacionalidade,int idade,double peso,int vitorias,int derrotas,int empates){
	   this.nome = nome ; 
	   this.nacionalidade = nacionalidade ;
	   this.idade = idade ;
	   this.peso = peso ; 
	   this.setPeso(this.peso) ;
	   //pq o peso chama a categoria 
	   this.vitorias = vitorias ;
	   this.derrotas = derrotas ; 
	   this.empates = empates;
   }
   //métodos especiais 
   public String  getNome () {
	   return this.nome ;
   }
   public void setNome (String nome) {
	   this.nome = nome;
   }
   public String getNacionalidade() {
	   return this.nacionalidade;
   }
   public void setNacionalidade (String nacionalidade) {
	   this.nacionalidade = nacionalidade ; 
   }
   public int getIdade() {
	   return this.idade;
   }
   public void setIdade (int idade) {
	   this.idade = idade ;
   }
   private void setCategoria() {
	   if (this.peso<52.2) {
		   this.categoria = "Inválido";
	   }else if (this.peso<=70.3){
		 this.categoria = "Leve";
	   }else if (this.peso<=83.9) {
		   this.categoria = "Médio";
	   }else if (this.peso<=120.2) {
		   this.categoria = "Pesado";
	   }else {
		   this.categoria = "Inválido";
	   }
   }
   public double getPeso() {
	   return this.peso;
	   //colocar tudo o que é necessário antes do return pq se não dá codigo inávcançável 
   }
   public void setPeso(double peso) {
	   this.setCategoria();
	   this.peso = peso ;
   }
   public String getCategoria() {
	   return this.categoria;
   }
   
   public int getDerrotas() {
	   return this.derrotas;
   }
   public void setDerrotas (int derrotas) {
	   this.derrotas = derrotas ;  
   }
   public int getVitorias() {
	   return this.vitorias;
   }
   public void setVitorias(int vitorias) {
	   this.vitorias = vitorias;
   }
   public int getEmpates() {
	   return this.empates;
   }
   public void setEmpates(int empates) {
	   this.empates = empates ; 
   }
   //métodos : 

   public void apresentar() {
	   System.out.println("Chegou a hora !! vamos apresentar o lutador : "+this.getNome());
	   System.out.println("Pesando "+this.getPeso()+" kilos "+" na categoria peso "+this.getCategoria()+" nos seus "+this.getIdade()+" anos");
	   System.out.println(" Ganhou "+this.getVitorias()+" vezes ");
	   System.out.println("Perdeu "+this.getEmpates()+" vezes");
	   System.out.println("empatou "+this.getEmpates()+" vezes");

   }
   
   public void ganharLuta() {
	   this.setVitorias(this.getVitorias()+1);
   }
   public void perderLuta() {
	   this.setDerrotas(this.getDerrotas()+1);
   }
   public void empatarLuta() {
	  this.setEmpates(this.getEmpates()+1);
   }
}

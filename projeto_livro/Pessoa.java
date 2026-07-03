package projeto_livro;

public class Pessoa {
   private String nome ;
   private int idade;
   private String sexo ;
   //getters e setters 
   public int getIdade() {
	   return this.idade;
   }
   public void setIdade(int idade) {
	   this.idade = idade ; 
   }
   public void fazerAniver(int idade) {
	   this.setIdade( this.idade + 1 );
   }
   public String getNome( ) {
	   return this.nome;
   }
   public void setNome(String nome) {
	   this.nome = nome ; 
   }
   public String getSexo() {
        return this.sexo;
   }
   public void setSexo(String sexo) {
	   this.sexo = sexo ; 
   }
   //construtor 
   public Pessoa(String nome,int idade,String sexo) {
	   this.setNome(nome);
	   this.setSexo(sexo);
	   this.setIdade(idade);
   }
}

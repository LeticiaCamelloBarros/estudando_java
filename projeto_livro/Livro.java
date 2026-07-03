package projeto_livro;

public class Livro implements publicacao{
 private String titulo ; 
 private String autor;
 private int totPaginas ; 
 private int pagAtual ; 
 private  boolean aberto ; 
 private Pessoa leitor ;
 
//getters e setters 
 public String getTitulo() {
	return titulo;
 }

 public void setTitulo(String titulo) {
	this.titulo = titulo;
 }

 public String getAutor() {
	return autor;
 }

 public void setAutor(String autor) {
	this.autor = autor;
 }

 public int getTotPaginas() {
	return totPaginas;
 }

 public void setTotPaginas(int totPaginas) {
	this.totPaginas = totPaginas;
 }

 public int getPagAtual() {
	return pagAtual;
 }

 public void setPagAtual(int pagAtual) {
	this.pagAtual = pagAtual;
 }

 public boolean isAberto() {
	return aberto;
 }

 public void setAberto(boolean aberto) {
	this.aberto = aberto;
 }

 public Pessoa getLeitor() {
	return leitor;
 }

 public void setLeitor(Pessoa leitor) {
	this.leitor = leitor;
 }
 //construtor :
 public Livro (String livro,String autor,int totpaginas,Pessoa leitor) {
	 this.setTitulo(livro);
	 this.setTotPaginas(totpaginas);
	 this.setPagAtual(0);
	 this.setLeitor(leitor);
	 this.setAutor(autor);
	 this.setAberto(false);
 }


 //métodos abstratos 
 public String detalhe() {
	 return "Livro { titulo=" + this.titulo + 
			 " \nautor=" + this.autor +
			 " \nnúmero total de páginas=" + this.totPaginas +
			 " \nPagina atual=" + this.pagAtual +
			 " \no livro está aberto ?=" + this.aberto +
			 " \nquem está lendo o livro ? =" + this.leitor.getNome()+"}"; 
 }
 //métodos abstratas sobrescritos : 
 @Override
 public void abrir() {
	 this.setAberto(true);
 }

 @Override
 public void fechar() {
	 this.setAberto(false);
	
 }

 @Override
 public void folhear(int p) {
	 if (p<this.totPaginas) {
	this.setPagAtual(p);}
	 else {
		 System.out.println("o livro só tem"+this.totPaginas+"páginas");
	 }
 }

 @Override
 public void avancarPag() {
this.setPagAtual(this.getPagAtual()+1);	
 }

 @Override
 public void voltarPag() {
	 this.setPagAtual(this.getPagAtual()-1);	

 }
 
}

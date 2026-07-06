package Social_midea;

public class Video implements AcoesVideo{
private String titulo ; 
private boolean reproduzindo ; 
private int avaliacao ; 
private int views ; 
private int curtidas ;
//getters e setters :
public Video(String Titulo) {
	this.setTitulo(Titulo);
	this.setAvaliacao(1);
	this.setCurtidas(0);
	this.setViews(0);
	this.setReproduzindo(false);
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public boolean isReproduzindo() {
	return reproduzindo;
}
public void setReproduzindo(boolean reproduzindo) {
	this.reproduzindo = reproduzindo;
}
public int getAvaliacao() {
	return avaliacao;
}
public void setAvaliacao(int avaliacao) {
   this.avaliacao = avaliacao;
}
public int getViews() {
	return views;
}
public void setViews(int views) {
	this.views = views;
}
public int getCurtidas() {
	return curtidas;
}
public void setCurtidas(int curtidas) {
	this.curtidas = curtidas;
} 
//métodos sobrescritos da implementação da interface : 
@Override
public void play() {
	// TODO Auto-generated method stub
	this.setReproduzindo(true);
}
@Override
public void pause() {
	// TODO Auto-generated method stub
	this.setReproduzindo(false);
}
@Override
public void like() {
	// TODO Auto-generated method stub
	this.setCurtidas(this.getCurtidas()+1);
}
@Override
public String toString() {
	return "Video{"+"\ntitulo= "+this.getTitulo()
	+"\navaliação= "+this.getAvaliacao()
	+"\nviews= "+this.getViews()
	+"\ncurtidas= "+this.getCurtidas()
	+"\nreproduzindo= "+this.isReproduzindo()+"}";
}

}

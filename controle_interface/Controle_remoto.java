package controle_interface;

public class Controle_remoto implements controlador{
	private int volume;
	private boolean ligado;
	private boolean tocando ; 
	//construtor
	public Controle_remoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}
	//métodos especiais
	public int  getVolume() {
		return this.volume ;
	}
	public void setVolume(int v) {
		this.volume = this.getVolume() +  v ;
	}
	public boolean getLigado() {
		return this.ligado;
	}
	public void setLigado(boolean p) {
		this.ligado = p;
	}
    public boolean getTocando() {
    	return this.tocando;
    }
    public void setTocando(boolean p) {
    	this.tocando = p;
    }
    //métodos abstratos
	@Override
	//overide significa sobrescrever , você tá desenvolvedo um método que foi declarado em uma interface
	public void ligar() {
		// TODO Auto-generated method stub
		this.setLigado(true);
	}
	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		this.setLigado(false);
	}
	@Override
	public void abrimenu() {
		// TODO Auto-generated method stub
		System.out.println("Está ligado ?:"+this.getLigado());
		System.out.println("Está tocando ?:"+this.getTocando());
        for (int i=0 ;i<=this.getVolume();i+=10) {
        	System.out.println("|");
        }
	}
	@Override
	public void fecharmenu() {
		// TODO Auto-generated method stub
		System.out.println("fechando menu ....");
	}
	@Override
	public void maisvolume( ) {
		// TODO Auto-generated method stb
         if (this.getLigado()==true) {
        	 this.setVolume(this.getVolume()+1);
         }
	}
	@Override
	public void menosvolume() {
		// TODO Auto-generated method stub
		if(this.getLigado()) {
			this.setVolume(this.getVolume()-1);
		}
	}
	@Override
	public void ligarmudo() {
		// TODO Auto-generated method stub
		if (this.getLigado()&&(this.getVolume()>0)) {
			this.setVolume(0);
		}
	}
	@Override
	public void desligarmudo() {
		if (this.getLigado()&&(this.getVolume()==0)) {
			this.setVolume(50);
		}
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
    if (this.getLigado()&&(!this.getTocando())){
    this.setTocando(true);
    }
    }
    		
	}
	@Override
	public void pause() {
		// TODO Auto-generated method stub
		 if (this.getLigado()&&(this.getTocando())){
			    this.setTocando(false);
	}

    
}

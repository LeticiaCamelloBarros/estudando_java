package fauna;

public class Floresta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Ave a = new Ave();
    Peixe p = new Peixe();
    Mamifero m = new Mamifero();
    Reptil r = new Reptil();
     a.locomover();
     p.locomover();
     r.locomover();
     m.locomover();
     Canguru c = new Canguru ();
     c.locomover();
     Cachorro k = new Cachorro ();
     k.locomover();
     m.emitirSom();
     k.emitirSom();
	}

}

package ufc;

public class arena {

	public static void main(String[] args) {
	Lutador l[] = new Lutador[6];
	 l[0] = new Lutador( "Lorenzo", "italia", 25, 89.6, 8,3,2);
	 l[1] = new Lutador ("Pablo","mexico",31,69.0,9,7,4);
	 l[2] = new Lutador ("John","australia",27,59.4,6,3,2);
	 l[3] = new Lutador ("José Guedes","Brasil",21,85.9,3,5,2);
	 l[4] = new Lutador ("Frederick sharmazki","austria",12,78,9,7,3);
	 l[5] = new Lutador ("mao mao","china",18,89,4,7,8);
	Luta  round1 = new Luta();
	round1.marcarLutar(l[0], l[3]);
	round1.lutar();
	}

}

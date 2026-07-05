package fauna;

public class Cachorro extends Mamifero{

public void reagir(String frase) {
	if (frase.equals("toma comida") ||frase.equals("ola")) {
		System.out.println("Abanar e latir");
	}else {
		System.out.println("rosnar");
	}
}
public void reagir (boolean dono) {
	if (dono) {
		System.out.println("Latir e abanar");
	}else {
		System.out.println("rosnar e estranhar");
	}
}
public void reagir (int hora,int min) {
         if (hora>=60) {
        	 hora += (min/60);
         }
         if (hora>=5&&hora<=12) {
        	 System.out.println("virar a barriga");
         }else if (hora>=12&&hora<=18) {
        	 System.out.println("abanar o rabo e correr");
         }else if (hora>=12&&hora<=24) {
        	 System.out.println("deitar e abanar rabo");
         }else {
        	 System.out.println("horario não existe !!");
         }
        	 

}
}




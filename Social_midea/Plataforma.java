package Social_midea;

public class Plataforma {

	public static void main(String[] args) {
     Video v[] = new Video[3];
     v[0] = new Video("NOVAYO-Bad bunny");
     v[1] = new Video("bad-michael jackson");
     v[2] = new Video("im not the only one-sam smith");
     System.out.println(v[0].toString());
     Inscrito i[] = new Inscrito[2];
     i[0] = new Inscrito("Lavinia",17,'F',"LavisCamellob");
     i[1] = new Inscrito("Leticia",19,'F',"LetCamellob");
     System.out.println(i[0].toString());
     System.out.println(i[1].toString());
     System.out.println(v[1].toString());
     Visualizacao vis[] = new Visualizacao[5];
    vis[0] = new Visualizacao(v[0],i[0]);
    vis[1] = new Visualizacao(v[0],i[1]);
     System.out.println(vis[0].toString());
  
     
     }

}

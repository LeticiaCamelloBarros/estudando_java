package projeto_livro;

public class Main {

	public static void main(String[] args) {
	Pessoa p[] = new Pessoa[2];
	Livro l[] = new Livro[3];
    p[0] = new Pessoa("Pedro",15,"Homem") ;
    p[1] = new Pessoa("leticia camello",16,"Mulher");
    l[0] = new Livro( "os 7 maridos de evelyn hugo", "taylor jerkin red", 350,p[1]);
    l[1] = new Livro("o primo basilio","eça de queiroz",200,p[0]);
    l[2] = new Livro("a hora da estrela","clarice lispector",200,p[1]);
    System.out.println(l[0].detalhe());
    l[0].folhear(400);
    
	}

}

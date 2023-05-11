import java.util.ArrayList;
import java.util.Random;
 abstract class Personagem{

//Atributos

  
  private String nome;
  private String editora;
  private int pfInicial;
  private int peInicial;
  private int pf;
  private int pe;
  private ArrayList<Poder> poderes = new ArrayList<Poder>();
 

  
  //setters and getters métodos
 public String getNome() {
  	return nome;
  }
  public void setNome(String nome) {
  	this.nome = nome;
  }
  public String getEditora() {
  	return editora;
  }
  public void setEditora(String editora) {
  	this.editora = editora;
  }
  public int getPfInicial() {
  	return pfInicial;
  }
  public void setPfInicial(int pfInicial) {
  	this.pfInicial = pfInicial;
  }
  public int getPeInicial() {
  	return peInicial;
  }
  public void setPeInicial(int peInicial) {
  	this.peInicial = peInicial;
  }
  public int getPf() {
  	return pf;
  }
  public void setPf(int pf) {
  	this.pf = pf;
  }
  public int getPe() {
  	return pe;
  }
  public void setPe(int pe) {
  	this.pe = pe;
  }
   public ArrayList<Poder> getPoderes() {
  	return poderes;
  }
  public void setPoderes(final ArrayList<Poder> poderes) {
  	this.poderes = poderes;
  }
  
//Construtor(es)
   public Personagem(String nome,String editora,int pe,int peInicial, int pf, int pfInicial) {
     this.setNome(nome);
     this.setEditora(editora);
     this.setPe(pe);
     this.setPeInicial(peInicial);
     this.setPf(pf);
    this.setPfInicial(pfInicial);
   }

    public void addPoder(Poder p){
    this.poderes.add(p);
  }

  public void removerPoder(Poder p){
    this.poderes.remove(p);
  }
   
   public void recuperar() {
     double re = getPeInicial() * 0.3;
     setPe(getPe() + (int)re);
   }

   public void recuperarTudo() {
     setPe(getPeInicial());
     setPf(getPfInicial());
   }
   
   
   public void Atacar(Personagem oponente) {
    Random rand = new Random();

    int randomNumber = rand.nextInt(getPoderes().size()); 
    poderes.get(randomNumber).getNome();
   
    if(pe >= poderes.get(randomNumber).getPePoder()) {
     int subtracaoPe;
      subtracaoPe = getPe() -poderes.get(randomNumber).getPePoder();
      setPe(subtracaoPe); //AQUI ATUALIZA PONTO DE ENERGIA
       System.out.println("-> O ataque ocorreu com sucesso!!");
       System.out.println("-> Os pontos de energia atual do " + getNome() + "é " + subtracaoPe);
       
      int subtracaoVida;
      subtracaoVida = oponente.getPf() - 
     poderes.get(randomNumber).getDano();
      oponente.setPf(subtracaoVida); //AQUI ATUALIZA A VIDA (Pf = pontos de força)
      System.out.println("-> A Vida restante do oponente é : " + subtracaoVida);

      System.out.println("-> " + getNome() + " usou seu poder " + poderes.get(randomNumber).getNome() + " em " + oponente.getNome() + ". O Dano causado foi: " + poderes.get(randomNumber).getDano() + "\n");
      System.out.println("PRÓXIMO ATAQUE \n");

    }
    else {
      //acho q é só chamar o metodo recuperar aqui! O recuperar apenas. o recuperar tudo, acho q nao precisa ser usado dentro do ataque. acho que faz sentido ser usado no inicio do confronto apenas.
      //acho que nao precisa chamar o recuperar para o oponente. O oponente se recupera quando ele for atacar.
     recuperar();
     //oponente.getRecuperar();
      
      System.out.print("O personagem perdeu a chance");
      
    }
      
  }
   
  
    
    
}
    
  

  


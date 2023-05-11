/* Declaração da classe Heroi
*/

public class Heroi extends Personagem{
  
    //atributos
    private String nomeReal;
    
    public Heroi(String nome, String editora, int 
    pe, int  peInicial,int pf,int pfInicial, String nomeReal) {
      super(nome, editora, pe, peInicial, pf, pfInicial);
      this.setNomeReal(nomeReal);
    }
    
    //setters and getters médodos
    public String getNomeReal() {
        return nomeReal;
    }
    
    public void setNomeReal(String nomeReal) {
        this.nomeReal = nomeReal;
    }
        
  }
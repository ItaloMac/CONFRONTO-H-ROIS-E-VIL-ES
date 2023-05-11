/* Declaração da classe Vilão
*/

class Vilao extends Personagem{
 
    //atributos
    private int nivelDeMaldade;
     
   public Vilao(String nome, String editora, int pe, int peInicial, int pf, int pfInicial, int nivelDeMaldade) {
     super(nome, editora, pe, peInicial, pf, pfInicial);
     
      this.setNivelDeMaldade(nivelDeMaldade);
    }
  
     //setters and getters médodos
    public int getNivelDeMaldade() {
      return nivelDeMaldade;
    }
  
    public void setNivelDeMaldade(int nivelDeMaldade) {
      this.nivelDeMaldade = nivelDeMaldade;
    }
  }
  
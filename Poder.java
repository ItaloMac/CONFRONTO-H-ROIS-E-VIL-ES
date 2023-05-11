/* Declaração da classe Poder
*/

public class Poder{

    //Atributos
    
      private String nome;
      private int dano;
      private int pePoder;
     
    
    //setters and getters médodos
      public String getNome() {
          return this.nome;
      }
      public void setNome(String nome) {
          this.nome = nome;
      }
      public int getDano() {
          return this.dano;
      }
      public void setDano(int dano) {
          this.dano = dano;
      }
      public int getPePoder() {
          return this.pePoder;
      }
      public void setPePoder(int pePoder) {
          this.pePoder = pePoder;
      }
      //Construtor
      public Poder(String nome,int dano, int pePoder) {
       this.setNome(nome);
       this.setDano(dano);
       this.setPePoder(pePoder);
      }
    
    
      
    
    }
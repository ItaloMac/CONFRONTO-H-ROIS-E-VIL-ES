
import java.util.Random;
import java.util.ArrayList;
class Confronto
 {
   public void confrontar(Heroi heroi1, Heroi heroi2) {
     
   

     //EXIBIR O TIPO DE CONFRONTO
     if(heroi1.getEditora() != heroi2.getEditora()){
    System.out.println("------------CONFRONTO CROSSOVER-----------");
    }
  else {
        System.out.println("------------CONFRONTO DC COMICS-----------");

      }
     System.out.println("             " + heroi1.getNome() + " X " + heroi2.getNome());
     System.out.println("------------------------------------------");
  //Aqui vamos fazer o ataque!!
     while (heroi1.getPf() > 0 && heroi2.getPf() > 0 ) 
      {
      
        Random rand = new Random();
         int randomNumber = rand.nextInt(0,1); 
        if(randomNumber == 0) {
         System.out.println(heroi1.getNome() + " inicia o seu ataque");
         heroi1.Atacar(heroi2);
         System.out.println(heroi2.getNome() + " inicia o seu ataque");
         heroi2.Atacar(heroi1);
         } 
       else if (randomNumber == 1)
      {
        System.out.println(heroi1.getNome() + " inicia o seu ataque");
        heroi1.Atacar(heroi2);
        System.out.println(heroi2.getNome() + " inicia o seu ataque");
        heroi2.Atacar(heroi1);
         
      }
        if(heroi1.getPf() <= 0) {

          System.out.println("O VECEDOR DESSA BATALHA É O : " + heroi2.getNome());
        }
        else if (heroi2.getPf() <= 0){
          System.out.println("O VENCEDOR DESSA BATALHA É O: " +heroi1.getNome());
        }
          
        
  
  }
     
}

 public void confrontar(Heroi heroi1, Vilao vilao) { 
   
   if(heroi1.getEditora() != vilao.getEditora()){
    System.out.println("------------CONFRONTO CROSSOVER-----------");
   }
  else {
        System.out.println("------------CONFRONTO DC COMICS-----------");

      }
   System.out.println("        " + heroi1.getNome() + " X " + vilao.getNome());
   System.out.println("------------------------------------------");
     while (heroi1.getPf() > 0 && vilao.getPf() > 0 ) 
      {
      
        Random rand = new Random();
         int randomNumber = rand.nextInt(0,1); 
        if(randomNumber == 0) {

         System.out.println(heroi1.getNome() + " inicia o seu ataque"); 
         heroi1.Atacar(vilao);
         System.out.println(vilao.getNome() + " inicia o seu ataque");
         vilao.Atacar(heroi1);
         
        } 
       else if (randomNumber == 1)
      {
         System.out.println(vilao.getNome() + " inicia o seu ataque");
         vilao.Atacar(heroi1);
         System.out.println(heroi1.getNome() + " inicia o seu ataque");
         heroi1.Atacar(vilao);
         
      }
        if(heroi1.getPf() <= 0) {

          System.out.println("O VECEDOR DESSA BATALHA É O : " + vilao.getNome());
        }
        else if (vilao.getPf() <= 0){
          System.out.println("O VECEDOR DESSA BATALHA É O : " +heroi1.getNome());
        }
          
        
  
  }
 }   
  
}
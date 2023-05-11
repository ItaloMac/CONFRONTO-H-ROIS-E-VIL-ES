import java.util.ArrayList;

class Main {
  public static void main(String[] args) {

   ArrayList<Personagem> arrayPersonagens = new ArrayList<>();

    // Heróis

    Heroi superman = new Heroi("Superman", "DC Comics", 70, 70, 100, 100, "Clark Kent");

    Heroi homemAranha = new Heroi("Homem Aranha", "Marvel Comics", 50, 50, 80, 80, "Peter Parker");

    Heroi fenix = new Heroi("Fênix", "Marvel Comics", 100, 100, 150, 150, "Jean Grey");

    // vilões
    Vilao superBizarro = new Vilao("superBizarro", "DC Comics", 65, 65, 95, 95, 50);

    Vilao duendeVerde = new Vilao("Duende Verde", "Marvel Comics", 60, 60, 80, 80, 70);

    Vilao doutorOctopus = new Vilao("Dr. Octopus", "Marvel Comics", 40, 40, 70, 70, 40);

    // PODERES
    ArrayList<Poder> Poderes = new ArrayList<Poder>();
    Poder forcaSuperH = new Poder("Força", 10, 8);
    Poder visaoSuperH = new Poder("Visão de Raios", 5, 5);
    Poder soproSuperH = new Poder("Super Sopro", 4, 4);

    Poder forcaHomemA = new Poder("Força", 7, 5);
    Poder teiaHomemA = new Poder("Soltar teia", 5, 5);

    Poder forcaFenix = new Poder("Força", 12, 10);

    Poder forcaBizarro = new Poder("Força", 10, 8);
    Poder visaoBizarro = new Poder("Visão de Raios", 5, 5);
    Poder soproBizarro = new Poder("Super Sopro", 4, 4);

    Poder forcaDuende = new Poder("Força", 7, 7);
    Poder granadaDuende = new Poder("Granada de Abobora", 5, 5);

    Poder tentaculosDr = new Poder("Tentaculos", 6, 4);

    // ADICIONAR PODER A CADA PERSONAGEM
    superman.addPoder(forcaSuperH);
    superman.addPoder(visaoSuperH);
    superman.addPoder(soproSuperH);

    homemAranha.addPoder(forcaHomemA);
    homemAranha.addPoder(teiaHomemA);

    fenix.addPoder(forcaFenix);

    superBizarro.addPoder(forcaBizarro);
    superBizarro.addPoder(visaoBizarro);
    superBizarro.addPoder(soproBizarro);

    duendeVerde.addPoder(forcaDuende);
    duendeVerde.addPoder(granadaDuende);
    doutorOctopus.addPoder(tentaculosDr);

    
    Confronto confronto1 = new Confronto();
    confronto1.confrontar(homemAranha, duendeVerde);
    System.out.println("__________________________________________");
    
    Confronto confronto2 = new Confronto();
    confronto2.confrontar(superman, fenix);
     System.out.println("__________________________________________");
   
    Confronto confronto3 = new Confronto();
    confronto3.confrontar(fenix, superBizarro);
     

  }

}
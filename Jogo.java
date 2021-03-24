import java.util.Random;
public class Jogo {
  public static void main(String... args) 
                              throws InterruptedException {
    // Personagem cacador = new Personagem();
    // cacador.nome = "John";
    // Personagem soneca = new Personagem ();
    // soneca.nome = "soneca";
    Personagem soneca = new Personagem ("soneca", 10);
    // soneca.setSono(10);
    Random gerador = new Random();
    // Personagem soneca = new Personagem();
    // //Personagem cacador2 = new Personagem();
    // soneca.nome = "Soneca";
    // soneca.sono = 10;
    //cacador2.nome = "Mary";
    while (true){
      double oQueFazer = gerador.nextDouble();
      if (oQueFazer <= 0.4){
        soneca.dormir();
      }
      else if (oQueFazer <= 0.7){
        soneca.comer();
      }
      else{
        soneca.cacar();
      }
      System.out.printf("%s: e(%d),f(%d),s(%d)\n", soneca.getNome(), soneca.getEnergia(), soneca.getFome(), soneca.getSono());
      System.out.println("================================");
      Thread.sleep(10000);
      
      
      
      
      // //[0, 3) = 0, 1, 2
      // int oQueFazer = gerador.nextInt(3);
      // switch (oQueFazer){
      //   case 0:
      //     cacador.comer();
      //     break;
      //   case 1:
      //     cacador.cacar();
      //     break;
      //   case 2:
      //     cacador.dormir();
      //     break;
      // }
      // System.out.printf("%s: e(%d),f(%d),s(%d)\n", cacador.nome, cacador.energia, cacador.fome, cacador.sono);
    }
  }
}

public class Jogo {
  public static void main(String... args) 
                              throws InterruptedException {
    Personagem cacador = new Personagem();
    Personagem soneca = new Personagem();
    //Personagem cacador2 = new Personagem();
    cacador.nome = "John";
    soneca.nome = "Soneca";
    soneca.sono = 10;
    //cacador2.nome = "Mary";
    while (true){
      cacador.cacar();
      cacador.comer();
      cacador.dormir();
      cacador.cacar();
      cacador.cacar();
      cacador.cacar();
      soneca.dormir();
      soneca.dormir();
      soneca.dormir();
      soneca.comer();
      soneca.cacar();
      // cacador2.cacar();
      // cacador2.cacar();
      // cacador2.dormir();
      // cacador2.comer();
      System.out.printf("%s: e(%d),f(%d),s(%d)\n", cacador.nome, cacador.energia, cacador.fome, cacador.sono);
      System.out.printf("%s: e(%d),f(%d),s(%d)\n", soneca.nome, soneca.energia, soneca.fome, soneca.sono);
      System.out.println("================================");
      Thread.sleep(10000);
    }
  }
}

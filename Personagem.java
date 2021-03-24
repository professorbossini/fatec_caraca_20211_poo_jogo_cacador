public class Personagem{
  String nome;
  //valor para int: 0
  //desde que a variável seja de instância
  int energia = 10;
  int fome = 0;
  int sono = 0;

  void cacar (){
    if (energia >= 2){
      String exibir = String.format("%s cacando", nome);
      //print (f'{nome} cacando')
      System.out.println(exibir);  
      energia = energia - 2;
    }
    else{
      System.out.println(nome + " sem energia para cacar");
    }
    fome = Math.min(fome + 1, 10);
    sono = Math.min(sono + 1, 10);
  }

  void comer (){
    if (fome >= 1){
      System.out.printf("%s comendo\n", nome);
      energia = Math.min(energia + 1, 10);
      //fome -= 1; // fome = fome - 1;
      fome = Math.max(fome - 1, 0);
    }
    else{
      System.out.println(nome + " sem fome");
    }
  }

  void dormir (){
    if (sono >= 1){
      System.out.println(nome + " dormindo");
      sono -= 1;
      energia = energia + 1 <= 10 ? energia + 1 : 10;
    }
    else{
      System.out.println(nome + " sem sono");
    }
  }
}
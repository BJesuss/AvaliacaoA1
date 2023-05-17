import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
  //O programa deverá pedir o tamanho em metros quadrados da área a ser pintada  
     System.out.println("Informe o tamanho da área em m² a ser pintado: "); 
    double metros = in.nextDouble();
    

    in.close();

    //Calcule a quantidade de litros necessários, quantidade de latas e/ou galões e por final o valor. 
    
   // A cobertura da tinta é de 1 litro para cada 6 metros 
    double litrosTinta = metros / 6;
   //As latas possuem 18 litros. 
    double latasQuantidade = Math.ceil(litrosTinta / 18);
   //Cada lata custa R$80.0 
    double valorLatas = Math.ceil(latasQuantidade * 80);
   //Os galões possuem 3,6 litros. 
    double galaoQuantidade = Math.ceil(litrosTinta / 3.6);
   //Cada galão custa R$25.0 
    double valorGalao = Math.ceil(galaoQuantidade * 25);

   //Apenas Galões:   
    if (litrosTinta < 18) {
    galaoQuantidade = Math.ceil(litrosTinta / 3.6);
      valorGalao = Math.ceil(galaoQuantidade * 25);
      
      System.out.println("Voce irá precisar de " + litrosTinta + " litros de tinta e deverá comprar apenas " + galaoQuantidade + " galão(ões).");
    }  
      
   //Apenas Latas:
    else if ((litrosTinta % latasQuantidade) == 0) {
      System.out.println("Voce irá precisar de " + litrosTinta + " litros de tinta e deverá comprar apenas " + latasQuantidade + " lata(s).");
    }  

    else {
      
  //Mistura de galões e latas, de forma que o desperdício de tinta seja menor, acrescentando 10% de folga.    
    double litrosTintaFolga = litrosTinta*1.1;
    double novaQuantidadeLatas = Math.floor(litrosTintaFolga / 18);
    double litrosTintaFolgaFaltando = litrosTintaFolga - (novaQuantidadeLatas * 18);
    double novaQuantidadeGalao = Math.ceil((litrosTintaFolgaFaltando / 3.6));
      double custoMisturado = (novaQuantidadeLatas * 80) + (novaQuantidadeGalao * 25);
      
      System.out.println("Voce precisará de um MIX \nValor a ser gasto = " + custoMisturado);
      System.out.println("Lata(S) = " + novaQuantidadeLatas +"\nGalão(ões) = " + novaQuantidadeGalao);
    }

  }
}
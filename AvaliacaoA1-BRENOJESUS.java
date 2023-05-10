import java.util.Scanner;
 public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    
    System.out.println("Informe a placa do veículo: ");
    String placa = in.nextLine();
    System.out.println("");

    System.out.println("Informe o valor do litro de combustível: ");
    Float valorLitro = in.nextFloat();
    System.out.println("");

    System.out.println("Informe a quantidade de quilômetros rodados a 60 KM/H");
    Float Distancia60kmh = in.nextFloat();
    System.out.println("");

    System.out.println("Informe a quantidade de quilômetros rodados a 80 KM/H");
    Float Distancia80kmh = in.nextFloat();
    System.out.println("");

    System.out.println("Informe a quantidade de quilômetros rodados a 100 KM/H");
    Float Distancia100kmh = in.nextFloat();
    System.out.println("");

    System.out.println("Informe a quantidade de quilômetros rodados a 120 KM/H");
    Float Distancia120kmh = in.nextFloat();
    System.out.println("");

    System.out.println("Informe a quantidade de quilômetros rodados a 140 KM/H");
    Float Distancia140kmh = in.nextFloat();
    System.out.println("");

    in.close();

    double qntCombustivel60kmh = Distancia60kmh/30.7;
    double qntCombustivel80kmh = Distancia80kmh/26.8;
    double qntCombustivel100kmh = Distancia100kmh/22.4;
    double qntCombustivel120kmh = Distancia120kmh/18.1;
    double qntCombustivel140kmh = Distancia140kmh/14.5;
    
    double qntCombustivelTotal = 
qntCombustivel60kmh + qntCombustivel80kmh + qntCombustivel100kmh + qntCombustivel120kmh + qntCombustivel140kmh;
    
    double velocidadeMediaPonderada = 
((60*Distancia60kmh)+(80*Distancia80kmh)+(100*Distancia100kmh)+(120*Distancia120kmh)+(140*Distancia140kmh)) / (Distancia60kmh+Distancia80kmh+Distancia100kmh+Distancia120kmh+Distancia140kmh);

    double valorTotalCombustivel = 
valorLitro * (qntCombustivel60kmh + qntCombustivel80kmh + qntCombustivel100kmh + qntCombustivel120kmh + qntCombustivel140kmh);

    System.out.println("Placa do veículo: " + placa);
    System.out.printf("Valor total: R$" + "%.2f",valorTotalCombustivel);
    System.out.printf("\nConsumo total: " + "%.2f", qntCombustivelTotal);
    System.out.println("\nVelocidade média ponderada: " + velocidadeMediaPonderada + " km/h");


  }
}
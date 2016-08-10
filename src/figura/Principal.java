package figura;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
      Scanner lector = new Scanner(System.in);
      Figura rectangulo = new Figura();
      int area;
      
      System.out.print("Digite el ancho: ");
      rectangulo.setAncho(lector.nextInt());
      System.out.print("Digite el alto: ");
      rectangulo.setAlto(lector.nextInt());
      
      System.out.println("Ancho: "+rectangulo.getAncho()+
              " Alto: "+rectangulo.getAlto());
      area=rectangulo.area();
          
      System.out.println("Ärea: "+area+" perimetro: "
              +rectangulo.perimetro());
    }
}

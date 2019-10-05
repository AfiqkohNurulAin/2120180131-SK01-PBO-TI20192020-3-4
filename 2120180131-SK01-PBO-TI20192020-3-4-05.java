package fiqoh.pkg5;
public class Fiqoh5 {
    public static void main(String[] args) {
      int x, y, z;
      for(x=10; x>=1; x--){
          for (y=10; y>x; y--){
              System.out.print(" ");
          }
          for (z=1; z<(x*2); z++){
              System.out.print("5");
          }
          System.out.println();
      }
    }
    
}

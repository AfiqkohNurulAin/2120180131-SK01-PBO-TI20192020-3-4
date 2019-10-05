package fiqoh.pkg4;
public class Fiqoh4 {
    public static void main(String[] args) {
        int x, y, z, a;
        for (x=1; x<=10; x++){
            for (y=10; y>=x; y--){
                System.out.print(" ");
            }
            for(z=1; z<=x; z++){
                System.out.print("4");
            }
            for(a=1; a<=x-1; a++){
                System.out.print("4");
            }
            System.out.println();
        }
    }
    
}

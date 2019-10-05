package fiqoh.pkg6;
public class Fiqoh6 {
    public static void main(String[] args) {
        int w, x, y, z;
        int a=10; 
        for (w=1; w<=9; w++){
            for (x=9; x>=w; x--){
                System.out.print(" ");
            }
            for(y=1; y<=w; y++){
                System.out.print("6");
            }
            for(z=1; z<=w-1; z++){
                System.out.print("6");
            }
            System.out.println();
        }
        for(w=1; w<=10; w++){
            for(x=1; x<=w-1; x++){
                System.out.print(" ");
            }
            for(y=10; y>=w; y--){
                System.out.print("6");
            }
            for(z=9; z>=w; z--){
                System.out.print("6");
            }
            System.out.println();
        }
    }
    
}

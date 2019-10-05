package piqqohh2;
public class Piqqohh2 {
    public static void main(String[] args) {
        int x, y, z;
        for (x=1; x<=9; x++){
            for (y=9; y>=x; y--){
                System.out.print(" ");
            }
            for (z=1; z<=x; z++){
                System.out.print("2");
            }
            System.out.println();
        }
    }
    
}

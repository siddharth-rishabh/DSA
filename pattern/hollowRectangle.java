public class hollowRectangle {
    public static void fiveStars(){
        for(int i=0; i<=4; i++){
            System.out.print("x");
        };
    }
    public static void main(String[] main){
        fiveStars();
        System.out.print("\n");
        for(int l=0; l<2; l++){
            for(int j=1; j<=2; j++){
                System.out.print("x");
                for(int k=1; k<=3; k++){
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        fiveStars();
    }
}

public class binToDec {
    public static void binaryToDecimal(int binNum){
        int pow=0;
        int decNum=0;

        while(binNum>0){
            int lstDig = binNum % 10;
            decNum = decNum + lstDig * (int)Math.pow(2, pow);
            pow++;
            binNum = binNum/10;
        }
        System.out.println(decNum);
    }
    public static void main(String[] args) {
        binaryToDecimal(1001110101);

    }
}

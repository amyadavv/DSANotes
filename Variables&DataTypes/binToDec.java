public class binToDec {

    // public static int binToDec (int bin) {
    //     int pow = 0;
    //     int lastDigit = 0;
    //     int dec = 0;

    //     while (bin > 0) {
    //         lastDigit = bin % 10;
    //         dec = dec + lastDigit * (int)Math.pow(2, pow);
    //         bin = bin / 10;
    //         pow++;
    //     }
    //     return dec;
    // }

    public static int decToBin (int n) {
        int pow = 0;
        int bin = 0;
        int remainder = 0;
        
        while(n > 0) {
            remainder = n % 2;
            bin = bin + (remainder * (int)Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
         
        return bin;
    }


    public static void main (String args[]) {
        System.out.println(decToBin(15));
    }
}

public class invertedTriangle {

    public static void printTrinagle (int n) {

        for(int i=1; i<=n; i++) {
            
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            for(int k=1; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        } 
    }

    public static void invertedHalfPriramid (int n) {
        for(int i=0; i<n; i++) {

            for(int j=1; j<=n-i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floydTriangle (int n) {
        int num = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void triangle01 (int n) {

        for(int i=1; i<=n; i++) {

            for(int j=1; j<=i; j++) {
                if((i+j) % 2 ==0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();

        }
    }

    public static void butterflyTriangle (int n) {
        for(int i=1; i<=n; i++) {

            for(int j=1; j<=i; j++) {
                 System.out.print("*");
            }
            for(int spaces=1; spaces<=(n-i)*2; spaces++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                 System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n; i>=1; i--) {
            for(int j=i; j>=1; j--) {
                System.out.print("*");
            }
            for(int spaces = (n-i)*2; spaces>=1; spaces--) {
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solidRhombus (int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int star = 1; star<=n; star++) {
                System.out.print("*");
            }
            System.out.println();
        } 
    }

    public static void hollowRhombus (int n) {

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++) {
                if(j==1 || j==n || i ==1 || i==n)
                {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
         
    }

    public static void diamondPattern (int n) {
        for(int i=1; i<=n; i++) {

            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int star = 1; star<=(2*i)-1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int star = 1; star<=(2*i)-1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main (String [] args) {

        // printTrinagle(4);
        // invertedHalfPriramid(4);
        // floydTriangle(5);
        // triangle01(5);
        // butterflyTriangle(4);
        // solidRhombus(5);
        // hollowRhombus(5);
        diamondPattern(5);
    }
    
}


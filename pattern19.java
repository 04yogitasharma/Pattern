public class pattern19 {
    public static void main(String[] args) {
        int n=4;
        int i=1;
        while(i<=n){
            int space=n-i;
            while(space>=0){
                System.out.print(" ");
                space=space-1;
            }
            int j=1;
            while(j<=i){
                System.out.print(j);
                j++;
            }
            int start=i-1;
            while(start>=1){
                System.out.print(start);
                start--;
            }
            System.out.println();
            i=i+1;
        }
    }
}

//OUTPUT

/*
            1
           121
          12321
         1234321

 */

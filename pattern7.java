public class pattern7 {
    public static void main(String[] args) {
        int i=1;
        int n=5;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(i+" ");

                j++;
            }
            System.out.println();
            i++;
        }
    }
}

//OUTPUT
/*
   1
   1 2
   1 2 3
   1 2 3 4
   1 2 3 4 5
 */

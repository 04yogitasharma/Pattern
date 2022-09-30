public class pattern18 {
    public static void main(String[] args) {
        int n=4;
        int i=1;
        while(i<=n){
            int j=n-i+1;
            while(j>0){
                System.out.print("*"+" ");
                j--;
            }
            System.out.println();
            i++;

        }
    }
}
//OUTPUT
/*
    * * * *
    * * *
    * *
    *

 */

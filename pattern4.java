public class pattern4 {
    public static void main(String[] args) {
        int n=5;
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print(n-j+1+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

//OUTPUT
/*
    5 4 3 2 1
    5 4 3 2 1
    5 4 3 2 1
    5 4 3 2 1
    5 4 3 2 1
 */

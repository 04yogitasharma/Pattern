public class pattern2 {
    public static void main(String[] args) {
        int n=3;
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print(i+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}



//  OUTPUT
/*  1 1 1
    2 2 2
    3 3 3
 */
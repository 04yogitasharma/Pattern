public class pattern16 {
    public static void main(String[] args) {
        int n=4;
        int i=1;
        while(i<=n){
            int j=1;
            char ch= (char) ('A'+n-i);
            while(j<=i){
                System.out.print(ch+" ");
                j++;
                ch= (char) (ch+1);
            }
            System.out.println();
            i++;
        }
    }
}
//OUTPUT
/*
D
C D
B C D
A B C D
 */

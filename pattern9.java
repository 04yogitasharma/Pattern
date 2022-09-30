public class pattern9 {
    public static void main(String[] args) {
        int n=3;
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                char ch= (char) ('A'+i-1);
                System.out.print(ch+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

//OUTPUT
/*
 A A A
 B B B
 C C C
 */

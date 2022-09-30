public class pattern12 {
    public static void main(String[] args) {
        int n=3;
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                char ch=(char)('A'+i+j-2);
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
A B C
B C D
C D E
 */

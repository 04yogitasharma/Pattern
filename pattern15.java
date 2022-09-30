public class pattern15 {
    public static void main(String[] args) {
        int n=4;
        int i=1;
//        char ch='A';
        while(i<=n) {
             int j = 1;
             while(j<=i){
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
A
B C
C D E
D E F G
 */

public class pattern13 {
    public static void main(String[] args) {
        int n=3;
        int i=1;
        char ch='A';
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(ch+" ");

                j++;
            }
            ch=(char)(ch+1);
            System.out.println();
            i++;
        }
    }
}

//OUTPUT
/*
A
B B
C C C
 */

public class pattern5 {
    public static void main(String[] args) {
        int n=5;
        int i=1;
        int count=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print(count+" ");
                j++;
                count++;
            }
            System.out.println();
            i++;
        }
    }
}

//OUTPUT
/*
    1 2 3
    4 5 6
    7 8 9
 */

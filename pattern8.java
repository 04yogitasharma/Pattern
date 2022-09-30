public class pattern8 {
    public static void main(String[] args) {
        int n=4;
        int i=1;
        while(i<=n){
            int value=i;
            int j=1;
            while(j<=i){
                System.out.print(value+" ");
                value--;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

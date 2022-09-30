public class pattern20 {
    public static void main(String[] args) {
        int n=5;
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print(j);
                j++;
            }
            j=j-1;
            int start=i-1;
            while(start>=1){
                System.out.print("*");
                start--;
            }
            int num=n;
            while(num>=i){
                System.out.print(num);
                num--;
            }

            System.out.println();
            i++;
        }
    }
}

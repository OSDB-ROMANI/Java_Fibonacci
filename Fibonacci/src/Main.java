import java.util.Scanner;

public class Main {
    public static long[] fn = new long[100];
    public static void init_fn(){
        fn[0] = 1; fn[1] = 1; fn[2] = 1;
        for(int i=3; i< fn.length;i++) fn[i] = -1;
    }
    public static long  versione_1(int n){
        if(n<=2) return 1;
        return versione_1(n-1)+versione_1(n-2);
    }
    public static long versione_2(int n, long[] fn){
    if(n>=2 &&fn[n]==-1)
        fn[n] = versione_2(n-1,fn)+versione_2(n-2,fn);
        return fn[n];
    }
    public static long versione_3(int n){
        long a = 1, b = 1, temp =0;
        for(int i=0;i<n-2;i++){
            temp = b;
            b = b+a;
            a = temp;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inserisci un numero");
        int n = sc.nextInt();
        init_fn();
        for(int i =0; i<= n;i++)
            System.out.print(versione_1(i)+", ");

    }
}
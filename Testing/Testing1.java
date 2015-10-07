public class Testing1 {
    public static void main(String [ ] args) {
        //System.out.println(3 % 12 + 5 * 4 % 11 / 2.0);
        int k = 16;
        int j = 4;
/*        if(((5+7)/0.5 > 10)) {
            k+=8;
            System.out.println(k);
        } 
        k-= 4;
        System.out.println(k); */
        switch (j){
        case 1: 
        System.out.print(1+" "); 
        k /= 2;
        case 2:
        System.out.print(2+" ");
        k %= 5;
        case 3:
        System.out.printf("3 ");
        k -= 4;
        break;   
        default:
        System.out.printf("default ");
        k *= 5;
        }
        System.out.printf("k = %2.2f\n", (double)k);
    }
}
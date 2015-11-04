public class Testing1 {
    public static void main(String [ ] args) {
        //System.out.println(3 % 12 + 5 * 4 % 11 / 2.0);
/*        int k = 16;
        int j = 4;
        if(((5+7)/0.5 > 10)) {
            k+=8;
            System.out.println(k);
        } 
        k-= 4;
        System.out.println(k); 
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
        System.out.printf("k = %2.2f\n", (double)k); */
        //for (int x = 2; x < 3; x++) {
        //    for (int y = 3; y > 0; y--) {
        //        System.out.println("[" + y + "]");
        //    }
        //}
        /*int x=0;
        for (int i = 0; i < 10; i++) {
            x = i + 1;
            if (i > 4) {
                x = 5 - (i-5);
            }
            for (int j = 0; j < x; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }*/
        /*int x = 0;
        System.out.println("[Start]");
        for (int i = 31; i > 5; i -= 5) {
            System.out.println("[" + i + "]");
        }
        System.out.println("[End]"); */
        for (int i = 2; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k <= j; k++) {
                    System.out.print("b");
                }
                System.out.println("");
            }
        }
    }
}
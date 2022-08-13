public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //task 1
        int []weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        double []abc = {1.57, 7.654, 9.986};
        char []def = {53, 52, 51};


        //task 2
        for (int i = 0; i < weight.length; i ++) {
            if (i == weight.length - 1)
                System.out.println(weight[i]);
            else System.out.print(weight[i] + ".");
        }
        System.out.println();

        for (int d = 0; d < abc.length; d ++) {
            if (d == abc.length - 1)
                System.out.println(abc[d]);
            else System.out.print(abc[d] + ".");
        }
        System.out.println();

        for (int e = def.length - 1; e >= 0; e--) {
            System.out.println(def[e] + "."); }
        System.out.println();
        }


        //task3


        }







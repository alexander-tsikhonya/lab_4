public class Main {
    public static void main(String[] args) {
        A superOb = new A();
        B supOb = new B();

        superOb.i = 10;
        superOb.j = 20;

        System.out.println("Содержимое обЪекта SuperOb");
        superOb.showij();
        System.out.println();

        supOb.i=7;
        supOb.j=8;
        supOb.k=9;
        System.out.println("Содержимое объекта supOb");
        supOb.showij();
        supOb.showk();

        System.out.println();
        System.out.println("Сумма i,j и k в обЪекте supOb");
        supOb.sum();
    }
    }


package HWClassesAndLoops;

public class Tester {
    public static void main(String[] args) {

            Unknown a1 = new Unknown(1, 4);
            Unknown a2 = new Unknown();
            Unknown a3 = new Unknown(3, 8.9);

            //למחלקת UNKNOWN יש 3 בנאים
            //public Unknown (int x, int y);
            //public Unknown ();
            //public Unknown (int a, double b);

            /*
            int x = a1.get1();
            int y = a2.get1();
            if (a3.f(x, y))
                System.out.println("OK");
            else
                System.out.println("Wrong");
             */

            //החתימה של שיטת get1
            //public get1 (int x) {}
            //החתימה של שיטת f
            //public f (int x, int y) {}

        Funcs funcOne = new Funcs();
        funcOne.f1();

        Funcs funcTwo = new Funcs();
        int resultTwo = funcTwo.f2(10);
        System.out.println(resultTwo);

        Funcs funcThree = new Funcs();
        int resultThree = funcThree.f3(4321);
        System.out.println(resultThree);
        }
    }


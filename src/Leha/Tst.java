package Leha;

public class Tst {
    public int f2(int x) {
        int c = 0;
        for (int i = 0; i <= x; i++)
            if (i % 3 == 0)
                c++;
        return c;
    }

    public int f3(int x) {
        int c = 0;
        while (x > 0) {
            x /= 10;
            c++;
        }
        return c;
    }

}

package JavaTst.serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Hero hero = new Hero("Batman");
//        hero.setHp(-60);
////        System.out.println(hero.getHp());
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream
//                ("C://Users/ja-ya/Desktop/Tst/tstJava/File/tst.fileOutputStream.txt"));
//        oos.writeObject(hero);
//        oos.close();


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream
                ("C://Users/ja-ya/Desktop/Tst/tstJava/File/tst.fileOutputStream.txt"));
        Hero hero = (Hero) ois.readObject();
        System.out.println(hero.getHp());

    }
}

class Hero implements Serializable {

    private String name;
    private int hp;

    public Hero(String name) {

        this.name = name;
        this.hp = 100;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {

        if (this.hp + hp > 100) this.hp = 100;
        else this.hp += hp;
    }
}

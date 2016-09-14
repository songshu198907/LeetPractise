package design_pattern.memento
        ;

import design_pattern.memento.practise.Hero;
import design_pattern.memento.practise.MementoCarataker;

/**
 * Created by songheng on 9/14/16.
 */
public class Client {
    public static void main(String[] args) {
        MementoCarataker carataker = new MementoCarataker();
        Hero hero = new Hero("张三丰", 1, 3, 1);
        carataker.setMemento(hero.save());
        System.out.println(hero);
        hero.setHp(10);
        hero.setMp(20);
        hero.setLevel(2);
        System.out.println(hero);
        carataker.setMemento(hero.save());
        hero.setHp(122);
        hero.setMp(200);
        hero.setLevel(10);
        carataker.setMemento(hero.save());
        System.out.println(hero);
        System.out.println("----------------------------------");
        System.out.println("死一次");
        hero.restore(carataker.getMemento(true));
        System.out.println(hero);
        System.out.println("再死一次");
        hero.restore(carataker.getMemento(true));
        System.out.println(hero);
        System.out.println("回到过去");
        hero.restore(carataker.getMemento(false));
        System.out.println(hero);
        System.out.println("回到过去");
        hero.restore(carataker.getMemento(false));
        System.out.println(hero);
    }
}

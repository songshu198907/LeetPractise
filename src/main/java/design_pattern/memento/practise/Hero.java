package design_pattern.memento.practise;

/**
 * Created by songheng on 9/14/16.
 */
public class Hero {
    String name;
    int hp;
    int mp;
    int level;

    public Hero(String name, int hp, int mp, int level) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Memento save() {
        return new Memento(this);

    }

    public void restore(Memento memento) {
        this.name = memento.getName();
        this.hp = memento.getHp();
        this.mp = memento.getMp();
        this.level = memento.getLevel();
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", mp=" + mp +
                ", level=" + level +
                '}';
    }
}

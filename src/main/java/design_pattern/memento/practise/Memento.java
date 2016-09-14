package design_pattern.memento.practise;

/**
 * Created by songheng on 9/14/16.
 */
class Memento {
    private String name;
    private int hp;
    private int mp;
    private int level;

    public Memento(Hero hero) {
        hp = hero.getHp();
        name = hero.getName();
        mp = hero.getMp();
        level = hero.getLevel();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}

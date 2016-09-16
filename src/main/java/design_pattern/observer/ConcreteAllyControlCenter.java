package design_pattern.observer;

/**
 * Created by songheng on 9/16/16.
 */
public class ConcreteAllyControlCenter extends AllyControlCenter {
    public ConcreteAllyControlCenter(String allyName) {
        System.out.println(allyName + "战队组建成功！　");
        System.out.println(" ---------------------- ");
        this.allyName = allyName;
    }

    @Override
    public void notifyObserver(String name) {
        System.out.println(this.allyName + "战队紧急通知，盟友" + name + "正在遭受攻击！");
        for (Observer observer : players) {
            if (!(observer.getName().equalsIgnoreCase(name))) {
                observer.help();
            }
        }
    }
}

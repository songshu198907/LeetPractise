package design_pattern.observer;

/**
 * Created by songheng on 9/16/16.
 */
public interface Observer {
    String getName();

    void setName(String name);

    void help();

    void beAttacked(AllyControlCenter acc);
}

package design_pattern.visitor;

/**
 * Created by shu on 2016/9/18.
 */
public interface Employee {
    void accept(Department handler);
}

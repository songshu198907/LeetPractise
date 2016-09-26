package design_pattern.visitor;

/**
 * Created by shu on 2016/9/18.
 */
public abstract class Department {
    public abstract void visit(FulltimeEmployee employee);

    public abstract void visit(ParttimeEmployee employee);
}

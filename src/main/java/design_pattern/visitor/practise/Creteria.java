package design_pattern.visitor.practise;

/**
 * Created by shu on 2016/9/19.
 */
public interface Creteria {
    void visit(Teacher teacher);

    void visit(Student student);
}

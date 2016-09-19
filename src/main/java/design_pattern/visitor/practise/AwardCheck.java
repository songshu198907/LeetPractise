package design_pattern.visitor.practise;

/**
 * Created by songheng on 9/19/16.
 */
public interface AwardCheck {
    void visit(Student student);

    void visit(Teacher teacher);
}

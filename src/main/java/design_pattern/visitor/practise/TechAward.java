package design_pattern.visitor.practise;

/**
 * Created by songheng on 9/19/16.
 */
public class TechAward implements AwardCheck {
    @Override
    public void visit(Student student) {
        if (student.getPaper() >= 2) {
            System.out.println("学生 : " + student.getName() + " 满足科研奖条件．");
        } else {
            System.out.println("学生 : " + student.getName() + " 不满足科研奖条件．其发表了" + student.getPaper() + " 少于两篇");
        }
    }

    @Override
    public void visit(Teacher teacher) {
        if (teacher.getPaper() >= 10) {
            System.out.println("教师：" + teacher.getName() + " 满足科研奖条件.");

        } else {
            System.out.println("教师 : " + teacher.getName() + " 不满足科研奖条件．其发表了" + teacher.getPaper() + " 少于十篇");
        }
    }
}

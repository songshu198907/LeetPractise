package design_pattern.visitor.practise;

/**
 * Created by songheng on 9/19/16.
 */
public class AcademicAward implements AwardCheck {
    @Override
    public void visit(Student student) {
        if (student.getScore() >= 90) {
            System.out.println("学生 : " + student.getName() + " 满足成绩优秀奖条件．");
        } else {
            System.out.println("学生 : " + student.getName() + " 不满足成绩优秀奖条件．其平均分为" + student.getScore() + " 小于90分");
        }
    }

    @Override
    public void visit(Teacher teacher) {
        if (teacher.getScore() >= 90) {
            System.out.println("教师 : " + teacher.getName() + " 满足成绩优秀奖条件．");
        } else {
            System.out.println("教师 : " + teacher.getName() + " 不满足成绩优秀奖条件．其平均分为" + teacher.getScore() + " 小于90分");
        }
    }
}

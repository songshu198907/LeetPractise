package design_pattern.chain;

/**
 * Created by songheng on 9/12/16.
 */
public class GeneralManager extends Examiner {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void processRequest(LeaveRequest request) {
        if (request.getDays() < 30) {
            System.out.println("总经理　：" + this.name + " 审批了员工：" + request.getName() + ", 编号:" + request.getId() + ",原因：" + request.getReason() + "  " + request.getDays() + " 天假.");
        } else {
            System.out.println("总经理　：" + this.name + " 否决了员工：" + request.getName() + ", 编号:" + request.getId() + ",原因：" + request.getReason() + "  " + request.getDays() + " 天假的请求.");
        }
    }
}

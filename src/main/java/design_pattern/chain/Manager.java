package design_pattern.chain;

/**
 * Created by songheng on 9/12/16.
 */
public class Manager extends Examiner {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void processRequest(LeaveRequest request) {
        if (request.getDays() < 10) {
            System.out.println("经理　：" + this.name + " 审批了员工：" + request.getName() + ", 编号:" + request.getId() + ",原因：" + request.getReason() + "  " + request.getDays() + " 天假.");
        } else if (this.successor != null) {
            this.successor.processRequest(request);
        }
    }
}

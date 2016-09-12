package design_pattern.chain;

/**
 * Created by songheng on 9/12/16.
 */
public class Director2 extends Examiner {
    public Director2(String name) {
        super(name);
    }

    @Override
    public void processRequest(LeaveRequest request) {
        if (request.getDays() < 3) {
            System.out.println("主任　：" + this.name + " 审批了员工：" + request.getName() + ", 编号:" + request.getId() + ",原因：" + request.getReason() + "  " + request.getDays() + " 天假.");
        } else {
            if (this.successor != null) {
                this.successor.processRequest(request);
            }
        }
    }
}

package design_pattern.chain;

/**
 * Created by songheng on 9/12/16.
 */
public class Client {
    public static void main(String[] args) {
//        Approver wjzhang,gyang,jguo,meeting;
//        wjzhang = new Director("张无忌");
//        gyang = new VicePresident("杨过");
//        jguo = new President("郭静");
//        meeting = new Congress("董事会");
//
//        wjzhang.setSuccessor(gyang);
//        gyang.setSuccessor(jguo);
//        jguo.setSuccessor(meeting);
//        PurchaseRequest pr1 = new PurchaseRequest(45000,10001,"购买倚天剑");
//        wjzhang.processRequest(pr1);
//        PurchaseRequest pr2 = new PurchaseRequest(60000,10002,"购买《野球拳》");
//        wjzhang.processRequest(pr2);
//        PurchaseRequest pr3 = new PurchaseRequest(160000,10003,"购买《金刚经》");
//        wjzhang.processRequest(pr3);
//        PurchaseRequest pr4 = new PurchaseRequest(800000,10004,"购买 赵敏");
//        wjzhang.processRequest(pr4);
        Examiner wjzhang, gyang, jguo;
        wjzhang = new Director2("张无忌");
        gyang = new Manager("杨过");
        jguo = new GeneralManager("郭静");
        wjzhang.setSuccessor(gyang);
        gyang.setSuccessor(jguo);
        LeaveRequest lr1 = new LeaveRequest(10001, "不知所措", 2, "睡觉");
        wjzhang.processRequest(lr1);
        LeaveRequest lr2 = new LeaveRequest(10002, "兔不理", 5, "打酱油");
        wjzhang.processRequest(lr2);
        LeaveRequest lr3 = new LeaveRequest(10003, "大松鼠", 22, "去旅游");
        wjzhang.processRequest(lr3);
        LeaveRequest lr4 = new LeaveRequest(10003, "兔大灰", 55, "毁灭世界");
        wjzhang.processRequest(lr4);

    }
}

package design_pattern.chain;

/**
 * Created by songheng on 9/12/16.
 */
public class Director extends Approver {
    public Director(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 50000) {
            System.out.println("主任　" + this.name + "审批采购单：" + request.getNumber() + ",金额:" + request.getAmount()
                    + "，采供目的：" + request.getPurpose()
            );
        } else {
            this.successor.processRequest(request);

        }
    }
}

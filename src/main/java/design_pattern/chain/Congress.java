package design_pattern.chain;

/**
 * Created by songheng on 9/12/16.
 */
public class Congress extends Approver {
    public Congress(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println("董事会　" + this.name + "审批采购单：" + request.getNumber() + ",金额:" + request.getAmount()
                + "，采供目的：" + request.getPurpose()
        );
    }
}

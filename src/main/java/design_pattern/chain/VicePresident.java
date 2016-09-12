package design_pattern.chain;

/**
 * Created by songheng on 9/12/16.
 */
public class VicePresident extends Approver {
    public VicePresident(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 100000) {
            System.out.println("副董事长　" + this.name + "审批采购单：" + request.getNumber() + ",金额:" + request.getAmount()
                    + "，采供目的：" + request.getPurpose()
            );
        } else this.successor.processRequest(request);
    }
}

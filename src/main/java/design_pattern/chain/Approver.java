package design_pattern.chain;

/**
 * Created by songheng on 9/12/16.
 */
public abstract class Approver {
    protected Approver successor;
    protected String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setSuccessor(Approver approver) {
        successor = approver;
    }

    public abstract void processRequest(PurchaseRequest request);
}

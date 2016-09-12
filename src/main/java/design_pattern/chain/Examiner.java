package design_pattern.chain;

/**
 * Created by songheng on 9/12/16.
 */
public abstract class Examiner {
    protected String name;
    protected Examiner successor;

    public Examiner(String name) {
        this.name = name;
    }

    public void setSuccessor(Examiner successor) {
        this.successor = successor;
    }

    public abstract void processRequest(LeaveRequest request);

}


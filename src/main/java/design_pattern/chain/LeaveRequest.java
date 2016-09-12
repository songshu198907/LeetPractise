package design_pattern.chain;

/**
 * Created by songheng on 9/12/16.
 */
public class LeaveRequest {
    private int id;
    private String name;
    private int days;
    private String reason;

    public LeaveRequest(int id, String name, int days, String reason) {
        this.id = id;
        this.name = name;
        this.days = days;
        this.reason = reason;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}

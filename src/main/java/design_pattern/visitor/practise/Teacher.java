package design_pattern.visitor.practise;

/**
 * Created by songheng on 9/19/16.
 */
public class Teacher extends Staff {
    private String name;
    private double score;
    private int paper;

    public Teacher(String name, int paper, double score) {
        this.name = name;
        this.score = score;
        this.paper = paper;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getPaper() {
        return paper;
    }

    public void setPaper(int paper) {
        this.paper = paper;
    }

    @Override
    public void accept(AwardCheck check) {
        check.visit(this);
    }
}

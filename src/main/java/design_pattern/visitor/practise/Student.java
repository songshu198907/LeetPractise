package design_pattern.visitor.practise;

/**
 * Created by songheng on 9/19/16.
 */
public class Student extends Staff {
    private String name;
    private int paper;
    private double score;

    public Student(String name, int paper, double score) {
        this.name = name;
        this.paper = paper;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaper() {
        return paper;
    }

    public void setPaper(int paper) {
        this.paper = paper;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public void accept(AwardCheck check) {
        check.visit(this);
    }
}

package flyweight.learn;

public class Developer implements Employee {

    private final String job;
    private String skill;

    public Developer() {
        this.job = "Develop features and fix issues";
    }

    @Override
    public void assignSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public void task() {
        System.out.println("Developer with skill : " + this.skill + " with job: " + job);
    }
}
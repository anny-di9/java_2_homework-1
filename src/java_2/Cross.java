package java_2;

public class Cross extends Obstacle {
    int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(length);

    }

    @Override
    public boolean isOnDistance() {
        return false;
    }

}
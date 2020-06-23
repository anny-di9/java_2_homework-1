package java_2;

public class Water extends Obstacle {
    int length;

    public Water(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(length);
    }

    @Override
    public boolean isOnDistance() {
        return false;
    }
}

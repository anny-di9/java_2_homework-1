package java_2;


public class Course {

    public Obstacle [] obstacles;

    public Course (Obstacle ... obstacles){
        this.obstacles = obstacles;
    }
    public void doIt (Team team1) {
        for (Competitor c: team1.getMembers()){
            for (Obstacle o: obstacles) {
                o.doIt(c);
                if (!c.isOnDistance()) break;

            }
        }
    }
}

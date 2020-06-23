package java_2;

public class Main {

    public static void main(String[] args) {

        Team team1 = new Team ("Dark", new Cat("Ronny"), new Human("Анна"), new Dog ("Red"));

        Course course1 = new Course(new Water(5), new Wall(3), new Cross(25));
        course1.doIt(team1);
        team1.showWinners();

    }
}







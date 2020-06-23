package java_2;

public class Team {

    public String title;
    public Competitor [] members;



    public Competitor[] getMembers() {
        return members;
    }


    public Team(String title, Competitor... members) {
        this.title = title;
        this.members = members;

    }

        public void showWinners(){
            System.out.println("Победа!");
            for (Competitor o : members) {
                if (o.isOnDistance()) {
                    o.info();
                }
            }
        }

    }



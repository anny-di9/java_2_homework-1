package java_2;


    public interface Competitor {
        void run(int dist);
        void swim(int dist);
        void jump(int height);
        boolean isOnDistance();
        void info();


        void doIt(Obstacle c);
    }
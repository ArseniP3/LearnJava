package Lecture18.CrazyScientist;

public class ProgramRun {
    public static void main(String[] args) {
        Dump d = new Dump();
        RobotFactory r = new RobotFactory(d);
        ProfessorWarehouse p = new ProfessorWarehouse(d);

        Thread t1 = new Thread(r);
        t1.start();
        Thread t2 = new Thread(p);
        t2.start();
    }
}

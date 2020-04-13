package Lecture07;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }

    @Override
    void attackEnemy(Enemy enemyObj) {

    }

    @Override
    public void attackEnemy() {
        System.out.println(getName() +" атакует врага секирой");

    }
}

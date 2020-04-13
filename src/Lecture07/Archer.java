package Lecture07;

public class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }

    @Override
    void attackEnemy(Enemy enemyObj) {

    }

    @Override
    public void attackEnemy() {
        System.out.println(getName() +" атакует врага стрелами из лука");
    }
}

package Lecture07;

public abstract class Hero {

    private String name;

    public Hero(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

//    public void attackEnemy(Lecture07.Enemy enemyObj) {
//        System.out.println(getName() +" атакует врага.");
//        enemyObj.takeDamage(15);
//        enemyObj.setHealth(150);
//
//    }
    abstract void attackEnemy(Enemy enemyObj);

    public abstract void attackEnemy();
}

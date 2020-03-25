public abstract class Hero {

    private String name;

    public Hero(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

//    public void attackEnemy(Enemy enemyObj) {
//        System.out.println(getName() +" атакует врага.");
//        enemyObj.takeDamage(15);
//        enemyObj.setHealth(150);
//
//    }
    abstract void attackEnemy(Enemy enemyObj);

}

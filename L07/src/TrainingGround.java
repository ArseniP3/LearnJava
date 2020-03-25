public class TrainingGround {
    public static void main(String[] args) {

        Hero hero = new Hero("Jargo");
        hero.attackEnemy();

        Warrior wor = new Warrior("Wor");
        wor.attackEnemy();
        Mage mog = new Mage("Moge");
        mog.attackEnemy();
        Archer arch = new Archer("Archi");
        arch.attackEnemy();


    }
}

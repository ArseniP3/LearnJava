public class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }

    @Override
    public String attackEnemy() {
        super.attackEnemy();
        System.out.println(getName() +" атакует врага стрелами из лука");
        return (getName() +" атакует врага стрелами из лука");
    }
}

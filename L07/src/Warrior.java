public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public String attackEnemy() {
        super.attackEnemy();
        System.out.println(getName() +" атакует врага секирой");
        return (getName() +" атакует врага секирой");
    }
}

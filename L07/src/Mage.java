public class Mage extends Hero {
    public Mage(String name) {
        super(name);
    }

    @Override
    public String attackEnemy() {
        super.attackEnemy();
        System.out.println(getName() +" атакует врага искрами");
        return (getName() +" атакует врага искрами");
    }
}

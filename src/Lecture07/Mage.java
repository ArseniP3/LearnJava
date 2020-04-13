package Lecture07;

public abstract class Mage extends Hero {
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println(getName() +" атакует врага искрами");
    }
}

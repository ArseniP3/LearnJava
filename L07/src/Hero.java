public class Hero {

    private String name;

    public Hero(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }
    public String attackEnemy() {
        System.out.println(getName() +" атакует врага.");
        return (getName() +" атакует врага.");
    }
}

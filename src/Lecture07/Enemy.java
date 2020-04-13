package Lecture07;

public class Enemy {
    private int health;

    public int getHealth(){
        return health;
    }
    public void setHealth (int health){
        this.health = health;
    }
    Enemy (int health){
        this.health = health;
    }
    public void takeDamage (int damage){
        health -=damage;
    }

}

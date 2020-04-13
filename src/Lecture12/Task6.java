package Lecture12;

import java.util.Random;

/*
6.	Создать метод случайным образом выбрасывающий одно из 3-х видов исключений.
Вызвать этот метод в блоке try-catch, отлавливающем любое из 3-х.

 */
public class Task6 {
    public static void randomExceptions(){
        Random rnd = new Random();
        int randomizer =1 + rnd.nextInt(3);
        if (randomizer == 1){
            throw new ClassCastException();
        }else if (randomizer == 2){
            throw new ArrayStoreException();
        }else if (randomizer == 3){
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void main(String[] args) {
        try {
            randomExceptions();
        }catch (ClassCastException o){
            o.printStackTrace();
        }catch (ArrayStoreException o){
            o.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException o){
            o.printStackTrace();
        }
    }
}

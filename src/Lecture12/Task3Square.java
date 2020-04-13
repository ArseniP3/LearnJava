package Lecture12;

/*
3. Создать собственный класс-исключение - наследник класса Exception.
Создать метод, выбрасывающий это исключение. Вызвать этот метод и отловить исключение.
Вывести stacktrace в консоль.
 */
public class Task3Square {
    int side;

    public int getPerimeter(int i) throws Task3Exception {
        if (i<=0){
            throw new Task3Exception("You enter incorrect size.");
        }
        int perimeter = i * 4;
        System.out.println("Square perimeter is: " + perimeter);
        return perimeter;
    }

    public static void main(String[] args){
        Task3Square square = new Task3Square();
        try {
            square.getPerimeter(4);
            square.getPerimeter(-2);
        }catch (Task3Exception e){
            e.printStackTrace();
            System.err.println("!!!!you must enter a positive number!!!!");
        }

    }

}



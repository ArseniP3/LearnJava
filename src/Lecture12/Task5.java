package Lecture12;

/*
5.	Бросить одно из существующих в JDK исключений, отловить его и выбросить своё собственное, указав в качестве причины отловленное.
 */
public class Task5 {
    public static void main(String[] args) {
        //String s = null;
        try{
            String s = null;
            s.charAt(2);
        }catch (Exception o){
            try {
                throw new Task3Exception();
            } catch (Task3Exception e) {
                e.printStackTrace();
            }
        }
    }
}

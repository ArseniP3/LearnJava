package Lecture13;

/*
3. Написать функцию, принимающую 2 параметра: строку и слово -и возвращающую true,
если строка начинается и заканчивается этим словом.
 */
public class Task3 {
    public boolean stringAndWord(String word1){
        String string = "Java is the best programming language. I'm learn Java";
        if ( string.startsWith(word1)){
            System.out.println("String: " + string + " begins and ends with the word: " + word1);
            return true;
        }else
            System.out.println("String: " + string + " does not begin and end with the word: " + word1);
        return false;
    }

    public void main(String[] args) {
        stringAndWord("Java");
        stringAndWord("Word");
    }
}

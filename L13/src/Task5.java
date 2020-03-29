/*
5. Подсчитать количество слов в тексте. Учесть, что слова могут разделяться несколькими пробелами.
 */
public class Task5 {
    public static void main(String[] args) {

        System.out.println("How many words in the text?");
        String text = "I like to read very much. Reading is my hobby. I have got a lot of books at home. I like to read books for children.";
        System.out.println(text);
        String delimiter = "\\s*(\\s|,|!|\\.)\\s*";
        String[] subString = text.split(delimiter);
        System.out.println(subString.length);
    }

}

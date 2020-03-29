/*
6. Написать функцию, заменяющую несколько последовательных одинаковых символов в строке одним.
 */
public class Task6 {

    public static void main(String[] args) {
        int j = 0;
        int k = 1;
        StringBuilder duplicate = new StringBuilder("Jaavaaaaaa");
        StringBuilder notDuplicate = null;
//        duplicate = duplicate.replaceAll("([a-z][A-Z][1-9])\\1+", "$1");
//        System.out.println(duplicate);
//     через регулярку прошло, только не понимаю как в условие включить все возможные символы.
        // И не понимаю почему работает не до конца через цикл(

        for (int i = 0; i < duplicate.length(); i++){
            if(duplicate.charAt(j) != duplicate.charAt(k)){

            }else if (duplicate.charAt(j) == duplicate.charAt(k)){
                notDuplicate = duplicate.deleteCharAt(k);
            }
            System.out.println(notDuplicate);
            j++;
            k++;
        }

    }

}

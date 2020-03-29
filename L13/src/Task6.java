/*
6. Написать функцию, заменяющую несколько последовательных одинаковых символов в строке одним.
 */
public class Task6 {

    public static void main(String[] args) {
        int j = 0;
        int k = 1;
        StringBuilder duplicate = new StringBuilder("Jaavaaaaaa");
        StringBuilder notDuplicate = null;
//        duplicate = duplicate.replaceAll("([])\\1+", "$1");
//        System.out.println(duplicate);
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

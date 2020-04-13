package Lecture11;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

/*
2.	Имеется текст. Следует составить для него частотный словарь.
 */
public class Task6_2 {

    public static void main(String[] args) {
        String text = "Meet my family. There are five of us – my parents, my elder brother, my baby sister and me. " +
                "First, meet my mum and dad, Jane and Michael. My mum enjoys reading and my dad enjoys playing chess " +
                "with my brother Ken. My mum is slim and rather tall. She has long red hair and big brown eyes. " +
                "She has a very pleasant smile and a soft voice. My mother is very kind and understanding. We are real friends. " +
                "She is a housewife. As she has three children, she is always busy around the house. " +
                "She takes care of my baby sister Meg, who is only three months old. My sister is very small and funny. " +
                "She sleeps, eats and sometimes cries. We all help our mother and let her have a rest in the evening. " +
                "Then she usually reads a book or just watches TV. My father is a doctor. He is tall and handsome. " +
                "He has short dark hair and gray eyes. all all all all all all all all all all all all all all all";
        String textInLowerCase = text.toLowerCase();
        String delimiter = "\\s*(\\s|,|!|–|\\.)\\s*";
        String[] subString = textInLowerCase.split(delimiter);

        HashMap<String, Integer> map = new HashMap<>();

        Integer in = 1;
        for (int index = 0; index < subString.length; index++){

            if (map.containsKey(subString[index])){
                int a = map.get(subString[index]);
                a++;
                map.put(subString[index], a);


            }else {
                map.put(subString[index], in);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.println("Word: " + entry.getKey() + " - " + entry.getValue());
        }
    }



    }


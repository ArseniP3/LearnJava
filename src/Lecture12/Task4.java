package Lecture12;

import java.awt.*;

/*
4.	Повторить предыдущее упражнение, но наследуя свой класс от класса RuntimeException.
Добавить вконструктор своего класса возможность указания сообщения.

 */
public class Task4 {
    public static void calculateSquare (int rectangle){
        if (rectangle==0){
            throw new NullPointerException("rectangle cant be null");
        }
    }

    public static void main(String[] args) {
        try {
            calculateSquare(0);
        }catch (NullPointerException o){
            System.err.println(o.getMessage());
        }
    }
}


class Task4Exception extends RuntimeException{
    public Task4Exception() {
    }

    public Task4Exception(String message) {
        super(message);
    }

    public Task4Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public Task4Exception(Throwable cause) {
        super(cause);
    }

    public Task4Exception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
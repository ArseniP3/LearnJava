package Lecture30;

import org.junit.Assert;
import org.junit.Test;

public class Task10Test {

    @Test
    public void differenceBetweenDatesInSecondsTest(){
        Task10 task10 = new Task10();
        Assert.assertEquals(7_084_800, task10.differenceBetweenDatesInSeconds());
    }
}

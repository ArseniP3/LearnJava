package Lecture30;

import org.junit.Assert;
import org.junit.Test;

public class Task9Test {

    @Test
    public void differenceBetweenDatesTest(){
        Task9 task9 = new Task9();
        Assert.assertEquals(14, task9.differenceBetweenDates());
    }
}

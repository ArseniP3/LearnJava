package Lecture30;

import org.junit.Assert;
import org.junit.Test;

public class Task6Test {

    @Test
    public void todayPlusThreeMonthTest(){
        Task6 task6 = new Task6();
        Assert.assertEquals(task6.date.plusMonths(3), task6.todayPlusThreeMonth() );

    }
}

package Lecture30;

import org.junit.Assert;
import org.junit.Test;

public class Task5Test {

    @Test
    public void doLocalDateTest(){
        Task5 task5 = new Task5();
        Assert.assertEquals( "25.6.2020", task5.doLocalDate());



    }
}

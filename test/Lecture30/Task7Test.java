package Lecture30;

import org.junit.Assert;
import org.junit.Test;

public class Task7Test {

    @Test
    public void dateToStringTest(){
        Task7 task7 = new Task7();
        Assert.assertEquals("13.04.2020", task7.dateToString());

    }
}

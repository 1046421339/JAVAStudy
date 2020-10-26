package com.jjli.day07;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @ClassName BaseEmployeeTest
 * @Description TODO
 * @Author Jason
 * @Date 2020/10/26
 **/
public class BaseEmployeeTest {
    @Test
    public void print() {
    }

    @Test
    public void getSalary() {
        BaseEmployee be = new MarketEmployee("admin");
        assertEquals(3000, be.getSalary());
    }
}

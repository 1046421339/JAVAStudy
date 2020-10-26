package com.jjli.day07;

import javax.jws.Oneway;

/**
 * @ClassName BaseEmployee
 * @Description TODO
 * @Author Jason
 * @Date 2020/10/26
 **/
public abstract class BaseEmployee {
    public void print() {
        System.out.println("This is an abstract class.");
    }

    /**
     * 发工资
     *
     * @return int
     */
    public abstract int getSalary();
}


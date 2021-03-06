package com.jjli.day07;

/**
 * @ClassName MarketEmployee
 * @Description TODO
 * @Author Jason
 * @Date 2020/10/26
 **/
class MarketEmployee extends BaseEmployee {
    private String id;
    private static final String ADMIN = "admin";
    private static final int HIGHER_SALARY = 3000;
    private static final int LOWER_SALARY = 1000;

    public MarketEmployee(String id) {
        this.id = id;
    }

    public MarketEmployee() {
    }

    @Override
    public void print() {
        super.print();
        System.out.println("This is an abstract class.");
    }

    @Override
    public int getSalary() {
        if (ADMIN.equals(this.id)) {
            return HIGHER_SALARY;
        } else {
            return LOWER_SALARY;
        }
    }
}
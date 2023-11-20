package model;

public class MidDeveloper extends Employee{
    public MidDeveloper(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        setSalary(40000);
        System.out.println(getName() + " mid developer starts to working...");
    }
}

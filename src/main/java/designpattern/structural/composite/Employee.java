package designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合设计模式示例
 * 组合模式用于表示具有层次结构的数据，使得我们对单个对象和组合对象的访问具有一致性。
 * 每个员工都有姓名、部门、薪水这些属性，同时还有下属员工集合（虽然可能集合为
 * 空），而下属员工和自己的结构是一样的，也有姓名、部门这些属性，同时也有他们的下属员工集合。
 */
public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates; // 下属

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    public void add(Employee employee) {
        subordinates.add(employee);
    }

    public void remove(Employee employee) {
        subordinates.remove(employee);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", subordinates=" + subordinates +
                '}';
    }
}

package design_pattern.visitor;

import java.util.ArrayList;

/**
 * Created by shu on 2016/9/18.
 */
public class EmployeeList {
    private ArrayList<Employee> list = new ArrayList<Employee>();

    public void addEmployee(Employee employee) {
        list.add(employee);
    }

    //遍历访问员工集合中的每一个员工对象
    public void accept(Department handler) {
        for (Object obj : list) {
            ((Employee) obj).accept(handler);
        }
    }
}

package design_pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by songheng on 9/14/16.
 */
public class Client {
    public static void main(String[] args) {
//        List products = new ArrayList();
//        products.add("倚天剑");
//        products.add("屠龙刀");
//        products.add("断肠草");
//        products.add("葵花宝典");
//        products.add("四十二章经");
//
//        AbstractObjectList list;
//        AbstractIterator iterator;
//        list = new ProductList(products);
//        iterator = list.createIterator();
//        System.out.println("正向遍历：");
//        while (!iterator.isLast()){
//            System.out.println(iterator.getNextItem()+",");
//            iterator.next();
//        }
//
//        System.out.println();
//        System.out.println("-----------------------------");
//        System.out.println("逆向遍历：");
//        while(!iterator.isFirst()) {
//            System.out.print(iterator.getPreviousItem() + "，");
//            iterator.previous();
//        }
        List<Student> students = new ArrayList<>();
        students.add(new Student("张三疯", 103));
        students.add(new Student("张无忌", 20));
        students.add(new Student("杨过", 43));
        students.add(new Student("郭靖", 50));
        StudentList list = new StudentList(students);
        Iterator it = list.getIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

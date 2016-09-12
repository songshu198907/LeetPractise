package design_pattern.command;

import java.io.Serializable;

/**
 * Created by songheng on 9/12/16.
 */
public class ConfigOperator implements Serializable {
    public void insert(String args) {
        System.out.println("增加新节点 :" + args);
    }

    public void modify(String args) {
        System.out.println("修改节点:" + args);

    }

}

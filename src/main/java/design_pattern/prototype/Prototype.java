package design_pattern.prototype;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;

/**
 * Created by songheng on 8/30/16.
 */
public class Prototype implements Cloneable, Serializable {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public Prototype clone() {
        Object ob = null;
        try {
            ob = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (Prototype) ob;
    }

    public Prototype deepClone() {
        try {
            ByteOutputStream bio = new ByteOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bio);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bio.getBytes());
            ObjectInputStream oin = new ObjectInputStream(bis);
            return (Prototype) oin.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}

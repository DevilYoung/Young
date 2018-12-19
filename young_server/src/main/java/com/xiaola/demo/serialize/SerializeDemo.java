package com.xiaola.demo.serialize;

import java.io.*;

/**
 * Created by xiaola on 18/12/17.
 */
public class SerializeDemo {
    public static void main(String[] args) {

        SerializePerson();

        Person.height = 5;

        Person person =  DeSerializePerson();
        System.out.println("person" + "->" + person.getName() + ":" + person.getAge() + ";" + person.height);

    }

    /**
     * 序列化
     */
    private static void SerializePerson(){

        try{
            ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(new File("person")));
            Person person = new Person();
            person.setAge(18);
            person.setName("小辣");
            oo.writeObject(person);

            System.out.println("序列化成功");
            oo.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    /**
     * 反序列化
     */
    private static Person DeSerializePerson(){
        ObjectInputStream ois = null;
        try{
            ois = new ObjectInputStream(new FileInputStream(new File("person")));
            Person person = (Person)ois.readObject();
            return  person;
           // System.out.println("person" + "->" + person.getName() + ":" + person.getAge());
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return  null;

    }
}

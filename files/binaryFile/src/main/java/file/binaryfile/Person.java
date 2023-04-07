package file.binaryfile;

import java.io.Serializable;

/**
 *
 * @author MrDoisaac
 */
public class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public void showPeopleData(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("");
    }
}

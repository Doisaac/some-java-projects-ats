/*
 * This class was created just for instantiate it on the method "Combo box model"
 */
package window;

public class Person {
    private String name;
    private int age;
    private String nationality;

    public Person(String name){
        this.name = name;
    }
            
    public Person(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return  name;
    }
    
    
    
}

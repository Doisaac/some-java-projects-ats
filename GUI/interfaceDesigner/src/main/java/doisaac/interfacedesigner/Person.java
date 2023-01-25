// GO TO WINDOW CLASS FOR RUN THE PROJECT

package doisaac.interfacedesigner;

public class Person {
    
    // Variables declaration
    private String name;
    private String lastName;
    private String email;
    private String direction;
    private String cellPhoneNumber;

    public Person(String name, String lastName, String email, String direction, String cellPhoneNumber) {
        super();
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.direction = direction;
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }
    
    @Override
    public String toString(){
        return name.concat(" " + lastName);
    }
    
}

package howToJavafx;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {

    private StringProperty firstName = new SimpleStringProperty(this, "firstName", "");

    // return the firstName value (ie. "daisy")
    public String getFirstName() {
        return firstName.get();
    }

    // returns the stringproperty object itself
    public StringProperty firstNameProperty() {
        return firstName;
    }

    // set the firstName value
    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }
}

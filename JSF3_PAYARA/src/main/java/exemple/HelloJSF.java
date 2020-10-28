package exemple;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
 
@Named
@RequestScoped
public class HelloJSF {
 
    private String name;
    private String greet;
 
    public void greetPerson() {
        this.greet = "Hello JSF: " + this.name + " !";
    }
 
    public String getGreet() {
        return greet;
    }
 
    public void setGreet(String greet) {
        this.greet = greet;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
}

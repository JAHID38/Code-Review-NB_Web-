package ShoppingCart.controller;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "show")
public class showController {

    public String logout(){

        return "logout";
    }

    public String shopping(){
        return "shopping";
    }
}

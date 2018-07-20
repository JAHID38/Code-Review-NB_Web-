package ShoppingCart.controller;

import ShoppingCart.model.login;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "logController")

public class loginController {

    login log = new login();

    public login getLog() {
        return log;
    }

    public void setLog(login log) {
        this.log = log;
    }

    public String Login(){

        if(log.getUserName()!= null && log.getPass() != null &&
                log.getUserName().equals("a") && log.getPass().equals("b"))
        {
            return "login";
        }

        else {
            log.setWithErrorMessage("Login failed. Please try again.");
            return "failed";
        }
    }
}

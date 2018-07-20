package ShoppingCart.model;

public class login {

    private String userName;
    private String pass;
    private String withErrorMessage;

    public login() {
    }

    public String getWithErrorMessage() {
        return withErrorMessage;
    }

    public void setWithErrorMessage(String withErrorMessage) {
        this.withErrorMessage = withErrorMessage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}


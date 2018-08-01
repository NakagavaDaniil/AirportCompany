package model.entity;

import java.util.HashMap;
import java.util.Map;

public class User {


    Map users = new HashMap<String,String>();

    String LOGIN;
    String PASSWORD;
    {
        users.put("admin","1");
    }
    public User(String LOGIN, String PASSWORD) {
        this.LOGIN = LOGIN;
        this.PASSWORD = PASSWORD;
    }

    public User() {
    }

    public String getLOGIN() {
        return LOGIN;
    }

    public void setLOGIN(String LOGIN) {
        this.LOGIN = LOGIN;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }
    public boolean getUser(String login, String password){
      return   users.containsKey(login)&&users.containsValue(password);
    }

    public boolean saveUser(String login , String password){
        users.put(login,password);
        return true;
    }
}

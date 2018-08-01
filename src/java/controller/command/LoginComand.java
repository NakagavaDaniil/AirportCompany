package controller.command;
import model.entity.User;


import javax.servlet.http.HttpServletRequest;

public class LoginComand implements Command {

    public String execute(HttpServletRequest request) {

        String name = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(name);
        User user = new User();

        String result =  user.getUser(name,password) ? "Planes.jsp": "login.jsp" ;

        request.getSession().setAttribute("user", user);


        return result;
    }
}

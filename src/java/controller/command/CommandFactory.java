package controller.command;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class CommandFactory {
    private static CommandFactory factory = new CommandFactory();

    private Map<String, Command> comands = new HashMap<String, Command>();

    private CommandFactory() {

    }

    public static CommandFactory commandFactory() {
        if (factory == null) {
            factory = new CommandFactory();
        }
        return factory;
    }

    {
        comands.put("/planes", new PlanesCommand());
        comands.put("/login", new LoginComand());
        comands.put("/sortedPlanes", new SortedPlanesCommand());


    }

    public Command getCommand(HttpServletRequest request) {
        String action = request.getRequestURI();
        System.out.println(action);
        Command command = comands.getOrDefault(action ,
                (r)->"/login.jsp");
        return command;
    }
}

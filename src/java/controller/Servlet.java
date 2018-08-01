package controller;

import controller.command.Command;
import controller.command.CommandFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        proccessRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        proccessRequest(req, resp);
    }
    private void proccessRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        System.out.println("Servlet");
        CommandFactory commandFactory = CommandFactory.commandFactory();
        Command command = commandFactory.getCommand(req);
        String page = command.execute(req);
        RequestDispatcher dispatcher = req.getRequestDispatcher(page);
        dispatcher.forward(req, resp);

    }
}

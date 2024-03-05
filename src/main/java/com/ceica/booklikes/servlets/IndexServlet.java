package com.ceica.booklikes.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.List;

@WebServlet(name = "indexServlet", value = "/index")
public class IndexServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
       // int idbook= Integer.parseInt(request.getParameter("idbook"));
        //User user= (User) request.getSession().getAttribute("user");
        response.setHeader("Location", "/login");
// Si el usuario no ha iniciado sesión, devuelve 303 See Other
//        if (user == null) {
//            response.setStatus(HttpServletResponse.SC_SEE_OTHER);
//            response.setHeader("Location", "/login"); // Indica al cliente que debe ir a /login
//
//        }else {
//
//
//            TaskController taskController = new TaskController();
//            taskController.userLogged = user;
//            taskController.deleteTask(idtask);
//            List<Task> taskList = taskController.getAllTaskByUser();
//            StringBuilder tbody = new StringBuilder();
//            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//
//            for (Task task:taskList){
//                tbody.append("<tr><td>").append(task.getIdtask()).append("</td>")
//                        .append("<td>").append(task.getTitle()).append("</td>")
//                        .append("<td>").append(task.getDescription()).append("</td>")
//                        .append("<td>").append(sdf.format(task.getCreate_time())).append("</td>")
//                        .append("<td>").append(sdf.format(task.getDeadline())).append("</td>")
//                        .append("<td>").append("<i class=\"fa-solid fa-pen-to-square\"></i>")
//                        .append("<i class=\"fa-solid fa-trash\" onClick=\"borrar(").append(task.getIdtask()).append(")\"></i>")
//                        .append("</td></tr>")
//                ;
//
//            };
//            if(taskList.isEmpty()){
//                tbody.append("<td>No hay tareas</td>");
//            }
//            PrintWriter out = response.getWriter();
//            out.write(tbody.toString());
//            //out.write("{\"msg\":\"task deleted\"}");
//        }
    }
}

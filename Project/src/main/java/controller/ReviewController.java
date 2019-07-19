package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.DAO;
import model.Review;
import com.google.gson.Gson;

public class ReviewController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private DAO dao;
    Gson mapper = new Gson();

    @Override
    public void init() throws ServletException {
        dao = new DAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("reviews", dao.getAllReviews());
        RequestDispatcher view = request.getRequestDispatcher("review.jsp");
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String jsonString = request.getParameter("review");
        Review review = mapper.fromJson(request.getParameter("review"), Review.class);
        review.setId(dao.genId());
        dao.addReview(review);

        PrintWriter out = response.getWriter();

        out.print(mapper.toJson(review));
    }

}

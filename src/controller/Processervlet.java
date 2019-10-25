package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Question;

/**
 * Servlet implementation class Processervlet
 */
@WebServlet("/process.do")
public class Processervlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Processervlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int startIndex = Integer.parseInt(request.getSession().getAttribute("startIndex").toString());
		int endIndex = Integer.parseInt(request.getSession().getAttribute("endIndex").toString());
		
		char selectedAnswer = request.getParameter("answer").trim().charAt(0);
		System.out.println("Selected answer "  + selectedAnswer);
		
		Question q = ((ArrayList<Question>) request.getSession().getAttribute("questions")).get(startIndex);
		q.setSelectedAnswer(selectedAnswer);
		
		((ArrayList<Question>) request.getSession().getAttribute("questions")).set(startIndex, q);
		
		System.out.println(((ArrayList<Question>) request.getSession().getAttribute("questions")).set(startIndex, q).getAsnwer());
		
		++startIndex;
		if (startIndex > endIndex) {
			startIndex = 0;
		}
		
		request.getSession().setAttribute("startIndex", startIndex);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	}



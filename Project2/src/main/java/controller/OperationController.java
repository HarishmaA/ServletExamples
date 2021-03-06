package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.OperationService;

public class OperationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		String language = request.getParameter("language");
		String operation = request.getParameter("operation");
		OperationService operationService = new OperationService();
		PrintWriter out = response.getWriter();
		Map<String, String[]> map = request.getParameterMap();
		Set set = map.entrySet();
		Iterator it = set.iterator();
		ArrayList<Integer> arrayList = new ArrayList<>();
		while (it.hasNext()) {
			Map.Entry<String, String[]> entry = (Map.Entry<String, String[]>) it.next();
			String paramName = entry.getKey();
			String[] paramValues = entry.getValue();
			if (paramName.equals("input"))
				for (int i = 0; i < paramValues.length; i++) {
					arrayList.add(Integer.parseInt(paramValues[i]));
				}
		}
		Integer[] input = arrayList.toArray(new Integer[0]);
		int[] intArray = Arrays.stream(input).mapToInt(Integer::intValue).toArray();
		String result = operationService.getResult(operation, intArray);
		String code = operationService.getCodeInParticularLanguage(operation, language);
		request.setAttribute("result", result);
		request.setAttribute("code", code);
		request.getRequestDispatcher("/result.jsp").forward(request, response);

	}

}

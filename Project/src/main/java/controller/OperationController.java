package controller;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
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
//		ArrayList<Integer> arrayList = new ArrayList<>();
//		for (Map.Entry<String, String[]> entry : map.entrySet()) {
//			String paramName = entry.getKey();
//			String[] paramValues = entry.getValue();
//			if (paramName.equals("input"))
//				for (int i = 0; i < paramValues.length; i++) {
//					arrayList.add(Integer.parseInt(paramValues[i]));
//				}
//
//		}
//		Integer[] input = arrayList.toArray(new Integer[0]);
//		int[] intArray = Arrays.stream(input).mapToInt(Integer::intValue).toArray();
		List<Integer> arrayList =new ArrayList<>();
		map.forEach((paramName,paramValues)->{
			if(paramName.equals("input")) {
				List<Integer> values=Arrays.stream(paramValues).map(Integer::valueOf).collect(Collectors.toList());
				arrayList.addAll(values);
			}
		});
		String result = operationService.getResult(operation, arrayList);
		String code = operationService.getCodeInParticularLanguage(operation, language);
		request.setAttribute("result", result);
		request.setAttribute("code", code);
		request.getRequestDispatcher("/result.jsp").forward(request, response);

	}

}

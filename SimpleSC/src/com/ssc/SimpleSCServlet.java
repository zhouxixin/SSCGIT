package com.ssc;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.SingleThreadModel;
import javax.servlet.http.*;

@SuppressWarnings({ "serial", "deprecation" })
public class SimpleSCServlet extends HttpServlet implements SingleThreadModel{
	@SuppressWarnings("rawtypes")
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		
		SolarPowerSystem sps = new SolarPowerSystem();
		
		sps.setAverageDailyHoursOfSunlight(Double.parseDouble(request.getParameter("averageDailyHoursOfSunlight")));
		sps.setEfficiencyLossNorthRoof(Double.parseDouble(request.getParameter("efficiencyLossNorthRoof")));
		sps.setEfficiencyLossWestRoof(Double.parseDouble(request.getParameter("efficiencyLossWestRoof")));
		sps.setPercentageOnWestRoof(Double.parseDouble(request.getParameter("percentageOnWestRoof")));
		sps.setPercentageOnNorthRoof(Double.parseDouble(request.getParameter("percentageOnNorthRoof")));
		sps.setPanelEfficiencye(Double.parseDouble(request.getParameter("panelEfficiency")));
		sps.setSystemSize(Double.parseDouble(request.getParameter("systemSize")));
		sps.setInverterEfficiency(Double.parseDouble(request.getParameter("inverterEfficiency")));
		
		
		
		
		Enumeration test2 = request.getParameterNames();
		
		response.setContentType("text/plain");
		response.getWriter().println("paramaters");
		
		
		do {
			
			String temp = test2.nextElement().toString();					
			response.getWriter().println(temp + " ==> " + request.getParameter(temp));			
			
		} while (test2.hasMoreElements());
		
		response.getWriter().println("Average Daily Solar Generation: " + sps.getAverageDailySolarGeneration());
		
		String destination  ="/result.jsp?result=" + sps.getAverageDailySolarGeneration();        
		response.sendRedirect(response.encodeRedirectURL(destination));
		

	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		this.doGet(request, response);
	}
	
	
}

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script type="text/javascript" src="https://www.google.com/jsapi"></script>
    <script type="text/javascript">
      google.load("visualization", "1", {packages:["corechart"]});
      google.setOnLoadCallback(drawChart);
      function drawChart() {
        var data = google.visualization.arrayToDataTable([
          ['ADSG', 'Brisbane Average', 'Yours'],
          ['',  10,      <%= request.getParameter("result") %>]          
        ]);

        var options = {
          title: 'Average Daily Solar Generation (KW): ',
          hAxis: {title: '', titleTextStyle: {color: 'red'}}
        };

        var chart = new google.visualization.ColumnChart(document.getElementById('chart_div'));
        chart.draw(data, options);
      }
    </script>

<link href = "./styles/style.css" rel = "stylesheet" type = "text/css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result Page</title>
</head>
<body>
	<div class="contentArea">
  	<h1>Result</h1>
    
	Average Daily Solar Generation: 
    <%= request.getParameter("result") %>
	KW
	<br/>
	<br/>
	<div id="chart_div" style="width: 400px; height: 500px;"></div>
	<br/>
	<a href="index.html">Start Again</a>
  
	</div>
</body>
</html>
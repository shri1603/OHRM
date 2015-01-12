<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Open HRM Time Sheet</title>
<link href="../css/style.css" rel="stylesheet" type="text/css" />
<script language="javascript" type="text/javascript">
	
</script>

</head>
<body>
	<div id="wrap">
		<div id="container">
			<div id="title">Open HRM Time Sheet</div>
			<!-- 			<div id="content1 width=550 height=426"></div> -->

			<div id="filterSelect">
				<form id="filterForm" name="filterForm" action="">
					<table>
						<tr>
							<td><label>Location/Branch : </label></td>
							<td><select id="branch" name="branch"
								title="Location/Branch">
									<option value="0">Delhi</option>
									<option value="1">Mumbai</option>
									<option value="2">Ahmedabad</option>
							</select></td>
							<td><label>Employee : </label></td>
							<td><select id="employee" name="employee" title="Employee">
									<option value="0">Fenil</option>
									<option value="1">Gaurang</option>
									<option value="2">Mihir</option>
							</select></td>
							<td>
								<div id='filterSection'>
									<input type="button" id="onSubmitFilterTimesheet"
										value="Filter timesheet">
								</div>
							</td>
						</tr>
						<tr>
							<td><label>Start Date : </label></td>
							<td><select id="startDate" name="startDate"
								title="Start Date">
									<option value="0">06-01-2015</option>
									<option value="1">06-01-2014</option>
									<option value="2">06-01-2013</option>
							</select></td>
							<td><label>End Date : </label></td>
							<td><select id="endDate" name="endDate" title="End Date">
									<option value="0">06-01-2015</option>
									<option value="1">06-01-2014</option>
									<option value="2">06-01-2013</option>
							</select></td>
						</tr>
					</table>
				</form>
			</div>

			<div id="timeSheetContainer">
				<form action="" id="timesheetTableForm" name="timesheetTableForm">
					<table>
						<tr>
							<th>Select</th>
							<th>Start hours</th>
							<th>End hours</th>
							<th>Lunch start time</th>
							<th>Lunch end time</th>
							<th>Total hours</th>
						</tr>
						<c:forEach var="i" begin="1" end="5">
							<tr>
								<td><input type="checkbox"></td>
								<td><input type="text"></td>
								<td><input type="text"></td>
								<td><input type="text"></td>
								<td><input type="text"></td>
								<td><input type="text"></td>
							</tr>
						</c:forEach>
					</table>
					<input type="submit" id="" name="" value="Submit"> <input
						type="button" id="" name="" value="Cancel">
				</form>
			</div>

			<div id="footer">
				<br /> <a href="#">Open HRM Time Sheet</a> | <a href="#">Privacy
					Policy</a> | <a href="#">Terms and Conditions</a>
			</div>
		</div>
	</div>

</body>
</html>
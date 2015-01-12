<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
	<form id="filterForm" name="filterForm" action="">
		<table class="table table-bordered table-condensed tabuler_form">
			<tr>
				<td><label>Location/Branch : </label></td>
				<td><select id="branch" name="branch" title="Location/Branch">
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
				<td><select id="startDate" name="startDate" title="Start Date">
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
</body>
</html>
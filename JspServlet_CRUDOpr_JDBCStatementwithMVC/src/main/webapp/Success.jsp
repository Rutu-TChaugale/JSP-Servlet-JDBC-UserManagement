<%@ page import="com.sit.model.Student" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">-p][p 5e43w21]12W  1	Wa
<title>Success Page</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(to right, #2193b0, #6dd5ed);
        color: #333;
        margin: 0;
        padding: 0;
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        height: 100vh;
    }
    h1 {
        color: #fff;
        margin-bottom: 20px;
        text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.2);
    }
    table {
        width: 90%;
        max-width: 1000px;
        border-collapse: collapse;
        margin: 20px auto;
        background: #fff;
        border-radius: 10px;
        overflow: hidden;
        box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);
    }
    th {
        background-color: #2193b0;
        color: #fff;
        padding: 12px 15px;
        font-size: 18px;
        text-transform: uppercase;
        text-align: center;
    }
    td {
        padding: 10px 15px;
        text-align: center;
        font-size: 16px;
        border-bottom: 1px solid #ddd;
    }
    tr:nth-child(even) {
        background-color: #f4f4f9;
    }
    tr:nth-child(odd) {
        background-color: #e8f8fc;
    }
    tr:hover {
        background-color: #c8e6f9;
        cursor: pointer;
    }
    td[colspan] {
        font-size: 18px;
        color: #555;
        font-weight: bold;
    }
    a {
        text-decoration: none;
        color: #2193b0;
        font-weight: bold;
    }
    a:hover {
        color: #117a92;
        text-decoration: underline;
    }
</style>
</head>
<body>
    <h1>Student Details</h1>
    <table>
        <tr>
            <th>Id</th>
            <th>Full Name</th>
            <th>Email</th>
            <th>Username</th>
            <th>Password</th>
            <th>Confirm Password</th>
            <th>Update</th>
            <th>Delete</th>
        </tr>
        <%
        List<Student> list =(List<Student>) request.getAttribute("StudentList");
        if (list != null && !list.isEmpty()) {
            for (Student s : list) {
        %>
        <tr><
            <td><%= s.getId() %></td>
            <td><%= s.getFullname() %></td>
            <td><%= s.getEmail() %></td>
            <td><%= s.getUsername() %></td>
            <td><%= s.getPassword1() %></td>
            <td><%= s.getConfirm_pass() %></td>
            <td><a href="edit?id=<%= s.getId() %>">Edit+</a></td>
            <td><a href="delete?id=<%= s.getId() %>" onclick="return confirm('Are you sure you want to delete this student?');">Delete+</a></td>
        </tr>
        <%
            }
        } else {
        %>
        <tr>
            <td colspan="8">No data found</td>
        </tr>
        <%
        }
        %>
    </table>
</body>
</html>

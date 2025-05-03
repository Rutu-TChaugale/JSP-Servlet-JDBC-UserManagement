<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(to right, #2193b0, #6dd5ed);
        color: #333;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }
    .container {
        width: 100%;
        max-width: 400px;
        background: #fff;
        border-radius: 10px;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
        padding: 20px;
        text-align: center;
    }
    .container h1 {
        margin-bottom: 20px;
        color: #2193b0;
    }
    .error-message {
        color: red;
        font-weight: bold;
        margin-bottom: 10px;
    }
    .container input[type="text"], .container input[type="password"] {
        width: 90%;
        padding: 10px;
        margin: 10px 0;
        border: 1px solid #ccc;
        border-radius: 5px;
        font-size: 16px;
    }
    .container input[type="submit"] {
        background-color: #2193b0;
        color: white;
        border: none;
        border-radius: 5px;
        padding: 10px 20px;
        font-size: 16px;
        cursor: pointer;
        transition: background-color 0.3s ease;
    }
    .container input[type="submit"]:hover {
        background-color: #176887;
    }
    .container a {
        color: #2193b0;
        text-decoration: none;
        font-weight: bold;
        display: block;
        margin-top: 15px;
    }
    .container a:hover {
        text-decoration: underline;
    }
</style>
</head>
<body>
    <div class="container">
        <h1>Login</h1>
        <form action="log" method="post">
            <!-- Error message inside the box above the login button -->
            <% if (request.getAttribute("errorMessage") != null) { %>
                <div class="error-message">
                    <%= request.getAttribute("errorMessage") %>
                </div>
            <% } %>
            <input type="text" name="username" placeholder="Username" required><br>
            <input type="password" name="password" placeholder="Password" required><br>
            <input type="submit" value="Login"><br>
            <a href="Register.jsp">Don't have an account? Register here</a>
        </form>
    </div>
</body>
</html>

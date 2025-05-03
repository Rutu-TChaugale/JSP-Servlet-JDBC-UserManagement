<%@page import="com.sit.model.Student"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Student Information</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(to right, #6a11cb, #2575fc);
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    .container {
        background: #fff;
        padding: 20px 30px;
        border-radius: 10px;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        width: 400px;
        text-align: center;
    }

    h2 {
        color: #333;
        margin-bottom: 20px;
        font-size: 24px;
        font-weight: bold;
    }

    form {
        display: flex;
        flex-direction: column;
        align-items: center;
    }

    label {
        font-weight: bold;
        font-size: 14px;
        margin-bottom: 5px;
        text-align: left;
        width: 100%;
    }

    input[type="text"], input[type="password"], input[type="hidden"] {
        width: 100%;
        padding: 10px;
        margin-bottom: 15px;
        border: 1px solid #ccc;
        border-radius: 5px;
        font-size: 14px;
    }

    input[type="submit"] {
        width: 100%;
        padding: 10px;
        background-color: #6a11cb;
        color: white;
        border: none;
        border-radius: 5px;
        font-size: 16px;
        cursor: pointer;
        transition: background-color 0.3s ease;
    }

    input[type="submit"]:hover {
        background-color: #4e0e99;
    }

    .message {
        font-size: 12px;
        color: #666;
        margin-top: 15px;
    }
</style>
</head>
<body>
    <div class="container">
        <h2>Update Student Information</h2>
        <form action="update" method="post">
            <input type="hidden" name="id" value="${s.id}">

            <label for="fullname">Full Name:</label>
            <input type="text" id="fullname" name="fullname" value="${s.fullname}" required>

            <label for="email">Email:</label>
            <input type="text" id="email" name="email" value="${s.email}" required>

            <label for="username">Username:</label>
            <input type="text" id="username" name="username" value="${s.username}" required>

            <label for="password1">Password:</label>
            <input type="password" id="password1" name="password1" value="${s.password1}" required>

            <label for="confirm_pass">Confirm Password:</label>
            <input type="password" id="confirm_pass" name="confirm_pass" value="${s.confirm_pass}" required>

            <input type="submit" value="Update">
        </form>
        <div class="message">Ensure all fields are filled correctly before submitting !!</div>
    </div>
</body>
</html>

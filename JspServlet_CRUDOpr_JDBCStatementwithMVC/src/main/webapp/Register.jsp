<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Page</title>
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
        display: none; /* Hidden by default */
    }
    .success-message {
        color: green;
        font-weight: bold;
        margin-bottom: 10px;
        display: none; /* Hidden by default */
    }
    .container input[type="text"], .container input[type="password"], .container input[type="email"] {
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
        <h1>Register</h1>
        <!-- Error messages -->
        <div id="error-message" class="error-message">Passwords do not match!</div>
        <div id="exists-message" class="error-message">You have already registered! <a href="Login.jsp">Go to Login</a></div>
        <div id="success-message" class="success-message">Passwords match! Redirecting...</div>
        
        <form id="registerForm" action="reg" method="post" onsubmit="return validateForm()">
            <input type="text" id="fullname" name="fullname" placeholder="Full Name" required><br>
            <input type="email" id="email" name="email" placeholder="Email" required><br>
            <input type="text" id="username" name="username" placeholder="Username" required><br>
            <input type="password" id="password" name="password" placeholder="Password" required><br>
            <input type="password" id="confirm_pass" name="confirm_pass" placeholder="Confirm Password" required><br>
            <input type="submit" value="Register"><br>
            <a href="Login.jsp">Already have an account? Login here</a>
        </form>
    </div>

    <script>
        function validateForm() {
            var password = document.getElementById("password").value;
            var confirm_pass = document.getElementById("confirm_pass").value;
            var email = document.getElementById("email").value;
            var username = document.getElementById("username").value;
            var errorMessage = document.getElementById("error-message");
            var existsMessage = document.getElementById("exists-message");
            var successMessage = document.getElementById("success-message");

            // Password validation
            if (password !== confirm_pass) {
                errorMessage.style.display = "block";  // Show password error
                existsMessage.style.display = "none";  // Hide exists message
                successMessage.style.display = "none"; // Hide success message
                return false; // Prevent form submission
            } else {
                errorMessage.style.display = "none";   // Hide password error
            }

          
        }
    </script>

</body>
</html>
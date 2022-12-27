<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <body>
        <form action="register" method="POST" id="frmRegister">
            <table>
                <tr>
                    <td>Username
                    <td>
                    <td><input type="text" name="username" id="username" />
                    <td>
                    <td><span style="color: red;" id="validateUsername"></span>
                    <td>
                        <tr />

                <tr>
                    <td>Email
                    <td>
                    <td><input type="text" name="email" id="email" onchange="validateEmail()"/>
                    <td>
                    <td><span style="color: red;" id="validateEmail"></span>
                    <td>
                        <tr />


                <tr>
                    <td>Phone Number
                    <td>
                    <td><input type="text" name="phone" id="phone"/>
                    <td>
                    <td><span style="color: red;" id="validatePhone"></span>
                    <td>
                        <tr />

                <tr>
                    <td>Date oF birth
                    <td>
                    <td><input type="date" name="dob" id="dob"/>
                    <td>
                    <td><span style="color: red;" id="validateDob"></span>
                    <td>
                        <tr />

                <tr>
                    <td>Password
                    <td>
                    <td><input type="password" name="password" id="password" />
                    <td>
                    <td><span style="color: red;" id="validatePassword"></span>
                    <td>
                        <tr />
                <tr>
                    <td>Confirm Password
                    <td>
                    <td><input type="password" name="confirm" id="confirm" />
                    <td>
                    <td><span style="color: red;"  id="validateConfirm"></span>
                    <td>
                        <tr />
                <tr>
                    <td colspan="3"><input type="submit" onclick="validate();" value="Register" />
                    <td>
                        <tr />
            </table>
        </form>

        <script>

            function validateUsername() {
                var username = document.getElementById("username").value;
                var pattern = /^[a-zA-Z0-9]{6,32}$/;
                return pattern.test(username);
            }
            const validatePhone = () => {
                const number = document.getElementById('phone').value
                if(number.length !==10) {
                    return false
                }   
                else{
                    return true
                }
            }
            const validateDate = () => {
                const dob = document.getElementById("dob").value
                const date = new Date(dob)
                const today = new Date()
                if (date.getYear() + 18 <= today.getYear()){
                    return false
                }
                else{
                    return true
                }
            }

            validateEmail = ()=> {
                const email = document.getElementById('email').value
                const regrex = /^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$/
                return regrex.test(email)
            }

            validatePassword = () => {
                const password = document.getElementById('password').value
                const regex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/
                return regex.test(password)
            }
            
            validateConfirm = () => {
                const password = document.getElementById('password').value
                const confirm = document.getElementById('confirm').value
                return password == confirm
            }

            function validate() {

                validateDate()
                var isPassed = true;
                if (!validateUsername()) {
                    document.getElementById("validateUsername").innerHTML
                        = "username must constain 6 to 32 characters";
                    isPassed = false;
                }
                if (!validateUsername()) {
                    document.getElementById("validateEmail").innerHTML
                        = "email enter not correct";
                    isPassed = false;
                }
                if(!validatePhone()) {
                    document.getElementById("validatePhone").innerHTML = 'your password must be at least 10 number long'
                }
                if (validateDate()) {
                    document.getElementById("validateDob").innerHTML = "You are not 18 yet"
                    isPassed = false;
                }
                if(!validatePassword()){
                    document.getElementById("validatePassword").innerHTML = "Your password must be at least 8 characters long and contain only letters(both upper and lower case), numbers, and special characters"
                    isPassed = false;
                }
                if(!validateConfirm()){
                    document.getElementById("validateConfirm").innerHTML = "your password is not match"
                }
                console.log(!validateDate())
                if (isPassed) {
                    document.getElementById("frmRegister").submit();
                }
            }
        </script>
    </body>

    </html>
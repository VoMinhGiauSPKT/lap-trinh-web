<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Murach's Java Servlets and JSP</title>
        <link rel="stylesheet" href="main.css" type="text/css">
    </head>

    <body>

        <img src="images/logo.jpg" alt="Logo">

        <h1>Thanks for completing our survey</h1>

        <p>Here is the information that you entered:</p>


        <h1>Your information</h1>

        <label>First Name:</label>
        <span>${survey.firstName}</span>
        <br>

        <label>Last Name:</label>
        <span>${survey.lastName}</span>
        <br>

        <label>Email:</label>
        <span>${survey.email}</span>
        <br>

        <label>Date of Birth:</label>
        <span>${survey.dateOfBirth}</span>
        <br>


        <h1>How did you hear about us?</h1>

        <label>Your answer:</label>
        <span>${survey.hearAboutUs}</span>
        <br>


        <h1>Announcements</h1>

        <label>New CDs and special offers:</label>
        <span>${survey.offers}</span>
        <br>

        <label>Email announcements:</label>
        <span>${survey.emailAnnouncements}</span>
        <br>


        <h1>Contact</h1>

        <label>Contact me by:</label>
        <span>${survey.contact}</span>
        <br>


        <p>Thank you for completing our survey!</p>

        <form action="index.html" method="get">
            <input type="submit" value="Return">
        </form>

    </body>
</html>
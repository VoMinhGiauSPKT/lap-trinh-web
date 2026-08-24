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

        <p>Your answer: ${survey.hearAboutUs}</p>


        <h1>Announcements</h1>

        <p>New CDs and special offers: ${survey.offers}</p>

        <p>Email announcements: ${survey.emailAnnouncements}</p>


        <h1>Contact</h1>

        <p>Contact me by: ${survey.contact}</p>


        <p>Thank you for completing our survey!</p>

        <form action="index.html" method="get">
            <input type="submit" value="Return">
        </form>

    </body>
</html>
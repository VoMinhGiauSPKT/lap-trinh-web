package murach.email;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/survey")
public class SurveyServlet extends HttpServlet {

    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String dateOfBirth = request.getParameter("dateOfBirth");
        String hearAboutUs = request.getParameter("hearAboutUs");
        String offers = request.getParameter("offers");
        String emailAnnouncements =
                request.getParameter("emailAnnouncements");
        String contact = request.getParameter("contact");

        Survey survey = new Survey();

        survey.setFirstName(firstName);
        survey.setLastName(lastName);
        survey.setEmail(email);
        survey.setDateOfBirth(dateOfBirth);
        survey.setHearAboutUs(hearAboutUs);
        survey.setOffers(offers);
        survey.setEmailAnnouncements(emailAnnouncements);
        survey.setContact(contact);

        request.setAttribute("survey", survey);

        request.getRequestDispatcher("/thanks.jsp")
                .forward(request, response);
    }
}
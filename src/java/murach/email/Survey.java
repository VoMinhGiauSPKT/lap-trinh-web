package murach.email;

public class Survey {

    private String firstName;
    private String lastName;
    private String email;
    private String dateOfBirth;
    private String hearAboutUs;
    private String offers;
    private String emailAnnouncements;
    private String contact;

    public Survey() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getHearAboutUs() {
        return hearAboutUs;
    }

    public void setHearAboutUs(String hearAboutUs) {
        this.hearAboutUs = hearAboutUs;
    }

    public String getOffers() {
        return offers;
    }

    public void setOffers(String offers) {
        this.offers = offers;
    }

    public String getEmailAnnouncements() {
        return emailAnnouncements;
    }

    public void setEmailAnnouncements(String emailAnnouncements) {
        this.emailAnnouncements = emailAnnouncements;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
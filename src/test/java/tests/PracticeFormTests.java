package tests;

import org.junit.jupiter.api.Test;
import pages.PracticeFormPage;

import static tests.TestData.*;

public class PracticeFormTests extends BaseTest {

    PracticeFormPage practiceFormPage = new PracticeFormPage();

    @Test
    void fillStudentRegistrationFormTest() {
        practiceFormPage.openPage()
                .removeBanner()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setUserEmail(email)
                .selectGender(gender)
                .setUserNumber(phoneNumber)
                .setDateOfBirth(year, month, day)
                .selectSubject(subject)
                .selectHobby(hobby1)
                .selectHobby(hobby2)
                .uploadPicture(uploadedPicture)
                .setCurrentAddress(address)
                .selectState(state)
                .selectCity(city)
                .clickSubmitButton()
                .checkResult("Student Name", firstName + " " + lastName)
                .checkResult("Student Email", email)
                .checkResult("Gender", gender)
                .checkResult("Mobile", phoneNumber)
                .checkResult("Date of Birth", day + " " + month + "," + year)
                .checkResult("Subjects", subject)
                .checkResult("Hobbies", hobby1 + ", " + hobby2)
                .checkResult("Picture", uploadedPicture)
                .checkResult("Address", address)
                .checkResult("State and City", state + " " + city);
    }

    @Test
    void fillMinimumDataTest() {
        practiceFormPage.openPage()
                .removeBanner()
                .setFirstName(firstName)
                .setLastName(lastName)
                .selectGender(gender)
                .setUserNumber(phoneNumber)
                .clickSubmitButton()
                .checkResult("Student Name", firstName + " " + lastName)
                .checkResult("Gender", gender)
                .checkResult("Mobile", phoneNumber)
                .checkResult("Date of Birth", todayStr);
    }

    @Test
    void fillWrongDataTest() {
        practiceFormPage.openPage()
                .removeBanner()
                .clickSubmitButton()
                .checkBordersColorInvalidInput();
    }
}

package tests;

import java.time.LocalDate;

public class TestData {

    private static final LocalDate today = LocalDate.now();

    public static String firstName = "Ivan",
            lastName = "Petrov",
            email = "ivanpetrov@gmail.com",
            gender = "Male",
            phoneNumber = "9039998585",
            year = "1990",
            month = "September",
            day = "09",
            subject = "Maths",
            hobby1 = "Sports",
            hobby2 = "Music",
            uploadedPicture = "png-avatar.png",
            address = "Random street, 103",
            state = "Rajasthan",
            city = "Jaiselmer",
            todayStr = today.getDayOfMonth() + " " + today.getMonth() + "," + today.getYear();

}

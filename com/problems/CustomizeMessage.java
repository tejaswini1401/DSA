package com.problems;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CustomizeMessage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String userName = "Teja";
        String userFullName = "Teja Shelake";
        String userContactNumber = "91-1234567890";
        String currentDate = "31/08/2024";

        String templateMessage = "Hello <<name>>, We have your full name as <<full name>> in our system. "
                + "Your contact number is 91-xxxxxxxxxx. Please, let us know in case of any clarification. "
                + "Thank you BridgeLabz 01/01/2016.";

        templateMessage = templateMessage.replaceAll("<<name>>", userName);

        templateMessage = templateMessage.replaceAll("<<full name>>", userFullName);

        templateMessage = templateMessage.replaceAll("91-xxxxxxxxxx", userContactNumber);

        templateMessage = templateMessage.replaceAll("01/01/2016", currentDate);

        System.out.println(templateMessage);

        sc.close();
    }
}

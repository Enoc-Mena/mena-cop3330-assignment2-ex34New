/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Enoc Mena
 */


package com.ex34;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EmployeeRemoval {

    public static void main(String[] args) {

        String remove;

        List<String> myList = Arrays.asList("John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin");

        System.out.println("There are " + myList.size() + " employees:");

        for(int i = 0; i < 1; i++) {

            System.out.println(String.join("\n", myList));

        }

        System.out.println("");

        Scanner r = new Scanner(System.in);
        System.out.print("Enter an employee to remove: ");
        remove = r.next();

        for(int i = myList.size() - 1; i >= 0; --i) {

            String employeeRemoval = myList.get(i);

            if(employeeRemoval.equals(remove)) {

                myList.remove(i);
                break;

            }

        }

        System.out.println("");
        System.out.println("There are " + myList.size() + " employees:");

        for(int i = 0; i < 1; i++) {

            System.out.println(String.join("\n", myList));

        }

    }


}

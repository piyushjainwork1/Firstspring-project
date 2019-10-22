package com.school.studentDetails.util;

public class Conversion {


  public static int stringToInt(String s) {

    if (s.equalsIgnoreCase("First")) {
      return 1;
    }

    else if (s.equalsIgnoreCase("Second")) {
      return 2;
    } else if (s.equalsIgnoreCase("Third")) {
      return 3;
    } else if (s.equalsIgnoreCase("Fourth")) {
      return 4;
    } else if (s.equalsIgnoreCase("Fifth")) {
      return 5;
    } else if (s.equalsIgnoreCase("Sixth")) {
      return 6;
    } else if (s.equalsIgnoreCase("Seven")) {
      return 7;
    } else if (s.equalsIgnoreCase("Eight")) {
      return 8;
    } else if (s.equalsIgnoreCase("Nine")) {
      return 9;
    } else if (s.equalsIgnoreCase("Ten")) {
      return 10;
    }

    return -1;
  }



}

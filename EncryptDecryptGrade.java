package com.BasicProgram;

import java.util.Scanner;
public class EncryptDecryptGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          // encryption means hiding the details
  System.out.print("Enter Your Grade To Encrypt: ");
  char userGrade0=sc.next().charAt(0);
 
  System.out.print("Enter Encoding Number: ");
int encodeNum=sc.nextInt();
char encodeGrade=(char)(encodeNum+userGrade0);



    System.out.println("Your Encrypted Grade: "+encodeGrade);

    // decryption means unhiding the details 
    System.out.print("Enter Encrypted Grade To Decrypt: ");
    char userGrade1=sc.next().charAt(0);
   
   
  char decodeGrade=(char)(encodeGrade-encodeNum);
  
  
  
      System.out.println("Your decrypted Grade: "+decodeGrade);
    }
 
}

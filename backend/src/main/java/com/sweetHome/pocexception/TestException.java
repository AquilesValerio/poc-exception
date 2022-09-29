package com.sweetHome.pocexception;

import com.sun.istack.NotNull;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Client client = new Client();

        @Length(max = 1)
        char name;
        int age;

// first example
// Estava tentando que o name somente aceite uma letra para, eu tentar colocar mais letras e estourar um erro
        try {

            System.out.println("Type the first letter of your name: ");
            name = sc.next().charAt(1);
            System.out.println("Type your age: ");
            age = sc.nextInt();
        } catch (InputMismatchException e) {
            throw new CustomException("Must be a number.");
        }
    }


}

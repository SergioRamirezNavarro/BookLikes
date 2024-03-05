package com.ceica.booklikes.Models;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = "user";
        String password = "password";
        System.out.println("Ingrese su nombre de usuario:");

        String inputUsuario = scanner.nextLine();

        System.out.println("Introduzca su contraseña:");
        String inputPassword = scanner.nextLine();

        if (inputUsuario.equals(username) && inputPassword.equals(password)) {
            System.out.println("Datos correctos. ¡Bienvenido!");
        } else {
            System.out.println("Datos incorrectas. Inténtelo de nuevo.");
        }

        scanner.close();
    }
}

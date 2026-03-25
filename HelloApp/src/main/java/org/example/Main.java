package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
     static void main(String[] args) {
         String greeting;

         if (args.length == 0) {
             greeting = "Hello, World!";
         } else {
             StringBuilder nameBuilder = new StringBuilder();
             for (String name : args) {
                 nameBuilder.append(name).append(", ");
             }
             nameBuilder.substring(0, nameBuilder.length() - 2);
             greeting = "Hello, " + nameBuilder.substring(0, nameBuilder.length() - 2) + "!";
         }

         System.out.println(greeting);
    }
}


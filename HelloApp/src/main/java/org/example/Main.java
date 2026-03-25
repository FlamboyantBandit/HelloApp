package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
     static void main(String[] args) {
         String greeting;

         if (args.length == 0) {
             greeting = "Hello, World!";
         } else {
             StringBuilder names = new StringBuilder();
             for (String name : args) {
                 if (!names.isEmpty()) {
                     names.append(", ");
                 }
                 names.append(name);
             }
             greeting = "Hello, " + names.toString() + "!";
         }

         System.out.println(greeting);
    }
}


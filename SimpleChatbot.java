package org.emp;
import java.util.Scanner;

public class SimpleChatbot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("Chatbot: Hello! Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            input = sc.nextLine().toLowerCase();

            if (input.contains("hello")) {
                System.out.println("Chatbot: Hello! How can I help you?");
            } 
            else if (input.contains("name")) {
                System.out.println("Chatbot: I am a simple Java chatbot.");
            } 
            else if (input.contains("help")) {
                System.out.println("Chatbot: I can answer basic questions.");
            } 
            else if (input.contains("bye")) {
                System.out.println("Chatbot: Goodbye!");
                break;
            } 
            else {
                System.out.println("Chatbot: Sorry, I didn't understand that.");
            }
        }

        sc.close();
    }
}

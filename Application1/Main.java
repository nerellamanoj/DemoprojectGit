package Gitdemo1;

import java.util.Scanner;
 import java.util.ArrayList;
 import java.util.ArrayList;

    public class Main {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ArrayList<Exercise> exercises = new ArrayList<>();
	        int completedExercises = 0;

	        while (true) {
	            System.out.println("\nMenu Options:");
	            System.out.println("1. Add a new exercise");
	            System.out.println("2. Display available exercises");
	            System.out.println("3. Select an exercise to complete");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline character

	            switch (choice) {
	                case 1:
	                    // Add a new exercise
	                    System.out.print("Enter exercise name: ");
	                    String exerciseName = scanner.nextLine();
	                    System.out.print("Enter difficulty level: ");
	                    String difficultyLevel = scanner.nextLine();
	                    System.out.print("Enter exercise duration (in minutes): ");
	                    int exerciseDuration = scanner.nextInt();
	                    scanner.nextLine(); // Consume the newline character
	                    System.out.print("Enter exercise description: ");
	                    String exerciseDescription = scanner.nextLine();

	                    Exercise newExercise = new Exercise(exerciseName, difficultyLevel, exerciseDuration, exerciseDescription);
	                    exercises.add(newExercise);
	                    System.out.println("Exercise added successfully!");
	                    break;

	                case 2:
	                    // Display available exercises
	                    System.out.println("\nAvailable Exercises:");
	                    for (int i = 0; i < exercises.size(); i++) {
	                        Exercise exercise = exercises.get(i);
	                        System.out.println((i + 1) + ". " + exercise.getName() + " (Difficulty: " + exercise.getDifficulty() +
	                                ", Duration: " + exercise.getDuration() + " minutes)");
	                    }
	                    break;

	                case 3:
	                    // Select an exercise to complete
	                    if (exercises.isEmpty()) {
	                        System.out.println("No exercises available to complete.");
	                    } else {
	                        System.out.print("Enter the number of the exercise to complete: ");
	                        int exerciseIndex = scanner.nextInt();
	                        scanner.nextLine(); // Consume the newline character

	                        if (exerciseIndex >= 1 && exerciseIndex <= exercises.size()) {
	                            Exercise selectedExercise = exercises.get(exerciseIndex - 1);
	                            completedExercises++;
	                            System.out.println("You completed the exercise: " + selectedExercise.getName());
	                        } else {
	                            System.out.println("Invalid exercise number. Please try again.");
	                        }
	                    }
	                    break;

	                case 4:
	                    // Exit the application
	                    System.out.println("Exiting the application.");
	                    System.exit(0);

	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	                    break;
	            }
	        }
	    }
	}



package Gitdemo1;

public class User {
	
	private String name;
    private int age;
    private int exercisesCompleted;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.exercisesCompleted = 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getExercisesCompleted() {
        return exercisesCompleted;
    }

    public void completeExercise(Exercise exercise) {
        // Increment the exercisesCompleted count when a user completes an exercise
        exercisesCompleted++;
    }
}

}

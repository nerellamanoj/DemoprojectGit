package Gitdemo1;

public class Exercise {
	
	private String name;
    private int difficultyLevel;
    private int durationMinutes;
    private String description;

    public Exercise(String name, int difficultyLevel, int durationMinutes, String description) {
        this.name = name;
        this.difficultyLevel = difficultyLevel;
        this.durationMinutes = durationMinutes;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDifficultyLevel(int difficultyLevel) {
        // You can add validation here to ensure the difficulty level is within the range (1-5)
        this.difficultyLevel = difficultyLevel;
    }

    public void setDurationMinutes(int durationMinutes) {
        // You can add validation here to ensure the duration is non-negative
        this.durationMinutes = durationMinutes;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "name='" + name + '\'' +
                ", difficultyLevel=" + difficultyLevel +
                ", durationMinutes=" + durationMinutes +
                ", description='" + description + '\'' +
                '}';
    }
}

}

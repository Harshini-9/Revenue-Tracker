class Goal {
    private String goalDescription;
    private String deadline;
    private boolean achieved;

    public Goal(String goalDescription, String deadline) {
        this.goalDescription = goalDescription;
        this.deadline = deadline;
        this.achieved = false;
    }

    public String getGoalDescription() {
        return goalDescription;
    }

    public String getDeadline() {
        return deadline;
    }

    public boolean isAchieved() {
        return achieved;
    }

    public void markAsAchieved() {
        achieved = true;
    }

    @Override
    public String toString() {
        return "Goal: " + goalDescription + ", Deadline: " + deadline + ", Achieved: " + (achieved ? "Yes" : "No");
    }
}

class Artist {
    private String name;
    private List<Goal> goals;

    public Artist(String name) {
        this.name = name;
        goals = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGoal(String goalDescription, String deadline) {
        Goal goal = new Goal(goalDescription, deadline);
        goals.add(goal);
    }

    public List<Goal> getGoals() {
        return goals;
    }

    public void markGoalAsAchieved(int goalIndex) {
        if (goalIndex >= 0 && goalIndex < goals.size()) {
            goals.get(goalIndex).markAsAchieved();
        }
    }
}
public class AppGoalSetting {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Artist artist = null;

	        System.out.print("Enter artist name: ");
	        String artistName = scanner.nextLine();

	        artist = new Artist(artistName);

	        while (true) {
	            System.out.println("\nSelect an option:");
	            System.out.println("1. Add a new goal");
	            System.out.println("2. View artist goals");
	            System.out.println("3. Mark a goal as achieved");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    scanner.nextLine(); 
	                    System.out.print("Enter goal description: ");
	                    String goalDescription = scanner.nextLine();
	                    System.out.print("Enter deadline (e.g., 2024-01-01): ");
	                    String deadline = scanner.nextLine();
	                    artist.addGoal(goalDescription, deadline);
	                    System.out.println("Goal added successfully.");
	                    break;

	                case 2:
	                    List<Goal> artistGoals = artist.getGoals();
	                    System.out.println("\nGoals for " + artist.getName() + ":");
	                    for (int i = 0; i < artistGoals.size(); i++) {
	                        System.out.println("Goal " + (i + 1) + ": " + artistGoals.get(i));
	                    }
	                    break;

	                case 3:
	                    System.out.print("Enter the goal number to mark as achieved: ");
	                    int goalNumber = scanner.nextInt();
	                    artist.markGoalAsAchieved(goalNumber - 1); 
	                    System.out.println("Goal marked as achieved.");
	                    break;

	                case 4:
	                    System.out.println("Exiting the program.");
	                    scanner.close();
	                    System.exit(0);
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please select a valid option.");
	            }
	        }
	    }
	}



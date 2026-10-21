public class Profile {
    private String name;
    private int yearsOfExperience;
    private double dailyStudyHours;
    private boolean learningBackend;

    public Profile(String name, int yearsOfExperience, double dailyStudyHours, boolean learningBackend) {
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
        this.dailyStudyHours = dailyStudyHours;
        this.learningBackend = learningBackend;
    }

    public void showInformation (){
        System.out.println("=== DEVELOPER PROFILE ===\n" +
                "Name: "+this.name+"\n" +
                "Experience: "+this.yearsOfExperience+" years\n" +
                "Daily study: "+this.dailyStudyHours+" hours\n" +
                "Learning Backend: "+this.learningBackend+"\n" +
                "=========================");
    }
}

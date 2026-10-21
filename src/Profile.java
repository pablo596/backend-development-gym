public class Profile {
    private String nombre;
    private int years_expertise;
    private double hours_study;
    private boolean is_learning_be;

    public Profile(String nombre, int years_expertise, double hours_study, boolean is_learning_be) {
        this.nombre = nombre;
        this.years_expertise = years_expertise;
        this.hours_study = hours_study;
        this.is_learning_be = is_learning_be;
    }

    public void showInformaction (){
        System.out.println("=== DEVELOPER PROFILE ===\n" +
                "Name: "+this.nombre+"\n" +
                "Experience: "+this.years_expertise+" years\n" +
                "Daily study: "+this.hours_study+" hours\n" +
                "Learning Backend: "+this.is_learning_be+"\n" +
                "=========================");
    }
}

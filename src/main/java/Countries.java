public class Countries {

    public static void main(String[] args) {

        Countries Demo = new Countries("USA", 500,"English");

        System.out.println("I live in the " + Demo.Country + " with " + Demo.Population + " people" + " and we speak " + Demo.Language);
    }


    // fields go here
    private String Country;
    private double Population;
    private String Language;

    public Countries(String country, double population, String language) {
        Country = country;
        Population = population;
        Language = language;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public double getPopulation() {
        return Population;
    }

    public void setPopulation(double population) {
        Population = population;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }




}

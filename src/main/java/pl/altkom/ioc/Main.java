package pl.altkom.ioc;

public class Main {
    public static void main(String[] args) {
        for (Country c : CountriesService.getEuropeanCountries()) {
            System.out.println(c);
        }
    }
}

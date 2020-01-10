package pl.altkom.ioc;

import pl.altkom.ioc.finders.CsvFileCountriesFinder;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountriesService {
    public static List<Country> getEuropeanCountries() {
        CountriesFinder finder = new CsvFileCountriesFinder("countries.csv");
        List<Country> countries = finder.getCountries();
        return filterByContinent(countries, "Europe");
    }

    private static List<Country> filter(List<Country> countries, Predicate<Country> p) {
        return countries.stream().filter(p).collect(Collectors.toList());
    }

    private static List<Country> filterByContinent(List<Country> countries, String continent) {
        return filter(countries, c -> continent.equals(c.getContinent()));
    }
}

package pl.altkom.ioc;

import com.google.inject.Inject;
import pl.altkom.ioc.finders.CsvFileCountriesFinder;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountriesService {
    @Inject
    CountriesFinder finder;
    public List<Country> getEuropeanCountries() {
        List<Country> countries = finder.getCountries();
        return filterByContinent(countries, "Europe");
    }

    private List<Country> filter(List<Country> countries, Predicate<Country> p) {
        return countries.stream().filter(p).collect(Collectors.toList());
    }

    private List<Country> filterByContinent(List<Country> countries, String continent) {
        return filter(countries, c -> continent.equals(c.getContinent()));
    }
}

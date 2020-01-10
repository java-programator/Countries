package pl.altkom.ioc.finders;

import pl.altkom.ioc.CountriesFinder;
import pl.altkom.ioc.Country;

import java.util.Arrays;
import java.util.List;

public class MemoryCountriesFinder implements CountriesFinder {
    @Override
    public List<Country> getCountries() {
        return Arrays.asList(
                new Country("Poland", "Europe"),
                new Country("China", "Asia"),
                new Country("Chile", "Ameria"),
                new Country("Nigeria", "Africa")
        );
    }
}

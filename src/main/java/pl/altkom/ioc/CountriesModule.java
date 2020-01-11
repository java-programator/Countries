package pl.altkom.ioc;

import com.google.inject.AbstractModule;
import pl.altkom.ioc.finders.CsvFileCountriesFinder;

public class CountriesModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(String.class).toInstance("countries.csv");
        bind(CountriesFinder.class).to(CsvFileCountriesFinder.class);
    }
}

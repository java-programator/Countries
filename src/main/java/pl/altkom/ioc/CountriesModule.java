package pl.altkom.ioc;

import com.google.inject.AbstractModule;
import pl.altkom.ioc.finders.CsvFileCountriesFinder;
import pl.altkom.ioc.finders.MemoryCountriesFinder;

public class CountriesModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(CountriesFinder.class).to(MemoryCountriesFinder.class);
    }
}

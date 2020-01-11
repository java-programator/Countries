package pl.altkom.ioc;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    public static void main(String[] args) {
        Injector injector
                = Guice.createInjector(new CountriesModule());
        CountriesService service
                = injector.getInstance(CountriesService.class);
        for (Country c : service.getEuropeanCountries()) {
            System.out.println(c);
        }
    }
}

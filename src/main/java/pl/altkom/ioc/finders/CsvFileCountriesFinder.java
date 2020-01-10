package pl.altkom.ioc.finders;

import pl.altkom.ioc.Country;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class CsvFileCountriesFinder extends FileCountriesFinder {

    public CsvFileCountriesFinder(String filePath) {
        super(filePath);
    }

    @Override
    public List<Country> getCountries() {
        try {
            return Files.readAllLines(Paths.get(filePath)).stream().map(s -> {
                String[] a = s.split(";");
                return new Country(a[0], a[1]);
            }).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

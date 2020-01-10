package pl.altkom.ioc.finders;

import pl.altkom.ioc.CountriesFinder;

public abstract class FileCountriesFinder implements CountriesFinder {
    protected String filePath;

    public FileCountriesFinder(String filePath) {
        this.filePath = filePath;
    }
}

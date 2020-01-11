package pl.altkom.ioc.finders;

import com.google.inject.Inject;
import pl.altkom.ioc.CountriesFinder;

public abstract class FileCountriesFinder implements CountriesFinder {
    @Inject
    protected String filePath;

    public FileCountriesFinder(String filePath) {
        this.filePath = filePath;
    }

    protected FileCountriesFinder() {
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}

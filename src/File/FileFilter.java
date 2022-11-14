package File;

import java.io.File;
import java.io.FilenameFilter;

public class FileFilter implements FilenameFilter {

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(name);
    }
}

package grmi.org.androidmixer;

import java.io.File;
import java.io.Serializable;

/**
 * Created by Jeremy on 26/08/2016.
 */
public class Track implements Serializable {

    private File file;

    public Track(File file)
    {
        this.file = file;
    }

    public File getFile()
    {
        return this.file;
    }
}

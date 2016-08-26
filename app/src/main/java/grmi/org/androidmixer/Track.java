package grmi.org.androidmixer;

import java.io.File;

/**
 * Created by Jeremy on 26/08/2016.
 */
public class Track {

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

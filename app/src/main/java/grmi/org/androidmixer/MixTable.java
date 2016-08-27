package grmi.org.androidmixer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jeremy on 27/08/2016.
 */
public class MixTable implements Serializable {

    private List<Track> tracks = new ArrayList<>();

    public MixTable()
    {

    }

    public List<Track> getTracks()
    {
        return this.tracks;
    }
}

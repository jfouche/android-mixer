package grmi.org.androidmixer;

import android.os.Environment;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jeremy on 26/08/2016.
 */
public class MixerController {

    private MicRecorder recorder;
    private List<Track> tracks;

    public MixerController()
    {
        this.recorder = new MicRecorder();
        this.tracks = new ArrayList<>();
    }

    public void record()
    {
        File file = getFile();
        Track track = new Track(file);
        this.tracks.add(track);
        //this.recorder.start(file);
    }

    public void stop()
    {
        //this.recorder.stop();
    }

    public List<Track> getTracks()
    {
        return this.tracks;
    }

    private File getFile()
    {
        String name = "track" + this.tracks.size() + ".3gp";
        return new File(Environment.getExternalStorageDirectory(), name);
    }
}

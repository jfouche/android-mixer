package grmi.org.androidmixer;

import android.os.Environment;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jeremy on 26/08/2016.
 */
public class MixerController {

    static private int index = 1;

    private MicRecorder recorder;
    private MixTable mixTable;

    public MixerController()
    {
        this.recorder = new MicRecorder();
        this.mixTable = new MixTable();
    }

    public MixTable getMixTable()
    {
        return mixTable;
    }

    public void record()
    {
        File file = getFile();
        Track track = new Track(file);
        this.mixTable.getTracks().add(track);
        //this.recorder.start(file);
    }

    public void stop()
    {
        //this.recorder.stop();
    }


    private File getFile()
    {
        String name = "track_" + index + ".3gp";
        index++;
        return new File(Environment.getExternalStorageDirectory(), name);
    }
}

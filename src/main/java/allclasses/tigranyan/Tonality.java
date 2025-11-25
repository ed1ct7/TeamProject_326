package allclasses.tigranyan;

import allclasses.tigranyan.Scales;
import allclasses.tigranyan.Notes;

public class Tonality {

    private Notes key;
    private Scales scale;

    public Tonality(Notes key, Scales scale) {
        this.key = key;
        this.scale = scale;
    }

    public String getKey() {
        return key.toString();
    }

    public void setKey(Notes key) {
        this.key = key;
    }

    public Scales getScale() {
        return scale;
    }

    public void setScale(Scales scale) {
        this.scale = scale;
    }

    public boolean isMajor() {
        return this.scale == Scales.MAJOR;
    }

    public boolean isMinor() {
        return this.scale == Scales.MINOR;
    }

    public Notes[] getScaleNotes() {
        if (key == null) return null;

        int[] intervals;

        if (isMajor()) {
            intervals = new int[]{0, 2, 4, 5, 7, 9, 11};
        } else {
            intervals = new int[]{0, 2, 3, 5, 7, 8, 10};
        }

        Notes[] scaleNotes = new Notes[7];
        for (int i = 0; i < intervals.length; i++) {
            scaleNotes[i] = key.transpose(intervals[i]);
        }

        return scaleNotes;
    }

    public Tonality transposeTonality(int semitones) {
        if (key == null) return null;

        Notes newTonic = key.transpose(semitones);
        return new Tonality(newTonic, this.scale);
    }

    @Override
    public String toString() {
        return key + " " + scale;
    }
}

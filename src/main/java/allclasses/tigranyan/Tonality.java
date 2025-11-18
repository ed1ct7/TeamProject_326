package allclasses.tigranyan;

import allclasses.tigranyan.Scales;
import allclasses.tigranyan.Notes;

public class Tonality {

    private String key;
    private Scales scale;

    public Tonality(String key, Scales scale) {
        this.key = key;
        this.scale = scale;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
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

    public Notes getTonicNote() {
        try {
            return Notes.valueOf(key);
        } catch (IllegalArgumentException e) {
            return null; // invalid note string
        }
    }

    public Notes[] getScaleNotes() {
        Notes tonic = getTonicNote();
        if (tonic == null) return null;

        int[] intervals;

        if (isMajor()) {
            intervals = new int[]{0, 2, 4, 5, 7, 9, 11};
        } else {
            intervals = new int[]{0, 2, 3, 5, 7, 8, 10};
        }

        Notes[] scaleNotes = new Notes[7];
        for (int i = 0; i < intervals.length; i++) {
            scaleNotes[i] = tonic.transpose(intervals[i]);
        }

        return scaleNotes;
    }

    public Tonality transposeTonality(int semitones) {
        Notes tonic = getTonicNote();
        if (tonic == null) return null;

        Notes newTonic = tonic.transpose(semitones);
        return new Tonality(newTonic.name(), this.scale);
    }

    @Override
    public String toString() {
        return key + " " + scale;
    }
}

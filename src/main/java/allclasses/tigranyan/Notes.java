package allclasses.tigranyan;

public enum Notes {
    C,
    Cs,
    D,
    Ds,
    E,
    F,
    Fs,
    G,
    Gs,
    A,
    As,
    B;

    @Override
    public String toString() {
        switch (this) {
            case Cs: return "C#";
            case Ds: return "D#";
            case Fs: return "F#";
            case Gs: return "G#";
            case As: return "A#";
            default: return name();
        }
    }

    public Notes transpose(int semitones) {
        Notes[] values = Notes.values();
        int length = values.length;

        int oldIndex = this.ordinal();
        int newIndex = (oldIndex + semitones) % length;

        if (newIndex < 0) {
            newIndex += length;
        }

        return values[newIndex];
    }
}


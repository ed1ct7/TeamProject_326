package tigranyan_tests;

import allclasses.tigranyan.Notes;
import allclasses.tigranyan.Scales;
import allclasses.tigranyan.Tonality;
import org.junit.Test;
import org.junit.Assert;

public class TonalityTests {

    @Test
    public void testIsMajor() {
        Tonality t = new Tonality(Notes.C, Scales.MAJOR);
        Assert.assertTrue(t.isMajor());
        Assert.assertFalse(t.isMinor());
    }

    @Test
    public void testIsMinor() {
        Tonality t = new Tonality(Notes.A, Scales.MINOR);
        Assert.assertTrue(t.isMinor());
        Assert.assertFalse(t.isMajor());
    }

    @Test
    public void testGetScaleNotesMajor() {
        Tonality t = new Tonality(Notes.C, Scales.MAJOR);
        Notes[] scale = t.getScaleNotes();

        Notes[] expected = {
                Notes.C, Notes.D, Notes.E, Notes.F, Notes.G, Notes.A, Notes.B
        };

        Assert.assertArrayEquals(expected, scale);
    }

    @Test
    public void testGetScaleNotesMinor() {
        Tonality t = new Tonality(Notes.A, Scales.MINOR);
        Notes[] scale = t.getScaleNotes();

        Notes[] expected = {
                Notes.A, Notes.B, Notes.C, Notes.D, Notes.E, Notes.F, Notes.G
        };

        Assert.assertArrayEquals(expected, scale);
    }

    @Test
    public void testTransposeTonality() {
        Tonality t = new Tonality(Notes.C, Scales.MAJOR);

        // +2 semitones = D
        Tonality transposed = t.transposeTonality(2);

        Assert.assertEquals("D", transposed.getKey());
        Assert.assertEquals(Scales.MAJOR, transposed.getScale());
    }
}

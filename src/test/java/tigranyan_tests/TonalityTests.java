package tigranyan_tests;

import allclasses.tigranyan.Notes;
import allclasses.tigranyan.Scales;
import allclasses.tigranyan.Tonality;
import org.junit.Test;
import org.junit.Assert;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.Owner;
import io.qameta.allure.junit4.DisplayName;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

@Epic("Music theory module")
@Feature("Tonality logic")
@Owner("tigranyan")
public class TonalityTests {

    @Test
    @Story("Determine if tonality is major")
    @DisplayName("Tonality.isMajor() for C major")
    @Description("Checks that C major tonality is recognized as major, not minor")
    @Severity(SeverityLevel.CRITICAL)
    public void testIsMajor() {
        Tonality t = new Tonality(Notes.C, Scales.MAJOR);
        Assert.assertTrue(t.isMajor());
        Assert.assertFalse(t.isMinor());
    }

    @Test
    @Story("Determine if tonality is minor")
    @DisplayName("Tonality.isMinor() for A minor")
    @Description("Checks that A minor tonality is recognized as minor, not major")
    @Severity(SeverityLevel.CRITICAL)
    public void testIsMinor() {
        Tonality t = new Tonality(Notes.A, Scales.MINOR);
        Assert.assertTrue(t.isMinor());
        Assert.assertFalse(t.isMajor());
    }

    @Test
    @Story("Get notes for major scale")
    @DisplayName("getScaleNotes() for C major")
    @Description("Verifies that C major scale contains correct sequence of notes")
    @Severity(SeverityLevel.NORMAL)
    public void testGetScaleNotesMajor() {
        Tonality t = new Tonality(Notes.C, Scales.MAJOR);
        Notes[] scale = t.getScaleNotes();

        Notes[] expected = {
                Notes.C, Notes.D, Notes.E, Notes.F, Notes.G, Notes.A, Notes.B
        };

        Assert.assertArrayEquals(expected, scale);
    }

    @Test
    @Story("Get notes for minor scale")
    @DisplayName("getScaleNotes() for A minor")
    @Description("Verifies that A minor scale contains correct sequence of notes")
    @Severity(SeverityLevel.NORMAL)
    public void testGetScaleNotesMinor() {
        Tonality t = new Tonality(Notes.A, Scales.MINOR);
        Notes[] scale = t.getScaleNotes();

        Notes[] expected = {
                Notes.A, Notes.B, Notes.C, Notes.D, Notes.E, Notes.F, Notes.G
        };

        Assert.assertArrayEquals(expected, scale);
    }

    @Test
    @Story("Transpose tonality by semitones")
    @DisplayName("transposeTonality() from C major to D major")
    @Description("Checks that transposition by 2 semitones converts C major to D major")
    @Severity(SeverityLevel.CRITICAL)
    public void testTransposeTonality() {
        Tonality t = new Tonality(Notes.C, Scales.MAJOR);

        // +2 semitones = D
        Tonality transposed = t.transposeTonality(2);

        Assert.assertEquals("D", transposed.getKey());
        Assert.assertEquals(Scales.MAJOR, transposed.getScale());
    }
}

package sadekov_tests;

import allclasses.sadekov.ComputerComponent;
import allclasses.sadekov.E_ComponentSpecs;
import org.junit.Assert;
import org.junit.Test;

public class ComputerComponentTests {
    @Test
    public void SpecAddTest()
    {
        ComputerComponent component = new ComputerComponent();
        E_ComponentSpecs Spec = E_ComponentSpecs.Weight;
        double Value = 100.0;
        component.AddEditSpecInfo(Spec,Value);
        Assert.assertEquals(Value, component.GetSpecValue(Spec), 0.0);
    }

    @Test
    public void SpecEditTest()
    {
        ComputerComponent component = new ComputerComponent();
        E_ComponentSpecs Spec = E_ComponentSpecs.Weight;
        double Value = 100.0;
        component.AddEditSpecInfo(Spec,Value);
        Value = 50;
        component.AddEditSpecInfo(Spec,Value);
        Assert.assertEquals(Value, component.GetSpecValue(Spec), 0.0);
    }

    @Test
    public void FreeMemoryCalculationTest() {
        ComputerComponent component = new ComputerComponent();
        E_ComponentSpecs Spec = E_ComponentSpecs.MemoryVolume;
        double Value = 100;
        component.AddEditSpecInfo(Spec,Value);
        Assert.assertEquals(0, component.CalculateFreeMemory(100), 0.0);
    }
    @Test
    public void RublePriceTest(){
        ComputerComponent component = new ComputerComponent();
        E_ComponentSpecs Spec = E_ComponentSpecs.MemoryVolume;
        double Value = 100;
        component.AddEditSpecInfo(Spec,Value);
        Assert.assertEquals(component.GetPrice()*80.0, component.GetRublePrice(), 0.0);
    }

    @Test
    public void IsAvailableTest() throws Exception {
        ComputerComponent component = new ComputerComponent();
        Assert.assertFalse(component.IsAvailable());
    }

}

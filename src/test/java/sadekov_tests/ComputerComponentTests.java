package sadekov_tests;

import allclasses.sadekov.ComputerComponent;
import allclasses.sadekov.E_ComponentSpecs;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;
import io.qameta.allure.TmsLink;
import io.qameta.allure.Issue;

public class ComputerComponentTests {

    @Test
    @DisplayName("Добавление спецификации комплектующего")
    @Description("Тест проверяет корректность добавления новой спецификации к компьютерному комплектующему")
    public void SpecAddTest()
    {
        ComputerComponent component = new ComputerComponent();
        E_ComponentSpecs Spec = E_ComponentSpecs.Weight;
        double Value = 100.0;
        component.AddEditSpecInfo(Spec,Value);
        Assert.assertEquals(Value, component.GetSpecValue(Spec), 0.0);
    }

    @Test
    @DisplayName("Редактирование спецификации комплектующего")
    @Description("Тест проверяет возможность изменения значения уже существующей спецификации комплектующего")
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
    @DisplayName("Расчет свободной памяти комплектующего")
    @Description("Тест проверяет корректность расчета свободного объема памяти комплектующего")
    public void FreeMemoryCalculationTest() {
        ComputerComponent component = new ComputerComponent();
        E_ComponentSpecs Spec = E_ComponentSpecs.MemoryVolume;
        double Value = 100;
        component.AddEditSpecInfo(Spec,Value);
        Assert.assertEquals(0, component.CalculateFreeMemory(100), 0.0);
    }

    @Test
    @DisplayName("Конвертация цены комплектующего в рубли")
    @Description("Тест проверяет корректность конвертации цены комплектующего из долларов в рубли по курсу 80")
    public void RublePriceTest(){
        ComputerComponent component = new ComputerComponent();
        E_ComponentSpecs Spec = E_ComponentSpecs.MemoryVolume;
        double Value = 100;
        component.AddEditSpecInfo(Spec,Value);
        Assert.assertEquals(component.GetPrice()*80.0, component.GetRublePrice(), 0.0);
    }

    @Test
    @DisplayName("Проверка доступности комплектующего")
    @Description("Тест проверяет, что новое комплектующее по умолчанию не доступно для заказа")
    public void IsAvailableTest() {
        ComputerComponent component = new ComputerComponent();
        Assert.assertFalse(component.IsAvailable());
    }
}

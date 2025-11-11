package allclasses.sadekov;

import com.sun.jdi.Value;

import java.util.Enumeration;
import java.util.Map;

public class ComputerComponent {
    private Map<E_ComponentSpecs, Double> Specs;
    final private E_ComponentTypes Type;
    final private String Name;
    final private String Description;
    final private Double Price;

    public ComputerComponent(String _Name, String _Description, Double _Price, E_ComponentTypes _Type, Map<E_ComponentSpecs, Double> _Specs) {
        Name = _Name;
        Description = _Description;
        Price = _Price;
        Type = _Type;
        Specs = _Specs;
    }

    public ComputerComponent() {
        Name = "no name";
        Description = "";
        Price = 0.0;
        Type = E_ComponentTypes.Other;
    }

    public void AddSpec(E_ComponentSpecs Spec, Double Value) {
        Specs.put(Spec, Value);
    }

    public String PrintSpecsInfo() {
        String info = "";
        for (E_ComponentSpecs spec : Specs.keySet()) {
            info = info.concat(spec.name() + " : " + Specs.get(spec).toString() + "\n");
        }
        System.out.printf(info);
        return info;
    }
    public String PrintMainInfo() {
        String info = "";
        info = info.concat("Название модели : " + Name);
        info = info.concat("Описание : " + Description);
        info = info.concat("Tип : " + Type.name());
        info = info.concat("Цена : " + Price);
        return info;
    }
}

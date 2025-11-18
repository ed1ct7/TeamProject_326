package allclasses.sadekov;
import java.util.Map;
import java.util.EnumMap;

public class ComputerComponent {
    private Map<E_ComponentSpecs, Double> Specs;
    final private E_ComponentTypes Type;
    final private String Name;
    final private String Description;
    final private String Vendor;
    final private Double Price;

    public ComputerComponent(String _Name, String _Description, String _Vendor, Double _Price, E_ComponentTypes _Type, Map<E_ComponentSpecs, Double> _Specs) {
        Name = _Name;
        Description = _Description;
        Price = _Price;
        Type = _Type;
        Vendor = _Vendor;

        this.Specs = new EnumMap<>(E_ComponentSpecs.class);
        if (_Specs != null) {
            this.Specs.putAll(_Specs);
        }
    }

    public ComputerComponent() {
        Name = "no name";
        Description = "";
        Price = 0.0;
        Type = E_ComponentTypes.Other;
        Vendor = "";
        Specs = new EnumMap<>(E_ComponentSpecs.class);
    }

    public void AddEditSpecInfo(E_ComponentSpecs Spec, Double Value) {
        if (Specs == null) {
            Specs = new EnumMap<>(E_ComponentSpecs.class);
        }
        Specs.put(Spec, Value);
    }

    public double GetSpecValue(E_ComponentSpecs Spec) {
        if (Specs == null || !Specs.containsKey(Spec)) {
            return 0.0;
        }
        return Specs.get(Spec);
    }

    public double GetPrice() {
        return Price;
    }

    public String PrintSpecsInfo() {
        if (Specs != null && !Specs.isEmpty()) {
            String info = "";
            for (E_ComponentSpecs spec : Specs.keySet()) {
                info = info.concat(spec.name() + " : " + Specs.get(spec).toString() + "\n");
            }
            if (!info.isEmpty()) {
                System.out.printf("\nХарактеристики комплектующего: \n" + info);
                return info;
            }
        }
        System.out.print("\nКласс не содержит описания характеристик\n");
        return "";
    }

    public String PrintMainInfo() {
        String info = "\nОсновная информация о комплектующем: ";
        info = info.concat("\nНазвание модели : " + Name);
        info = info.concat("\nОписание : " + Description);
        info = info.concat("\nПроизводитель : " + Vendor);
        info = info.concat("\nTип : " + Type.name());
        info = info.concat("\nЦена : " + Price + "$");

        System.out.printf(info);
        return info;
    }

    public boolean IsAvailable() {
        return Price > 0;
    }

    public double GetRublePrice() {
        return Price * 80;
    }

    public double CalculateFreeMemory(double Memory) {
        if (Specs != null && Specs.containsKey(E_ComponentSpecs.MemoryVolume)) {
            double totalMemory = GetSpecValue(E_ComponentSpecs.MemoryVolume);
            return totalMemory - Memory;
        }
        return 0 - Memory;
    }
}
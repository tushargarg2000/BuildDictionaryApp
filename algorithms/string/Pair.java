package algorithms.string;

public class Pair{

    String value;
    Integer frequency;

    public Integer getFrequency() {
        return frequency;
    }

    public String getValue() {
        return value;
    }

    public Pair(String val,Integer freq)
    {
        this.value = val;
        this.frequency = freq;
    }
}

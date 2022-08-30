package converter;

public class ConverterModel {
    private float calculationValue;

    public void toFahrenheit(float temperatureValue){
        calculationValue  =  (temperatureValue * 9/5) + 32;
    }

    public float getCalculationValue() {
        return calculationValue;
    }
}

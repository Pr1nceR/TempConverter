package converter;

public class ConverterMain {

    public static void main(String[] args) {
        ConverterView converterView = new ConverterView();
        ConverterModel converterModel = new ConverterModel();
        ConverterController converterController = new ConverterController(converterView,converterModel);

    }
}

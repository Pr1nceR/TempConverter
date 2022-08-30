package converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConverterController {
    private ConverterView converterView;
    private ConverterModel converterModel;

    public ConverterController(ConverterView converterView, ConverterModel converterModel) {
        this.converterView = converterView;
        this.converterModel = converterModel;

        this.converterView.convertValues(new CalculateListener());
    }
    class CalculateListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            float temperatureValue = 0;

               try {
                   temperatureValue = converterView.getInputTextField();
                   converterModel.toFahrenheit(temperatureValue);
                   converterView.setCalcSolution(converterModel.getCalculationValue());
                   // TODO APPLY DESIGN PATTERN
               }catch (NumberFormatException exception){
                   System.out.println(exception);
                   converterView.displayErrorMessage("You need to input numbers");
               }

        }
    }
}

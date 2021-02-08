package project.controller;

import project.AppGlobalState;
import project.model.*;

import java.io.IOException;

public class Controller implements IController {

    ICityCodeProvider codeProvider = new AccuWeatherCityCodeProvider();
    IWeatherProvider weatherProvider = new AccuWeatherProvider() {
        @Override
        public void getWeaterFiveDay(String cityKey) throws IOException {

        }
    };

    @Override
    public void onCityInput(String city) throws IOException {
        if (city.length() == 1) {
            throw new IOException("Недопустимо короткое название города");
        }

        codeProvider.getCodeByCityName(city);
    }

    @Override
    public void onCommandChosen(int selectedCommand) throws IOException {
        switch (selectedCommand) {
            case 1: {
                weatherProvider.getCurrentWeather(AppGlobalState.getInstance().getCityKey());
                break;
            }
            default: {
                throw new IOException("Неверный ввод\n");
            }
        }
    }
}

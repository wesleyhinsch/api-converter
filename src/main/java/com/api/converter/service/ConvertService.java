package com.api.converter.service;

import com.api.converter.dto.ConvertDTO;
import org.springframework.stereotype.Service;

@Service
public class ConvertService {

    public ConvertDTO fahrenheitToCelsius(int value){
        ConvertDTO convertDTO = new ConvertDTO();
        convertDTO.setTemperature((value - 32) * 5/9);
        return convertDTO;
    }

    public ConvertDTO fahrenheitToKelvin(int value){
        ConvertDTO convertDTO = new ConvertDTO();
        convertDTO.setTemperature((int) ((value + 459.67) * 5 / 9));
        return convertDTO;
    }

    public ConvertDTO celsiusToFahrenheit(int value){
        ConvertDTO convertDTO = new ConvertDTO();
        convertDTO.setTemperature((int) (value  * 1.8 + 32));
        return convertDTO;
    }

    public ConvertDTO celsiusToKelvin(int value){
        ConvertDTO convertDTO = new ConvertDTO();
        convertDTO.setTemperature((int) (value  + 273.15));
        return convertDTO;
    }

    public ConvertDTO kelvinToCelsius(int value){
        ConvertDTO convertDTO = new ConvertDTO();
        convertDTO.setTemperature((int) (value  - 273.15));
        return convertDTO;
    }

    public ConvertDTO kelvinToFahrenheit(int value){
        ConvertDTO convertDTO = new ConvertDTO();
        convertDTO.setTemperature((int) (value   - 273.15 * 1.8) + 32);
        return convertDTO;
    }

}

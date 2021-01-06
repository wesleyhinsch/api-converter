package com.api.converter.controller;

import com.api.converter.dto.ConvertDTO;
import com.api.converter.service.ConvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConvertController {

    @Autowired
    private ConvertService convertService;

    @RequestMapping(value = "/fahrenheitToCelsius/{value}", method = RequestMethod.GET)
    public ResponseEntity<ConvertDTO> fahrenheitToCelsius(@PathVariable(value = "value") int value)
    {
        return buildConvertDTOResponseEntity(convertService.fahrenheitToCelsius(value));
    }

    @RequestMapping(value = "/fahrenheitToKelvin/{value}", method = RequestMethod.GET)
    public ResponseEntity<ConvertDTO> fahrenheitToKelvin(@PathVariable(value = "value") int value)
    {
        return buildConvertDTOResponseEntity(convertService.fahrenheitToKelvin(value));
    }

    @RequestMapping(value = "/celsiusToFahrenheit/{value}", method = RequestMethod.GET)
    public ResponseEntity<ConvertDTO> celciusToFahrenheit(@PathVariable(value = "value") int value)
    {
        return buildConvertDTOResponseEntity(convertService.celsiusToFahrenheit(value));
    }

    @RequestMapping(value = "/celsiusToKelvin/{value}", method = RequestMethod.GET)
    public ResponseEntity<ConvertDTO> celciusToKelvin(@PathVariable(value = "value") int value)
    {
        return buildConvertDTOResponseEntity(convertService.celsiusToKelvin(value));
    }

    @RequestMapping(value = "/kelvinToCelsius/{value}", method = RequestMethod.GET)
    public ResponseEntity<ConvertDTO> kelvinToCelsius(@PathVariable(value = "value") int value)
    {
        return buildConvertDTOResponseEntity(convertService.kelvinToCelsius(value));
    }

    @RequestMapping(value = "/kelvinToFahrenheit/{value}", method = RequestMethod.GET)
    public ResponseEntity<ConvertDTO> kelvinToFahrenheit(@PathVariable(value = "value") int value)
    {
        return buildConvertDTOResponseEntity(convertService.kelvinToFahrenheit(value));
    }

    private ResponseEntity<ConvertDTO> buildConvertDTOResponseEntity(ConvertDTO convertDTO) {
        if (convertDTO != null)
            return new ResponseEntity<ConvertDTO>(convertDTO, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}

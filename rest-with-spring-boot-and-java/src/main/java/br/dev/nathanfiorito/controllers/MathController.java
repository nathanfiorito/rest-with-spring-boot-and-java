package br.dev.nathanfiorito.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.dev.nathanfiorito.converters.NumberConverter;
import br.dev.nathanfiorito.exceptions.UnsupportedMathOperationException;
import br.dev.nathanfiorito.math.SimpleMath;

@RestController
public class MathController {
	@GetMapping("/sum/{numberOne}/{numberTwo}")
	public Double sum(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception
	{
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) 
		{
			throw new UnsupportedMathOperationException("Please set a numeric value.");
		}
		return SimpleMath.sum(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	
	@GetMapping("/sub/{numberOne}/{numberTwo}")
	public Double sub(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception
	{
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) 
		{
			throw new UnsupportedMathOperationException("Please set a numeric value.");
		}
		return SimpleMath.sub(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
		
	@GetMapping("/mult/{numberOne}/{numberTwo}")
	public Double mult(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception
	{
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) 
		{
			throw new UnsupportedMathOperationException("Please set a numeric value.");
		}
		return SimpleMath.mult(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	
	@GetMapping("/div/{numberOne}/{numberTwo}")
	public Double div(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception
	{
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) 
		{
			throw new UnsupportedMathOperationException("Please set a numeric value.");
		}
		return SimpleMath.div(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	
	@GetMapping("/med/{numberOne}/{numberTwo}")
	public Double med(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception
	{
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) 
		{
			throw new UnsupportedMathOperationException("Please set a numeric value.");
		}
		return SimpleMath.med(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	
	@GetMapping("/sqroot/{numberOne}")
	public Double sqroot(@PathVariable(value = "numberOne") String numberOne) throws Exception
	{
		if(!NumberConverter.isNumeric(numberOne)) 
		{
			throw new UnsupportedMathOperationException("Please set a numeric value.");
		}
		return SimpleMath.sqroot(NumberConverter.convertToDouble(numberOne));
	}
}

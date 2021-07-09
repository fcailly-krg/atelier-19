package com.krgcorporate.ocp;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Subtraction implements CalculatorOperation {
    private double left;
    private double right;
    private double result = 0.0;
}

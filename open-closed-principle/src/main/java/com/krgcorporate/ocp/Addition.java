package com.krgcorporate.ocp;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Addition implements CalculatorOperation {
    private final double left;
    private final double right;
    private double result = 0.0;

    @Override
    public void perform() {
        result = left + right;
    }
}

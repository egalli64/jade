package com.example.jade.s02.dip;

public class OperationMult implements Operation {
    @Override
    public double operate(double left, double right) {
        return left * right;
    }
}

package com.example.jade.s02.dip;

public class OperationAdd implements Operation {
    @Override
    public double operate(double left, double right) {
        return left + right;
    }
}

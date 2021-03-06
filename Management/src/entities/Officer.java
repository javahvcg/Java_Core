/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import exception.InvalidValueException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author anhquan17
 */
public class Officer extends Employee {

    private float coefficient;



    public float getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(float coefficient) throws InvalidValueException {
        if (coefficient > 0) {
            this.coefficient = coefficient;
        } else {
            InvalidValueException invalidValueException = new InvalidValueException();
            throw invalidValueException;
        }

    }

    @Override
    public void inputData() {
        try {
            super.inputData();
            System.out.println("input coefficient :");
            this.setCoefficient(new Scanner(System.in).nextFloat());
        } catch (InvalidValueException ex) {
           ex.getMessage();
        }

    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("coefficient" + this.getCoefficient());

    }

    @Override
    public float receiveSalary() {
        return (float) this.getSalary() * this.coefficient;
    }

}

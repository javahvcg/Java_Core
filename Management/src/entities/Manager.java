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
public class Manager extends Employee {

    private int numberEmployee;



    public int getNumberEmployee() {
        return numberEmployee;
    }

    public void setNumberEmployee(int numberEmployee) throws InvalidValueException {
        if (numberEmployee > 0) {
            this.numberEmployee = numberEmployee;
        } else {
            InvalidValueException invalidValueException = new InvalidValueException();
            throw invalidValueException;
        }
    }

    @Override
    public float receiveSalary() {
        if (this.numberEmployee < 10) {
            return (float) this.getSalary() + 500;
        } else {
            if (this.numberEmployee < 20) {
                return (float) this.getSalary() + 1000;
            } else {
                return (float) this.getSalary() + 2000;
            }
        }
    }

    @Override
    public void inputData() {
        try {
            super.inputData();
            System.out.println("Enter Number Employee");
            this.setNumberEmployee(new Scanner(System.in).nextInt());
        } catch (InvalidValueException ex) {
            ex.getMessage();
        }
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Number Employee" + this.getNumberEmployee());
    }

}

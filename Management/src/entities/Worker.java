/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import exception.InvalidValueException;
import exception.QuanException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author anhquan17
 */
public class Worker extends Employee {

    private int numberOfWorkDay;



    public int getNumberOfWorkDay() {
        return numberOfWorkDay;
    }

    public void setNumberOfWorkDay(int numberOfWorkDay) throws InvalidValueException {
        if (numberOfWorkDay > 0) {
            this.numberOfWorkDay = numberOfWorkDay;
        } else {
            InvalidValueException invalidValueException = new InvalidValueException();
            throw invalidValueException;
        }
    }

    @Override
    public float receiveSalary() {
        return (float) this.getSalary() * this.numberOfWorkDay / 26;
    }

    @Override
    public void inputData() {
        try {
            super.inputData();
            System.out.println("Enter Number Of WorkDays");
            this.setNumberOfWorkDay(new Scanner(System.in).nextInt());
        } catch (InvalidValueException ex) {
            Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Number Of WorkDays: " + this.getNumberOfWorkDay());
    }

}

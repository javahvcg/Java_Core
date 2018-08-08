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
public abstract class Employee implements IEmployee {

    protected static int currentId = 1;
    private int id;
    private String name;
    private Gender gender;
    private float salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = currentId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) throws InvalidValueException {
        if (salary > 0) {
            this.salary = salary;
        } else {
            InvalidValueException invalidValueException = new InvalidValueException();
            throw invalidValueException;
        }
    }

    @Override
    public void inputData() {
        try {
            System.out.println("Enter name ");
            this.setName(new Scanner(System.in).nextLine());
            System.out.println("Enter gender");

            int gender = new Scanner(System.in).nextInt();
            switch (gender) {
                case 1:
                    this.setGender(Gender.MALE);
                    break;
                case 0:
                    this.setGender(Gender.FEMALE);
                    break;
                case -1:
                    this.setGender(Gender.OTHER);
            }
            System.out.println("Enter salary");
            this.setSalary(new Scanner(System.in).nextFloat());
        } catch (InvalidValueException ex) {
            ex.getMessage();
        }
    }

    @Override
    public void showData() {
        System.out.println("id :" + this.getId() + "name :" + this.getName() + "gender :" + this.getGender().getName());

    }
}

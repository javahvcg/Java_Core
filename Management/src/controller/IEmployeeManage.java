/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Employee;
import exception.InvalidValueException;
import java.util.ArrayList;

/**
 *
 * @author anhquan17
 */
public interface IEmployeeManage {

    public static final int OFFICER = 1;
    public static final int WORKER = 2;
    public static final int MANAGER = 3;

    Employee createEmployee(int indexEmployee);

    ArrayList<Employee> ListEmployee() throws InvalidValueException;

    public void displayEmployee(ArrayList<Employee> listEmployee);

    ArrayList<Employee> searchBySalaryAndGender(int genderCode, ArrayList<Employee> listEmployee);

    ArrayList<Employee> searchBySalaryAndIndexEmployee(int indexEmployee, ArrayList<Employee> listEmployee);
}

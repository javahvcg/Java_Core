/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Employee;
import entities.Manager;
import entities.Officer;
import entities.Worker;
import exception.InvalidValueException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author anhquan17
 */
public class EmployeeManage implements IEmployeeManage {

    @Override
    public Employee createEmployee(int indexEmployee) {
        switch (indexEmployee) {
            case 1:
                return new Officer();
            case 2:
                return new Worker();
            case 3:
                return new Manager();

        }
        return null;
    }

    @Override
    public void displayEmployee(ArrayList<Employee> listEmployee) {
        if (!listEmployee.isEmpty()) {
            for (int i = 0; i < listEmployee.size(); i++) {
                if (listEmployee.get(i) != null) {
                    System.out.println("Nhan vien thu " + i);
                    listEmployee.get(i).showData();
                }
            }
        }

    }

    @Override
    public ArrayList<Employee> searchBySalaryAndGender(int genderCode, ArrayList<Employee> listEmployee) {
        ArrayList<Employee> listEmployeeSalary = new ArrayList<Employee>();
        if (!listEmployee.isEmpty()) {
            float salaryMax = 0;
            for (int i = 0; i < listEmployee.size(); i++) {
                Employee temp = listEmployee.get(i);
                if (temp != null && temp.receiveSalary() > salaryMax && temp.getGender().getCode() == genderCode) {
                    salaryMax = temp.receiveSalary();
                }
            }
            for (int i = 0; i < listEmployee.size(); i++) {
                Employee temp = listEmployee.get(i);
                if (temp != null && temp.receiveSalary() == salaryMax && temp.getGender().getCode() == genderCode) {
                    listEmployeeSalary.add(temp);
                }
            }
        }
        return listEmployeeSalary;
    }

    private int getClassFromObj(Employee employee) {
        if (employee instanceof Manager) {
            return MANAGER;
        }

        if (employee instanceof Officer) {
            return OFFICER;
        }
        return WORKER;
    }

    @Override
    public ArrayList<Employee> searchBySalaryAndIndexEmployee(int indexEmployee, ArrayList<Employee> listEmployee) {
        ArrayList<Employee> listEmployeeSalaryMax = new ArrayList<Employee>();
        if (!listEmployee.isEmpty()) {
            float salaryMax = 0;
            for (int i = 0; i < listEmployee.size(); i++) {
                Employee emp = listEmployee.get(i);
                if (emp != null && emp.receiveSalary() > salaryMax && getClassFromObj(emp) == indexEmployee) {
                    salaryMax = emp.receiveSalary();
                }
            }
            for (int i = 0; i < listEmployee.size(); i++) {
                Employee temp = listEmployee.get(i);
                if (temp != null && temp.receiveSalary() == salaryMax && getClassFromObj(temp) == salaryMax) {
                    listEmployeeSalaryMax.add(temp);
                }
            }
        }
        return listEmployeeSalaryMax;
    }

    @Override
    public ArrayList<Employee> ListEmployee() throws InvalidValueException {
        ArrayList<Employee> listEmployee = new ArrayList<Employee>();
        System.out.println("Nhap vao so luong nhan vien");
        int number = new Scanner(System.in).nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Nhap vao loại nhan vien");
            int indexEmployee = new Scanner(System.in).nextInt();
            Employee emp = createEmployee(indexEmployee);
            emp.inputData();
            listEmployee.add(emp);
        }
        return listEmployee;
    }

}

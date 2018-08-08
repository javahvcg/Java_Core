/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import exception.InvalidValueException;
import exception.QuanException;

/**
 *
 * @author anhquan17
 */

public interface IEmployee {
	void inputData() throws InvalidValueException, QuanException;
	void showData();
	float receiveSalary();

}

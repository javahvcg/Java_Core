/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;
/**
 *
 * @author anhquan17
 */
public class InvalidValueException extends Exception {

	@Override
	public String getMessage() {
		return "Giá trị nhập vào > 0 " +super.getMessage();
	}
	
}

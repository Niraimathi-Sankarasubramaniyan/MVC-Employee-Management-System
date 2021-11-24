/*
 * Copyrights (C) Ideas2IT
 */

package com.ideas2it.employeemanagement.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ideas2it.employeemanagement.model.AddressDTO;
import com.ideas2it.employeemanagement.model.Employee;
import com.ideas2it.employeemanagement.model.EmployeeVO;
import com.ideas2it.employeemanagement.util.Mapper;

/**
 * Performs logical operations and data manupulation.
 * Interacts with Employee POJO, and EmployeeVO and validates user inputs.
 * 
 * @author Niraimathi S
 * @version 1.0
 */
public interface EmployeeService {

    /**
     * Validates the given input from the user. 
     *
     * @param input- the input to be validated.
     * @param patternToValidate-the pattern used to validate th input.
     */
    public boolean validateInput(String input, String patternToValidate);

    /**
     * Creates a new employee. 
     *
     * @param employeeVO-The VO object to store the created employee.
     */
    public EmployeeVO createEmployee(EmployeeVO employeeVO);

    /**
     * Checks if a employeeId exists or not.
     *
     * @param employeeid-employeeid to check if a record already exist.
     */
    public boolean isEmployeeExist(int employeeId);

    /**
     * Checks if employees is empty.
     *
     */
    public boolean isRecordsEmpty();

    /**
     * Checks if a mobileNumber already exists or not.
     *
     * @param mobileNumber-the number to be checked for duplicate.
     */
    public boolean checkDuplicateMobileNumber(long mobileNumber);

    /**
     * Checks if a email already exists or not.
     *
     * @param email- email to be checked for duplicate.
     */
    public boolean checkDuplicateEmail(String email);

    /**
     * Deletes all employees. 
     *
     */
    public boolean deleteAllEmployee();

    /**
     * Deletes one employee. 
     *
     * @param employeeVO-The VO object of the employee to be deleted.
     */
    public boolean deleteOneEmployee(EmployeeVO employeeVO);

    /**
     * Updates all fields of one employee. 
     *
     * @param employeeVO-The VO object containing updated
     *                   values get from user
     */
    public boolean updateAllFields(EmployeeVO employeeVO);

    /**
     * Displays all employees to the user.
     *
     */
    public List<EmployeeVO> viewAllEmployee();

    /**
     * Gets one employee by Id to the user.
     *
     * @param employeeid-employeeid to view.
     */
    public EmployeeVO getEmployeeById(int employeeId);
}

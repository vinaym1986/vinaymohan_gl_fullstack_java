package com.greatlearning.javasfd.emailapp.service;

import com.greatlearning.javasfd.emailapp.model.Employee;

public interface ICredentialService {

    String generatePassword();

    String generateEmailAddress(String firstName, String lastName, int departmentCode);

    void displayCredentials(Employee employee);

}
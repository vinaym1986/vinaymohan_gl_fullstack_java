package com.greatlearning.javasfd.emailapp;

import com.greatlearning.javasfd.emailapp.service.CredentialServiceImpl;
import com.greatlearning.javasfd.emailapp.service.ICredentialService;

public class CredentialServiceImplTest {


    public static void main(String[] args) {

        testPasswordGeneration();
    }

    static void testPasswordGeneration() {


        testPasswordGeneration01();
    }

    static void testPasswordGeneration01() {


        ICredentialService credentialService
                = new CredentialServiceImpl();
        String password = credentialService.generatePassword();
        System.out.println("Generated Password is -> " + password);
    }
}

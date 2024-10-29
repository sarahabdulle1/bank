package org.example.employer;

import org.example.Employer;
import org.example.bank.CurrentAccount;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class EmployerTest {
    Employer newEmployer;

    @BeforeEach
    public void setUp(){
        newEmployer = new Employer("Troy");
    }

    @Test
    public void getEmployerNameTest(){
        Assert.assertEquals(newEmployer.getName(), "Troy");
    }

    @Test
    public void setEmployerNameTest(){
        newEmployer.setName("Xin");
        Assert.assertEquals(newEmployer.getName(), "Xin");
    }

}

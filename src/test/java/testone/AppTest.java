package testone;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureJdbc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import testone.config.TestConfig;
import testone.dao.*;

/**
 * Unit testone for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestConfig.class)
@AutoConfigureJdbc
public class AppTest {
    @Autowired
    AccountRepo repo;

    @Autowired
    AccountRepo2 repo2;

    @Autowired
    AccountRepo3 repo3;

    @Test
    public void test(){
        Account a = repo.getAccount("A00001");

        System.out.println("a.getId() = " + a.getId() + ", a.getAccountNo() = " + a.getAccountNo() + ", a.getBalance() = " + a.getBalance());

        Account a2 = repo.getAccount("A00002");

        System.out.println("a2 = " + a2);
    }

    @Test
    public void test2(){
        Account2 a = repo2.getAccount("A00001");

        System.out.println("a.getId() = " + a.getId() + ", a.getAccountNumber() = " + a.getAccountNumber() + ", a.getBalance() = " + a.getBalance());

        Account2 a2 = repo2.getAccount("A00002");

        System.out.println("a2 = " + a2);
    }

    @Test
    public void test3(){
        Account3 a = repo3.getAccount("A00001");

        System.out.println("a.getId() = " + a.getId() + ", a.getAccountNumber() = " + a.getAccountNumber() + ", a.getBalance() = " + a.getBalance());

        Account3 a2 = repo3.getAccount("A00002");

        System.out.println("a2.getId() = " + a2.getId() + ", a2.getAccountNumber() = " + a2.getAccountNumber() + ", a2.getBalance() = " + a2.getBalance());

        Account3 a3 = repo3.getAccount("A00003");

        System.out.println("a3 = " + a3);
    }
}

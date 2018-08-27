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
import testone.domain.Account;
import testone.domain.Account2;
import testone.domain.Account3;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

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
    public void testJustBalance(){
        System.out.println("repo.getJustBalance(\"A00001\") = " + repo.getJustBalance("A00001").getBalance());
    }

    @Test
    public void testTuple() {
        Tuple3<Long, Date, String> threeValues = repo.getThreeValues();
        System.out.println("threeValues.get_1() = " + threeValues.get_1());
        System.out.println("threeValues.get_2() = " + threeValues.get_2());
        System.out.println("threeValues.get_3() = " + threeValues.get_3());

        Tuple3<Long, Date, String> threeValuesAgain = repo.getThreeValues();
        System.out.println("threeValuesAgain.get_1() = " + threeValuesAgain.get_1());
        System.out.println("threeValuesAgain.get_2() = " + threeValuesAgain.get_2());
        System.out.println("threeValuesAgain.get_3() = " + threeValuesAgain.get_3());

        System.out.println("threeValuesAgain.equals(threeValues) = " + threeValuesAgain.equals(threeValues));
        System.out.println("threeValues.hashCode() = " + threeValues.hashCode());
        System.out.println("threeValuesAgain.hashCode() = " + threeValuesAgain.hashCode());

        Tuple3<Long, Date, String> clone = threeValues.clone();
        System.out.println("clone.get_1() = " + clone.get_1());
        System.out.println("clone.get_2() = " + clone.get_2());
        System.out.println("clone.get_3() = " + clone.get_3());

        System.out.println("clone.equals(threeValues) = " + clone.equals(threeValues));
        System.out.println("clone.hashCode() = " + clone.hashCode());
    }

    @Test
    public void testHashcode() {
        Object[] arr1 = new Object[]{1, new BigDecimal(2), new Date(10000), "3"};
        Object[] arr2 = new Object[]{1, new BigDecimal(2), new Date(10000), "3"};

        System.out.println("arr1 = " + arr1.hashCode());
        System.out.println("arr2 = " + arr2.hashCode());
        System.out.println("eq = " + arr1.equals(arr2));

        System.out.println("arr1 = " + Arrays.asList(arr1).hashCode());
        System.out.println("arr2 = " + Arrays.asList(arr2).hashCode());
        System.out.println("eq = " + Arrays.asList(arr1).equals(Arrays.asList(arr2)));

    }

    @Test
    public void test(){
        Account a = repo.getAccount("A00001");

        System.out.println("a.getId() = " + a.getId() + ", a.getAccountNo() = " + a.getAccountNo() + ", a.getBalance() = " + a.getBalance());

        Account a2 = repo.getAccount("A00003");

        System.out.println("a2 = " + a2);
    }

    @Test
    public void test2(){
        Account2 a = repo2.getAccount("A00001");

        System.out.println("a.getId() = " + a.getId() + ", a.getAccountNumber() = " + a.getAccountNumber() + ", a.getBalance() = " + a.getBalance());

        Account2 a2 = repo2.getAccount("A00003");

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

package structural;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import structural.adapter.*;

import java.util.ArrayList;
import java.util.List;

class AdapterTest {

    private List<Employee> employeeList;

    @BeforeEach
    void setup() {
        employeeList = new ArrayList<>();

        DBEmployee dbEmployee = new DBEmployee();
        dbEmployee.setId(1);
        dbEmployee.setFirstName("Steve");
        dbEmployee.setLastName("Rogers");
        employeeList.add(dbEmployee);
    }

    @Test
    void testLDAPAdapter() {
        LDAPEmployee ldapEmployee = new LDAPEmployee();
        ldapEmployee.setUid("2");
        ldapEmployee.setGivenName("Tony");
        ldapEmployee.setSn("Stark");
        employeeList.add(new LDAPEmployeeAdapter(ldapEmployee));

        Assertions.assertEquals(2, employeeList.size());
        Assertions.assertEquals(2, employeeList.get(1).getId());
        Assertions.assertEquals("Tony", employeeList.get(1).getFirstName());
        Assertions.assertEquals("Stark", employeeList.get(1).getLastName());
    }

    @Test
    void testCSVAdapter() {
        CSVEmployee csvEmployee = new CSVEmployee();
        csvEmployee.setIdFirstnameLastname("3,Bruce,Banner");
        employeeList.add(new CSVEmployeeAdapter(csvEmployee));

        Assertions.assertEquals(2, employeeList.size());
        Assertions.assertEquals(3, employeeList.get(1).getId());
        Assertions.assertEquals("Bruce", employeeList.get(1).getFirstName());
        Assertions.assertEquals("Banner", employeeList.get(1).getLastName());
    }

    @Test
    void testMultipleAdapters() {
        LDAPEmployee ldapEmployee = new LDAPEmployee();
        ldapEmployee.setUid("4");
        ldapEmployee.setGivenName("Natasha");
        ldapEmployee.setSn("Romanoff");
        employeeList.add(new LDAPEmployeeAdapter(ldapEmployee));

        CSVEmployee csvEmployee = new CSVEmployee();
        csvEmployee.setIdFirstnameLastname("5,Thor,Odinson");
        employeeList.add(new CSVEmployeeAdapter(csvEmployee));

        Assertions.assertEquals(3, employeeList.size());

        Assertions.assertEquals(4, employeeList.get(1).getId());
        Assertions.assertEquals("Natasha", employeeList.get(1).getFirstName());
        Assertions.assertEquals("Romanoff", employeeList.get(1).getLastName());

        Assertions.assertEquals(5, employeeList.get(2).getId());
        Assertions.assertEquals("Thor", employeeList.get(2).getFirstName());
        Assertions.assertEquals("Odinson", employeeList.get(2).getLastName());
    }

}

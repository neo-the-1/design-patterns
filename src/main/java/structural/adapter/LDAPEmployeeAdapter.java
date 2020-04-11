package structural.adapter;

public class LDAPEmployeeAdapter implements Employee {

    private LDAPEmployee ldapEmployee;

    public LDAPEmployeeAdapter(LDAPEmployee ldapEmployee) {
        this.ldapEmployee = ldapEmployee;
    }

    @Override
    public Integer getId() {
        return Integer.valueOf(ldapEmployee.getUid());
    }

    @Override
    public String getFirstName() {
        return ldapEmployee.getGivenName();
    }

    @Override
    public String getLastName() {
        return ldapEmployee.getSn();
    }
}

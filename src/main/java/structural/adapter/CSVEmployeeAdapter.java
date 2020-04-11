package structural.adapter;

public class CSVEmployeeAdapter implements Employee {

    private CSVEmployee csvEmployee;

    public CSVEmployeeAdapter(CSVEmployee csvEmployee) {
        this.csvEmployee = csvEmployee;
    }

    @Override
    public Integer getId() {
        return Integer.valueOf(csvEmployee.getIdFirstnameLastname().split(",")[0].trim());
    }

    @Override
    public String getFirstName() {
        return csvEmployee.getIdFirstnameLastname().split(",")[1].trim();
    }

    @Override
    public String getLastName() {
        return csvEmployee.getIdFirstnameLastname().split(",")[2].trim();
    }

}

package OnThi;

import java.util.*;

public class Company extends ActionCompany {

    List<Employee> employees = new ArrayList<>();

    @Override
    public void Add() {
        Employee employee = new Employee();
        employee.Import();
        employees.add(employee);
    }

    @Override
    public void Delete(int idToRemove) {
        for (int i = 0; i < employees.size(); i++) {
            if(idToRemove == employees.get(i).getId()) {
                employees.remove(employees.get(i));
            }
        }
    }

    @Override
    public void SortID() {
        employees.sort(new SortByID());
    }

    @Override
    public void SortPosition() {
        employees.sort(new SortByPostion());
    }


    public static class SortByID implements Comparator<Employee> {
        @Override
        public int compare(Employee employee1, Employee employee2) {
            return employee1.getId() - employee2.getId();
        }
    }

    public static class SortByPostion implements Comparator<Employee> {
        @Override
        public int compare(Employee employee1, Employee employee2) {
            return employee1.getPosition().compareTo(employee2.getPosition());
        }
    }
}

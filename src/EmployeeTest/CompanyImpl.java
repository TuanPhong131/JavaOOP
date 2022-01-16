package OnThi.src.EmployeeTest;

import java.util.ArrayList;
import java.util.*;

public class CompanyImpl implements Company {

    List<Employee> list = new ArrayList<>();

    @Override
    public void Add() {
        Employee employee = new Employee();
        employee.Import();
        list.add(employee);
    }

    @Override
    public void Delete(int idToDelete) {
        for (int i = 0; i < list.size(); i++) {
            if (idToDelete == list.get(i).getId()) {
                list.remove(list.get(i));
            }
        }
    }

    @Override
    public void SortByID() {
        list.sort(new SortId());
    }

    @Override
    public void SortByPosition() {
        list.sort(new SortPosition());
    }

    public static class SortId implements Comparator<Employee> {
        @Override
        public int compare(Employee s1, Employee s2) {
            return s1.getId() - s2.getId();
        }
    }

    public static class SortPosition implements Comparator<Employee>{
        @Override
        public int compare(Employee s1, Employee s2){
            return s1.getPosition().compareTo(s2.getPosition());
        }
    }
}

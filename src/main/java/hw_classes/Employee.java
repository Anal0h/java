package hw_classes;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {

  private String name;
  private String surname;
  private String city;
  private int age;
  private int salary;

  public Employee(String name, String surname, String city, int age, int salary) {
    this.name = name;
    this.surname = surname;
    this.city = city;
    this.age = age;
    this.salary = salary;
  }

  public Employee(String name, int age) {
    this(name, "", "", age, 0);
  }


  public static final Comparator<Employee> AGE_SALARY_COMPARATOR = new AgeSalaryComparator();
  public static final Comparator<Employee> PASSPORT_COMPARATOR = new PassportComparator();
  public static final Comparator<Employee> FULL_COMPARATOR = new fullComparator();

  @Override
  public int compareTo(Employee o) {
    if (!this.name.isEmpty() && o.name.isEmpty()) {
      return 1;
    }
    if (this.name.isEmpty() && !o.name.isEmpty()) {
      return -1;
    }
    if (this.name.compareToIgnoreCase(o.name) != 0) {
      return (this.name.compareToIgnoreCase(o.name));
    }
    return (Integer.compare(this.age, o.age));
  }

  private static class AgeSalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
      if (o1.age != o2.age) {
        return (Integer.compare(o1.age, o2.age));
      }
      return (Integer.compare(o1.salary, o2.salary));
    }
  }

  private static class PassportComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
      if (!o1.name.isEmpty() && o2.name.isEmpty()) {
        return 1;
      }
      if (o1.name.isEmpty() && !o2.name.isEmpty()) {
        return -1;
      }
      if (o1.name.compareTo(o2.name) != 0) {
        return -(o1.name.compareTo(o2.name));
      }
      if (!o1.surname.isEmpty() && o2.surname.isEmpty()) {
        return 1;
      }
      if (o1.surname.isEmpty() && !o2.surname.isEmpty()) {
        return -1;
      }
      if (o1.surname.compareTo(o2.surname) != 0) {
        return -(o1.surname.compareTo(o2.surname));
      }
      if (!o1.city.isEmpty() && o2.city.isEmpty()) {
        return 1;
      }
      if (o1.city.isEmpty() && !o2.city.isEmpty()) {
        return -1;
      }
      return -(o1.city.compareTo(o2.city));
    }
  }

  private static class fullComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
      if (!o1.name.isEmpty() && o2.name.isEmpty()) {
        return 1;
      }
      if (o1.name.isEmpty() && !o2.name.isEmpty()) {
        return -1;
      }
      if (o1.name.compareTo(o2.name) != 0) {
        return -(o1.name.compareTo(o2.name));
      }
      if (!o1.surname.isEmpty() && o2.surname.isEmpty()) {
        return 1;
      }
      if (o1.surname.isEmpty() && !o2.surname.isEmpty()) {
        return -1;
      }
      if (o1.surname.compareTo(o2.surname) != 0) {
        return -(o1.surname.compareTo(o2.surname));
      }
      if (!o1.city.isEmpty() && o2.city.isEmpty()) {
        return 1;
      }
      if (o1.city.isEmpty() && !o2.city.isEmpty()) {
        return -1;
      }
      if (o1.city.compareTo(o2.city) != 0) {
        return -(o1.city.compareTo(o2.city));
      }
      if (o1.age != o2.age) {
        return Integer.compare(o1.age, o2.age);
      }
      return Integer.compare(o1.salary, o2.salary);
    }
  }
}

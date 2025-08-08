package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {
    public static void main(String[] args) {

        Employee employee = new Employee();



    /*
        employee.setEmpNo(100);
        employee.setEmpName("홍길동");
        employee.setDept("영업부");
        employee.setJob("과장");
        employee.setAge(25);
        employee.setGender('남');
        employee.setSalary(2500000);
        employee.setBonusPoint(0.05);
        employee.setPhone("010-1234-5678");
        employee.setAddress("서울시 강남구");

        System.out.println("empNo : " + employee.getEmpNo() + " empName : " + employee.getEmpName() + " dept : " + employee.getDept()
                          + " job : " + employee.getJob() + " age : " + employee.getAge() + " salary : " + employee.getSalary()
        + " bonusPoint : " + employee.getBonusPoint() + " phone : " + employee.getPhone() + " address : " + employee.getAddress()); */


        int empNo = 100;
        String empName = "홍길동";
        String dept = "영업부";
        String job = "과장";
        int age = 25;
        char gender = '남';
        int salary = 2500000;
        double bonusPoint = 0.05;
        String phone = "010-1234-5678";
        String address = "서울시 강남구";

        employee.setEmpNo(empNo);
        employee.setEmpName(empName);
        employee.setDept(dept);
        employee.setJob(job);
        employee.setAge(age);
        employee.setGender(gender);
        employee.setSalary(salary);
        employee.setBonusPoint(bonusPoint);
        employee.setPhone(phone);
        employee.setAddress(address);

        System.out.println("empNo : " + employee.getEmpNo() + " empName : " + employee.getEmpName() + " dept : " + employee.getDept()
                + " job : " + employee.getJob() + " age : " + employee.getAge() + " salary : " + employee.getSalary() +"\n" +
                "bonusPoint : " + employee.getBonusPoint() + " phone : " + employee.getPhone() + " address : " + employee.getAddress());



    }
}

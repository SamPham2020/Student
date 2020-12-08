/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Hong Hien Pham
 */
public class Test {
    public static void main(String[] args) {
            Student stu1 = new Student("Yi", 35, "male", 
                    new Address("123","35", "Main Street", "Montreal", "QC", "A1A A1A" ));
            System.out.println(stu1);

            stu1.setAddress(new Address("223","35", "Main Street", "Montreal", "QC", "A1A A1A" ));          
            //student object | 
            stu1.getAddress().setAptNum("223");
            stu1.getAddress().setZipcode("b2b 2b2");
            System.out.println(stu1);

            stu1.getAddress().setCity("Toronto");
            stu1.getAddress().setProvince("ON");
            stu1.checkDistance();

                   
            System.out.println(Student.isNameValid("hello")); //        
    }
  
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ENKAPSULASI;

/**
 *
 * @author Arya
 */
public class Usuer_Enkap {

    public static void main(String[] args) {
        User dian = new User("M", "GT", 123, true);

        dian.setUsername("M");
        dian.setPassword("GT");
        dian.setid(123);
        dian.setstatus(false);

        System.out.println("Username: " + dian.getUsername());
        System.out.println("Password: " + dian.getPassword());
        System.out.println("id: " + dian.getid());
        System.out.println("status: " + dian.getstatus());
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package1.test;

/**
 *
 * @author DELL
 */

import package1.client.FindPerson;
import package1.client.FindPersonService;

public class PersonTest {
    
    public static void main(String[] args){
        FindPersonService fpService = new FindPersonService();
        FindPerson findPerson = fpService.getFindPersonPort();
        Person p = findPerson.getPerson("teja");
        System.out.println(p.getCity());
        System.out.println(p.getPname());
    }
}

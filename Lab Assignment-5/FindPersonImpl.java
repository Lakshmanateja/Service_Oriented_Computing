/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package1;

/**
 *
 * @author DELL
 */
import javax.jws.WebService;

@WebService(endpointInterface="package1.FindPerson")

public class FindPersonImpl {
    
    public Person getPerson(String name)
    {
        Person p = new Person();
        p.setPname("teja");
        p.setCity("city");
        return p;
    }
}

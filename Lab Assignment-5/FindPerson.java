/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package1;

/**
 *
 * @author DELL
 */
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface FindPerson {
    
    @WebMethod
    public Person getPerson(String name);
}

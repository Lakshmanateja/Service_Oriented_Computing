/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package1;

/**
 *
 * @author DELL
 */

import javax.xml.ws.Endpoint;

public class PublishWS {
    
    public static void main(String[] args)
    {
        Endpoint endPoint = Endpoint.publish("http://localhost:7777/person",
                new FindPersonImpl());
        System.out.println(endPoint.isPublished());
    }
    
}

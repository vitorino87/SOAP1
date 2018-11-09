/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soap;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author tiago.lucas
 */

@WebService(serviceName = "SOAP1")//,targetNamespace = "172.17.189.110")
public class SOAP1 {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Operaç?o de Web service
     */
    @WebMethod(operationName = "outroHello")
    public String outroHello(@WebParam(name = "valor1") String valor1) {
        //TODO write your implementation code here:
        return "Esse é o outro hello! Beleza, "+valor1+"?";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author 8402-01
 */
@WebService(serviceName = "NumberCalculator")
public class NumberCalculator {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addNumber")
    public double addNumber(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        //TODO write your implementation code here:
        double addNumber = a + b;
        return (a + b);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "divideNumber")
    public double divideNumber(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        //TODO write your implementation code here:
        double divideNumber = a - b;
        return (a - b);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "multiplyNumber")
    public double multiplyNumber(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        //TODO write your implementation code here:
        double multiplyNumber = a * b;
        return (a * b);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "subtractNumber")
    public double subtractNumber(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        //TODO write your implementation code here:
        double subtractNumber = a / b;
        return (a / b);
    }
}

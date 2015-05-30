package org.ban.endpoint;


import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

@Stateless(name = "CreditCheckEndpointBean")
@WebService(serviceName = "CreditService", targetNamespace = "http://www.localhost:8080.com/ejb/credit")
public class CreditCheckEndpointBean
{
  public CreditCheckEndpointBean() {
  }

  @WebMethod(operationName = "CreditCheck")
  public

  boolean validateCC(String cc) {
    return true;
  }
}

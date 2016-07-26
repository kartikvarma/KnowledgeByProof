package org.kartik.kbp.demo.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Service;
import javax.xml.ws.ServiceMode;

/**
 * Created by kartikbvarma on 5/24/16.
 */

@WebService(name = "DemoService",
        targetNamespace = "http://ws.kartik.kbp/schema/Interface")
@ServiceMode(Service.Mode.PAYLOAD)
@SOAPBinding(style= SOAPBinding.Style.DOCUMENT,use = SOAPBinding.Use.LITERAL,parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public interface IDemoService {

    @WebMethod(operationName = "caloriesPerDay",exclude = false)
    @WebResult(name = "result")
    public long caloriesPerDay(@WebParam(name="weight") double weight)  throws Exception ;
}

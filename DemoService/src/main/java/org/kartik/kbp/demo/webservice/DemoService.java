package org.kartik.kbp.demo.webservice;

import javax.jws.WebService;

/**
 * Created by kartikbvarma on 5/25/16.
 */
@WebService(portName = "DemoServicePort",
        serviceName = "DemoService",
        endpointInterface = "org.kartik.kbp.demo.webservice.IDemoService",
        targetNamespace = "http://ws.kartik.kbp/schema/Interface")
public class DemoService implements IDemoService {


    public long caloriesPerDay(double weight) throws Exception {
        long bodyFatPercentage = 0L;
        if(weight == 0){
            throw new Exception("Not a valid weight");
        }
        double restingMetabolismRate = weight*10;
        double dailyActivityBurn = restingMetabolismRate * 0.2;
        double energyAmount = restingMetabolismRate + dailyActivityBurn + 60;
        bodyFatPercentage = (long) energyAmount;
        return bodyFatPercentage;
    }
}

package org.kartik.kbp.demo.webservice;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.*;

/**
 * Created by kartikbvarma on 6/9/16.
 */
public class DemoRestService extends Application implements IDemoRestService {


    public Response caloriesPerDay(@Context HttpHeaders header, @PathParam("weight") double weight) throws Exception {
        Long bodyFatPercentage = 0L;
        if(weight == 0){
            throw new Exception("Not a valid weight");
        }
        double restingMetabolismRate = weight*10;
        double dailyActivityBurn = restingMetabolismRate * 0.2;
        double energyAmount = restingMetabolismRate + dailyActivityBurn + 60;
        bodyFatPercentage = (long) energyAmount;
        return Response.status(200).entity(bodyFatPercentage).build();
    }
}

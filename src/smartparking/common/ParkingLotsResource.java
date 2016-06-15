package smartparking.common;

import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.Put;

/**
 * Created by chenhuanhuan on 16-5-23.
 */
public interface ParkingLotsResource {
    @Get
    Representation getParkingLots();

    @Put
    String updateParkingLot(Representation rep);

    @Post
    String addParkingLot(Representation rep);

}

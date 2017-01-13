package com.im.services;

import com.im.services.hotel.HotelService;
import com.im.services.hotel.SearchHotelsException;
import com.im.services.hotel.types.Hotel;
import com.im.services.hotel.types.SearchHotelsRequest;
import com.im.services.hotel.types.SearchHotelsResponse;
import com.im.services.hotel.types.SearchHotelsResult;

import javax.jws.WebService;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;
import java.util.concurrent.Future;
import java.util.logging.Logger;

@WebService(
        serviceName = "HotelService_Service",
        portName = "HotelService",
        targetNamespace = "http://im.com/services/hotel",
        wsdlLocation = "wsdl/Hotel.wsdl",
        endpointInterface = "com.im.services.hotel.HotelService")
public class HotelServiceImpl implements HotelService {

    private static final Logger LOG = Logger.getLogger(HotelServiceImpl.class.getName());

    @Override
    public Response<SearchHotelsResponse> searchHotelsAsync(SearchHotelsRequest parameters) {
        return null;
    }

    @Override
    public Future<?> searchHotelsAsync(SearchHotelsRequest parameters, AsyncHandler<SearchHotelsResponse> asyncHandler) {
        return null;
    }

    public SearchHotelsResponse searchHotels(SearchHotelsRequest searchHotelsRequest) throws SearchHotelsException   {
        LOG.info("Executing operation searchHotels");
        System.out.println(searchHotelsRequest);
        try {
            SearchHotelsResult result = new SearchHotelsResult();
            Hotel hotel = new Hotel();
            hotel.setName("Test hotel");
            result.getHotels().add(hotel);
            SearchHotelsResponse response = new SearchHotelsResponse();
            response.setSearchHotelsResult(result);
            return response;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new SearchHotelsException("SearchHotelsException...");
    }

}

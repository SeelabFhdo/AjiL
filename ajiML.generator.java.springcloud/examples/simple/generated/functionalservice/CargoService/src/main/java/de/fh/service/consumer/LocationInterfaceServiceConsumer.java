package de.fh.service.consumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient("LocationService")
public interface LocationInterfaceServiceConsumer {
    @RequestMapping(value = "/resources/locationinterface/readlocation/{Id}")
    String readLocation(@PathVariable("Id") String Id);

    @RequestMapping(value = "/resources/locationinterface/readmoon/{Id}")
    String readMoon(@PathVariable("Id") String Id);

	@PutMapping(value = "/resources/locationinterface/createlocation")
    String createLocation(
  		@RequestParam("street") String street,
  		@RequestParam("locationId") int locationId,
  		@RequestParam("status") boolean status,
  		@RequestParam("streetChar") String streetChar,
  		@RequestParam("price") float price,
        @RequestParam("Id") String Id);

	@PutMapping(value = "/resources/locationinterface/createmoon")
    String createMoon(
  		@RequestParam("moonName") String moonName,
        @RequestParam("Id") String Id);

	@PostMapping(value = "/resources/locationinterface/updatelocation")
    String updateLocation(
  		@RequestParam("street") String street,
  		@RequestParam("locationId") int locationId,
  		@RequestParam("status") boolean status,
  		@RequestParam("streetChar") String streetChar,
  		@RequestParam("price") float price,
        @RequestParam("Id") String Id);

    @RequestMapping(value = "/resources/locationinterface/deletelocation/{Id}")
    String deleteLocation(@PathVariable("Id") String Id);

}

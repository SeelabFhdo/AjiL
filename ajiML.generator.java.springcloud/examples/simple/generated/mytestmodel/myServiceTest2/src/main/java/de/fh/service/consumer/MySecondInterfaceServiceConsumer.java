package de.fh.service.consumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient("myServiceTest3")
public interface MySecondInterfaceServiceConsumer {
    @RequestMapping(value = "/resources/mysecondinterface/readability/{Id}")
    String readAbility(@PathVariable("Id") String Id);

	@PutMapping(value = "/resources/mysecondinterface/createability")
    String createAbility(
        @RequestParam("Id") String Id);

}

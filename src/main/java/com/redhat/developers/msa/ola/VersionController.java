package com.redhat.developers.msa.ola;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class VersionController {
	
	
	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET, value = "/version", produces = "text/plain")
	@ApiOperation("Returns version")
	public String version() {
		
		return "V2. implementation version:   2018.12.08 v1";
		
	}
	


	
	

	

}

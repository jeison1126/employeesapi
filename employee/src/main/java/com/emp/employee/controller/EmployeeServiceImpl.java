package com.emp.employee.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;
import com.emp.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	
	@Autowired
	   RestTemplate restTemplate;
	
	
	@Override
	public String getEmployee() {
		//1. rest template object
		String uri="https://dummy.restapiexample.com/api/v1/employees";
        RestTemplate restTemplate = new RestTemplate();
        String employee = restTemplate.getForObject(uri, String.class);
        return new String(employee);
        //2. rest template exchange
	    /*HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity <String> entity = new HttpEntity<String>(headers);
	    return restTemplate.exchange("https://dummy.restapiexample.com/public/api/v1/employee", HttpMethod.GET, entity, String.class).getBody();*/
    }


	@Override
	public String employeePorId(@PathVariable("idEmployee")Integer idEmployee) {
		//1. rest template object
		String uri="https://dummy.restapiexample.com/api/v1/employee/"+idEmployee;
        RestTemplate restTemplate = new RestTemplate();
        String employee = restTemplate.getForObject(uri, String.class);
        return new String(employee);
        //2. rest template exchange
        /*
		HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity <String> entity = new HttpEntity<String>(headers);
	    return restTemplate.exchange("https://dummy.restapiexample.com/public/api/v1/employee/"+idEmployee, HttpMethod.GET, entity, String.class).getBody();
	  */
	}

}

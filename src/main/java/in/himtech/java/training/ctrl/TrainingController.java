package in.himtech.java.training.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.himtech.java.training.service.TrainingService;

@RestController
@RequestMapping("/training")
public class TrainingController {
	
	@Autowired
	private TrainingService service;
	
	@GetMapping
	public String getTestInfo() {
		return "Hello from Training Project";
	}
	
	

}

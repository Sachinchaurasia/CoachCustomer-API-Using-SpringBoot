package com.example;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/coach")
public class CoachController {
	
	private final CoachService coachservice;
	
	public CoachController(CoachService coachservice) {
		this.coachservice=coachservice;
		
	}
	
	@PostMapping
	public ResponseEntity<Coach> createCoach(@RequestBody Coach coach){
		Coach created=coachservice.createcoach(coach);
		return ResponseEntity.status(HttpStatus.CREATED).body(created);
	}

	@GetMapping
	public ResponseEntity<List<Coach>> getAllCoaches(){
		return ResponseEntity.ok(coachservice.getAllCoaches());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Coach> getCoachById(@PathVariable Long id){
		return coachservice.getCoachById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}
}

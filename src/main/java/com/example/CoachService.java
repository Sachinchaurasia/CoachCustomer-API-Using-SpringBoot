package com.example;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class CoachService {

	private CoachRepository coachRepository;

	public CoachService(CoachRepository coachRepository) {
		super();
		this.coachRepository = coachRepository;
	}
	
	public Coach createcoach(Coach coach) {
		return coachRepository.save(coach);
		
	}
	
	public List<Coach> getAllCoaches(){
		return coachRepository.findAll();
	}
	
	public Optional<Coach> getCoachById(Long id){
		return coachRepository.findById(id);
	}
}

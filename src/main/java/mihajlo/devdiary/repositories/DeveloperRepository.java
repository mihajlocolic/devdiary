package mihajlo.devdiary.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import mihajlo.devdiary.models.Developer;

public interface DeveloperRepository extends JpaRepository<Developer, Long> {
    
}

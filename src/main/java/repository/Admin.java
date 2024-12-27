package repository;

import Service.AdminService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Admin extends JpaRepository<AdminService , Long> {


}

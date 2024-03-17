package kodlamaio.hrms.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="job_positions")
@Data
public class JobPosition {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="position_name")
	private String positionName;
}

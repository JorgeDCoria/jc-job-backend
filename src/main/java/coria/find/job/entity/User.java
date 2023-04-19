package coria.find.job.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "users")
@Getter @Setter @ToString
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "user_id")
  private Long id;
  private String name;

  private String password;

  private String email;
  private String image;
  @OneToMany(mappedBy = "user")
  private List<Postulation> postulations;

}

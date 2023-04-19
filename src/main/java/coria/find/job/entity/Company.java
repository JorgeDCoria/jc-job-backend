package coria.find.job.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table
@Getter @Setter @ToString
public class Company {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "companySeq")
  @Column(name = "company_id")
  private Long id;
  @NotNull
  private String name;
  private String location;
  private String description;
  private Integer age;
  private String resume;
  private Integer employes;

}

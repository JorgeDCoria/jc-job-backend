package coria.find.job.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;


@Entity
@Table
@Getter @Setter @ToString
public class Postulation {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "postulation_id")
  private Long id;
  @NotNull
  private String title;
  @NotNull
  private LocalDate date;
  @NotNull
  private String description;
  private String location;
  private Float salary;
  private String note;
  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;
}

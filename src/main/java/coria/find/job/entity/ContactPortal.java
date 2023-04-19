package coria.find.job.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Setter @Getter @ToString
public class ContactPortal extends Contact{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;

  public ContactPortal (String url, String name){
    super(url);
    this.name = name;

  }
}

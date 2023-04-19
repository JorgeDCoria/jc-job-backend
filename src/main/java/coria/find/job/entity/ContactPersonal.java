package coria.find.job.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ContactPersonal extends Contact{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long Id;
  private Boolean spontaneous;

  public ContactPersonal(String url, Boolean spontaneous){
    super(url);
    this.spontaneous=spontaneous;

  }
}

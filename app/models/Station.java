package models;

import play.db.jpa.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Station extends Model
{
  public String name;
  public String weatherFromCode;
  public double tempC;
  public double tempF;
  public int windBft;
  public int pressureHPA;

  @OneToMany(cascade = CascadeType.ALL)
  public List<Reading> readings = new ArrayList<Reading>();

  public Station(String name) {
    this.name = name;
  }
}
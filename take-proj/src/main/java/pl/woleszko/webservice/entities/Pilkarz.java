package pl.woleszko.webservice.entities;

import java.lang.annotation.Annotation;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "PILKARZ")
@XmlRootElement(name = "pilkarz")
public class Pilkarz implements Entity{
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "pilkarz_id")
	private Long pilkarzId;
	
	@Column
	@ManyToOne(fetch = FetchType.LAZY)
		
	private Druzyna druzynaId;
	@Column(name = "imie")
	private String imie;
	@Column(name = "nazwisko")
	private String nazwisko;
	@Column(name = "wzrost")
	private Integer wzrost;
	@Column(name = "data_urodzenia")
	private Date dataUrodzenia;
	
	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//Getters & Setters
	@XmlElement
	public Long getPilkarzId() {
		return pilkarzId;
	}
	public void setPilkarzId(Long pilkarzId) {
		this.pilkarzId = pilkarzId;
	}
	@XmlElement
	public Druzyna getDruzynaId() {
		return druzynaId;
	}
	public void setDruzynaId(Druzyna druzynaId) {
		this.druzynaId = druzynaId;
	}
	@XmlElement
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	@XmlElement
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	@XmlElement
	public Integer getWzrost() {
		return wzrost;
	}
	public void setWzrost(Integer wzrost) {
		this.wzrost = wzrost;
	}
	@XmlElement
	public Date getDataUrodzenia() {
		return dataUrodzenia;
	}
	public void setDataUrodzenia(Date dataUrodzenia) {
		this.dataUrodzenia = dataUrodzenia;
	}
}

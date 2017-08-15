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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "DRUZYNA")
@XmlRootElement(name = "druzyna")
public class Druzyna implements Entity{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "druzyna_id")
	private Long druzynaId;
	
	
	@Column
	@OneToOne(fetch = FetchType.LAZY)
	private Stadion stadionId;
	
	@Column(name = "nazwa")
	private String nazwa;
	@Column(name = "trener")
	private String trener;
	
// Getters & Setters
	@XmlElement
	public Long getDruzynaId() {
		return druzynaId;
	}
	public void setDruzynaId(Long druzynaId) {
		this.druzynaId = druzynaId;
	}
	@XmlElement
	public Stadion getStadionId() {
		return stadionId;
	}
	public void setStadionId(Stadion stadionId) {
		this.stadionId = stadionId;
	}
	@XmlElement
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	@XmlElement
	public String getTrener() {
		return trener;
	}
	public void setTrener(String trener) {
		this.trener = trener;
	}
	
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
}

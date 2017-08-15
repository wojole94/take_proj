package pl.woleszko.webservice.entities;

import java.lang.annotation.Annotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "STADION")
@XmlRootElement(name = "stadion")
public class Stadion implements Entity {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "stadion_id")
	private Long stadionId;
	
	@Column(name = "nazwa")
	private String nazwa;
	@Column(name = "miasto")
	private String miasto;
	@Column(name = "rozmiar")
	private Integer rozmiar;
	
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
	
	@XmlElement
	public Long getStadionId() {
		return stadionId;
	}

	public void setStadionId(Long stadionId) {
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
	public String getMiasto() {
		return miasto;
	}

	public void setMiasto(String miasto) {
		this.miasto = miasto;
	}
	@XmlElement
	public Integer getRozmiar() {
		return rozmiar;
	}

	public void setRozmiar(Integer rozmiar) {
		this.rozmiar = rozmiar;
	}

}

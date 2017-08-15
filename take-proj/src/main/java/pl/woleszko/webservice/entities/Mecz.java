package pl.woleszko.webservice.entities;

import java.lang.annotation.Annotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "MECZ")
@XmlRootElement(name = "mecz")
public class Mecz implements Entity{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "mecz_id")
	private Long meczId;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Druzyna gospodarz;
	@OneToOne(fetch = FetchType.LAZY)
	private Druzyna gosc;	
	
	//tymczasowo string?
	@Column(name = "wynik")
	private String wynik;
	
	@Column(name = "data")
	private String data;
	
	
	
	
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

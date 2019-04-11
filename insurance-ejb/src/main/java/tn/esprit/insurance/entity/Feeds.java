package tn.esprit.insurance.entity;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
//import java.sql.Date;
import java.util.Date;

import javax.persistence.*;

import javafx.scene.input.DataFormat;

/**
 * Entity implementation class for Entity: Feeds
 *
 */
@Entity

public class Feeds implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "Title")
	private String title;
	
	@Column(name = "Feedback")
	private String feedback;
	
	@Enumerated(EnumType.STRING)
	private FeedsType type;
	
	@Column(name = "Sent_Date")
	private Date dateSent;
	
	@Enumerated(EnumType.STRING)
	private FeedsState state;

	@ManyToOne
	User customer;

	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFeedback() {
		return feedback;
	}


	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public Date getDateSent() {
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
		String s = formatter.format(dateSent);
		 Date date1 = null;
		try {
			date1 = formatter.parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return date1;
	}


	public void setDateSent(Date dateSent) {
		this.dateSent = dateSent;
	}

	public FeedsType getType() {
		return type;
	}


	public void setType(FeedsType type) {
		this.type = type;
	}


	public FeedsState getState() {
		return state;
	}


	public void setState(FeedsState state) {
		this.state = state;
	}

	public Feeds() {
		super();
	}
   
}

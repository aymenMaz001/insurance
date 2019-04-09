package tn.esprit.insurance.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

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
	@Column(name = "Type")
	private FeedsState type;
	
	@Column(name = "Sent_Date")
	private Date dateSent;
	
//	@Column(name = "Solving_Date")
//	private Date DateSolved;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "Status")
	private FeedsState state;


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


	public FeedsState getType() {
		return type;
	}


	public void setType(FeedsState type) {
		this.type = type;
	}


	public Date getDateSent() {
		return dateSent;
	}


	public void setDateSent(Date dateSent) {
		this.dateSent = dateSent;
	}


//	public Date getDateSolved() {
//		return DateSolved;
//	}
//
//
//	public void setDateSolved(Date dateSolved) {
//		DateSolved = dateSolved;
//	}


	public FeedsState getState() {
		return state;
	}


	public void setState(FeedsState state) {
		this.state = state;
	}


	@ManyToOne(cascade = CascadeType.ALL)
	User customer;
	
	
	public Feeds() {
		super();
	}
   
}

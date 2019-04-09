package tn.esprit.insurance.service.implementation;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;
import java.util.Properties;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.util.CoreMap;
import tn.esprit.insurance.entity.Feeds;
import tn.esprit.insurance.service.interfaces.IFeedbacksRemote;

@Stateless
public class Feedbacks implements IFeedbacksRemote {

	@PersistenceContext(unitName = "insurance-ejb")
	EntityManager em;
	
	public int addFeeds(Feeds feed) {
		em.persist(feed);
		return feed.getId();
	}

	@Override
	public void removeFeeds(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateFeeds(Feeds newFeed) {
		// TODO Auto-generated method stub

	}

	@Override
	public Feeds findFeedsById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Feeds> findAllFeeds() {
		// TODO Auto-generated method stub
		List<Feeds> emp = em.createQuery("Select f from Feeds f", Feeds.class).getResultList();
		return emp;
	}
	
	@Override
	public void getFeelings(){
//	    Properties props = new Properties();
//	    props.setProperty("annotators", "tokenize, ssplit, pos, lemma, ner, parse, dcoref");
//	    StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
//
//	    // read some text in the text variable
//	    String text = "\"But I do not want to go among mad people,\" Alice remarked.\n" +
//	            "\"Oh, you can not help that,\" said the Cat: \"we are all mad here. I am mad. You are mad.\"\n" +
//	            "\"How do you know I am mad?\" said Alice.\n" +
//	            "\"You must be,\" said the Cat, \"or you would not have come here.\" This is awful, bad, disgusting";
//
//	    // create an empty Annotation just with the given text
//	    Annotation document = new Annotation(text);
//
//	    // run all Annotators on this text
//	    pipeline.annotate(document);
//
//	    List<CoreMap> sentences = document.get(CoreAnnotations.SentencesAnnotation.class);
//	    for (CoreMap sentence : sentences) {
//	        String sentiment = sentence.get(SentimentCoreAnnotations.SentimentClass.class);
//	        System.out.println(sentiment + "\t" + sentence);
//	    }
	}



}



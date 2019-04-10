package tn.esprit.insurance.service.implementation;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;
import java.util.Properties;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

//import edu.stanford.nlp.ling.CoreAnnotations;
//import edu.stanford.nlp.pipeline.Annotation;
//import edu.stanford.nlp.pipeline.StanfordCoreNLP;
//import edu.stanford.nlp.sentiment.SentimentCoreAnnotations;
//import edu.stanford.nlp.util.CoreMap;
import tn.esprit.insurance.entity.Feeds;
import tn.esprit.insurance.entity.FeedsState;
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
		em.remove(em.find(Feeds.class, id));

	}

	@Override
	public void updateFeeds(Feeds feed) {
		// TODO Auto-generated method stub
		Feeds emp = em.find(Feeds.class, feed.getId());
		FeedsState etat = null;
		emp.setState(etat.solved);
	}

	@Override
	public Feeds findFeedsById(int id) {
		// TODO Auto-generated method stub
		Feeds f = em.find(Feeds.class, id);
		return f;
	}

	@Override
	public List<Feeds> findAllFeeds() {
		// TODO Auto-generated method stub
		List<Feeds> emp = em.createQuery("Select f from Feeds f", Feeds.class).getResultList();
		return emp;
	}
	
	@Override
	public void getFeelings(){
//    	String text = "I am feeling very happy and frustrated.";
//    	Properties props = new Properties();
//    	props.setProperty("annotators", "tokenize, ssplit, pos, lemma, parse, sentiment");
//    	StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
//
//    	Annotation annotation = pipeline.process(text);
//    	List<CoreMap> sentences = annotation.get(CoreAnnotations.SentencesAnnotation.class);
//    	for (CoreMap sentence : sentences) {
//    	  String sentiment = sentence.get(SentimentCoreAnnotations.SentimentClass.class);
//          //dialog.setBody(new Text(sentiment + "\t" + sentence));
//    	  System.out.println(sentiment + "\t" + sentence);
//    	}
		
		
//        Properties pipelineProps = new Properties();
//        Properties tokenizerProps = new Properties();
//        pipelineProps.setProperty("annotators", "parse, sentiment");
//        pipelineProps.setProperty("parse.binaryTrees", "true");
//        pipelineProps.setProperty("enforceRequirements", "false");
//        tokenizerProps.setProperty("annotators", "tokenize ssplit");
//        StanfordCoreNLP tokenizer = new StanfordCoreNLP(tokenizerProps);
//        StanfordCoreNLP pipeline = new StanfordCoreNLP(pipelineProps);
//        String line = "Amazingly grateful beautiful friends are fulfilling an incredibly joyful accomplishment. What an truly terrible idea.";
//        Annotation annotation = tokenizer.process(line);
//        pipeline.annotate(annotation);
//        // normal output
//        for (CoreMap sentence : annotation.get(CoreAnnotations.SentencesAnnotation.class)) {
//            String output = sentence.get(SentimentCoreAnnotations.SentimentClass.class);
//            System.out.println(output);
//        }
	}
	
	@Override
	public List<Feeds> getAllFeedsByName(String ff) {
		String sql = "select f from Feeds f where f.title like '"+ff+"%'";
		List<Feeds> emp = em.createQuery(sql, Feeds.class).getResultList();
		return emp;	
	}
	
	@Override
	public List<Feeds> getAllFeedsByState(String state) {
		String sql = "select f from Feeds f where f.state like '"+state+"%'";
		List<Feeds> emp = em.createQuery(sql, Feeds.class).getResultList();
		return emp;	
	}
}



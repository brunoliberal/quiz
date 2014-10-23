package com.example.triviality;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Vector;

public class QuestionDatabase {

	public static QuestionDatabase instance;
	
	public static QuestionDatabase getInstance() {
		if (instance == null) {
			instance = new QuestionDatabase();
		}
		return instance;
	}
	
	public static void setInstance(QuestionDatabase questionDatabase)
	{
		instance=questionDatabase;
	}

	private List<Question> questions;
	private List<Question> treinodatabase;
	private List<Question> torneiodatabase;

	private Map<String, List<Question>> questionsByCategory;
	
	
	public boolean isInitalized() {
		return this.questions!=null;
	}
	
	public void prepare(List<Question> questions) {
		this.questions=questions;
		//initQuestionsByCategory();
		
	}
	
	public void getQuestionsByCategory() {
		
	}
	
	
	public List<Question> randomizeQuestions(List<Question> questions){
		Collections.shuffle(questions);
		return questions;
	}
	
	public List<Question> getAllQuestions() {
		List<Question> questions = new ArrayList<Question>();
		questions.add(new Question("Questao 1", "Alternativa a", "Alternativa b", "Alternativa c", "Alternativa d", "Alternativa a", "Categoria"));
		questions.add(new Question("Questao 2", "Alternativa a", "Alternativa b", "Alternativa c", "Alternativa d", "Alternativa b", "Categoria"));
		questions.add(new Question("Questao 3", "Alternativa a", "Alternativa b", "Alternativa c", "Alternativa d", "Alternativa c", "Categoria"));
		questions.add(new Question("Questao 4", "Alternativa a", "Alternativa b", "Alternativa c", "Alternativa d", "Alternativa d", "Categoria"));
		questions.add(new Question("Questao 5", "Alternativa a", "Alternativa b", "Alternativa c", "Alternativa d", "Alternativa a", "Categoria"));
		return questions;
	}
	
/*	public void initQuestionsByCategory() {
		questionsByCategory = new HashMap<String, List<Question>>();
		for (Question question : this.questions) {
			List<String> categories = question.getCATEG();
			if (categories!=null){
				for (String category : categories) {
					List<Question> questionByCategoryList = this.questionsByCategory
							.get(category);
					if (questionByCategoryList == null) {
						this.questionsByCategory.put(category,
								new Vector<Question>());
						questionByCategoryList = this.questionsByCategory
								.get(category);
					}
					questionByCategoryList.add(question);
					this.questionsByCategory.put(category, questionByCategoryList);
				}
			}
			
		}
	}
	
	

	
	
	public List<Question> getQuestions() {
		return questions;
	}
	
	
	
	public List<Question> getFilteredQuestions(List<String> categories) {
		
		List<Question> filteredQuestions = new LinkedList<Question>();
		for (Question question:this.questions) {
			boolean match=false;
			for (String category : question.getCategories()) {
				if (categories.contains(category)) {
					match=true;
				}
			}
			if (match) {
				filteredQuestions.add(question);
			}
		}
		
		return filteredQuestions;
	}*/
	

	public List<String> getCategories(){
		 List<String> categories =  new LinkedList<String>();
		 categories.addAll(questionsByCategory.keySet());
		 Collections.sort(categories);
		 return categories;
	}

	
}

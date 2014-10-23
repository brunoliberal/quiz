package com.example.triviality;
import java.util.Collections;
import java.util.List;
import java.util.zip.Inflater;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class QuizActivity extends Activity {

	List<Question> quesList;
	int score=0;
	int qid=0;
	Question currentQ;
	TextView txtQuestion;
	RadioButton rda, rdb, rdc, rdd;
	Button buttonA, buttonB, buttonC, buttonD;
	Button butNext;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quiz);
		//inicializar base
		DbHelper db=new DbHelper(this);
		//gerar questoes
		quesList=db.getAllQuestions();
		//Collections.shuffle(quesList);
		
		//gerar alternativas
		
		currentQ=quesList.get(qid);
		txtQuestion=(TextView)findViewById(R.id.textView1);
		rda=(RadioButton)findViewById(R.id.radio0);
		rdb=(RadioButton)findViewById(R.id.radio1);
		rdc=(RadioButton)findViewById(R.id.radio2);
		rdd=(RadioButton)findViewById(R.id.radio3);
		buttonA=(Button)findViewById(R.id.buttonA);
		buttonB=(Button)findViewById(R.id.buttonB);
		buttonC=(Button)findViewById(R.id.buttonC);
		buttonD=(Button)findViewById(R.id.buttonD);
		butNext=(Button)findViewById(R.id.button1);
		
		setQuestionView();
		butNext.setOnClickListener(new View.OnClickListener() {		
			@Override
			public void onClick(View v) {
				RadioGroup grp=(RadioGroup)findViewById(R.id.radioGroup1);
				RadioButton answer=(RadioButton)findViewById(grp.getCheckedRadioButtonId());
				Log.d("yourans", currentQ.getANSWER()+" "+answer.getText());
				if(currentQ.getANSWER().equals(answer.getText()))
				{
					score++;
					Log.d("score", "Your score"+score);
				}
				if(qid<5){					
					currentQ=quesList.get(qid);
					setQuestionView();
				}else{
					Intent intent = new Intent(QuizActivity.this, ResultActivity.class);
					Bundle b = new Bundle();
					b.putInt("score", score); //Your score
					intent.putExtras(b); //Put your score to your next Intent
					startActivity(intent);
					finish();
				}
			}
		});
		
		
/*        buttonA.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            }
        });
		*/
		
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_quiz, menu);
		return true;
	}
	
	private void setQuestionView()
	{
		txtQuestion.setText(currentQ.getQUESTION());
		rda.setText(currentQ.getOPTA());
		rdb.setText(currentQ.getOPTB());
		rdc.setText(currentQ.getOPTC());
		rdd.setText(currentQ.getOPTD());
		buttonA.setText(currentQ.getOPTA());
		buttonB.setText(currentQ.getOPTB());
		buttonC.setText(currentQ.getOPTC());
		buttonD.setText(currentQ.getOPTD());
		qid++;
	}
	
	public void checkAnswer(View view){
		Button answer = (Button) view;
		
		Log.d("yourans", currentQ.getANSWER()+" "+answer.getText());
		
		if(currentQ.getANSWER().equals(answer.getText()))
			answer.setBackgroundColor(Color.GREEN);
		else
			answer.setBackgroundColor(Color.RED);
	}
	
}

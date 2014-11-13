package br.ufmg.dcc.rs.quizes.activities;

import java.util.Collections;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import br.ufmg.dcc.rs.quizes.model.Profile;
import br.ufmg.dcc.rs.quizes.model.Question;
import br.ufmg.dcc.rs.quizes.persistence.DbHelper;

public class TrainsActivity extends Activity {

	List<Question> trainQuesList;
	int qid=0;
	Question currentQ;
	TextView txtQuestion;
	RadioButton rda, rdb, rdc, rdd;
	Button buttonA, buttonB, buttonC, buttonD;
	Button butNext;
	Profile profile;
	DbHelper db;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_trains);
		//inicializar base
		db=new DbHelper(this);
		//gerar questoes
		trainQuesList=db.getQuestionsByType("Tipo");
		Collections.shuffle(trainQuesList);
		
		currentQ=trainQuesList.get(qid);
		txtQuestion=(TextView)findViewById(R.id.textView1);
		buttonA=(Button)findViewById(R.id.buttonA);
		buttonB=(Button)findViewById(R.id.buttonB);
		buttonC=(Button)findViewById(R.id.buttonC);
		buttonD=(Button)findViewById(R.id.buttonD);
		butNext=(Button)findViewById(R.id.button1);
		
		setQuestionView();
/*		butNext.setOnClickListener(new View.OnClickListener() {		
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
		});*/
		
		
		profile = db.getProfile();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.trains, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	private void setQuestionView()
	{
		txtQuestion.setText(currentQ.getQUESTION());
		buttonA.setText(currentQ.getOPTA());
		buttonB.setText(currentQ.getOPTB());
		buttonC.setText(currentQ.getOPTC());
		buttonD.setText(currentQ.getOPTD());
		
		if(currentQ.getCATEG() == "X"){
			buttonC.setVisibility(1);
			buttonD.setVisibility(1);
			buttonC.setEnabled(false);
			buttonD.setEnabled(false);
		}else{
			buttonC.setVisibility(0);
			buttonD.setVisibility(0);
			buttonC.setEnabled(true);
			buttonD.setEnabled(true);
		}
		qid++;
	}
	
	public void checkAnswer(View view){
		Button answer = (Button) view;
		
		Log.d("yourans", currentQ.getANSWER()+" "+answer.getText());
		if(currentQ.getANSWER().equals(answer.getText()))
			answer.setBackgroundColor(Color.GREEN);
		else
			answer.setBackgroundColor(Color.RED);
		
		db.updateProfile(profile);
	}
	
	public void nextQuestion(View view){
		buttonA.setBackgroundColor(android.R.drawable.btn_default);
		buttonB.setBackgroundColor(android.R.drawable.btn_default);
		buttonC.setBackgroundColor(android.R.style.Holo_Light_ButtonBar);
		buttonD.setBackgroundColor(android.R.style.Holo_Light_ButtonBar);
		if(qid<5){					
			currentQ=trainQuesList.get(qid);
			setQuestionView();
		}else{
			Intent intent = new Intent(TrainsActivity.this, MenuActivity.class);
			startActivity(intent);
		}
	}
}

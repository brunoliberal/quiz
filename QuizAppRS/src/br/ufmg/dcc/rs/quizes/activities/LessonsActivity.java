package br.ufmg.dcc.rs.quizes.activities;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;

public class LessonsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lessons);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.lessons, menu);
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

	public void lessonOne(View view) {

		RelativeLayout layout = (RelativeLayout) findViewById(R.id.lessonact);
		//layout.setBackgroundResource(R.drawable.blackboard320x480);
		
		/*ImageView img = new ImageView(findViewById(R.id.lessonact));
		img.setImageResource(R.drawable.blackboard1066x1600);
		img.setLayoutParams(new RelativeLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
		RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) img.getLayoutParams();
		layoutParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
		layoutParams.addRule(RelativeLayout.CENTER_VERTICAL);
		img.setLayoutParams(layoutParams);*/

		
		ImageView img = new ImageView(findViewById(R.id.lessonact).getContext());
		img.setImageResource(R.drawable.blackboard2);
		RelativeLayout.LayoutParams imgLP;
		img.setLayoutParams(imgLP = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		imgLP.setMargins(15, 0, 0, 0);
		layout.addView(img);
		
		TextView lesson = new TextView(img.getContext());
		lesson.setMaxLines(22);
		lesson.setMovementMethod(new ScrollingMovementMethod());
		lesson.setText("Mussum ipsum cacilds, vidis litro abertis. Consetis adipiscings elitis. Pra lá , depois divoltis porris, paradis. Paisis, filhis, espiritis santis. Mé faiz elementum girarzis, nisi eros vermeio, in elementis mé pra quem é amistosis quis leo. Manduma pindureta quium dia nois paga. Sapien in monti palavris qui num significa nadis i pareci latim. Interessantiss quisso pudia ce receita de bolis, mais bolis eu num gostis.Mussum ipsum cacilds, vidis litro abertis. Consetis adipiscings elitis. Pra lá , depois divoltis porris, paradis. Paisis, filhis, espiritis santis. Mé faiz elementum girarzis, nisi eros vermeio, in elementis mé pra quem é amistosis quis leo. Manduma pindureta quium dia nois paga. Sapien in monti palavris qui num significa nadis i pareci latim. Interessantiss quisso pudia ce receita de bolis, mais bolis eu num gostis.Mussum ipsum cacilds, vidis litro abertis. Consetis adipiscings elitis. Pra lá , depois divoltis porris, paradis. Paisis, filhis, espiritis santis. Mé faiz elementum girarzis, nisi eros vermeio, in elementis mé pra quem é amistosis quis leo. Manduma pindureta quium dia nois paga. Sapien in monti palavris qui num significa nadis i pareci latim. Interessantiss quisso pudia ce receita de bolis, mais bolis eu num gostis.");
		lesson.setTextSize(15);
		lesson.setTextColor(Color.WHITE);
		ScrollView scroller = new ScrollView(this);
		RelativeLayout.LayoutParams scrollerLP;
		scroller.setLayoutParams(scrollerLP = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT));
		//layoutParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
		scrollerLP.setMargins(29, 5, 15, 110);
		//layoutParams.addRule(RelativeLayout.CENTER_VERTICAL);
		scroller.setLayoutParams(scrollerLP);
		scroller.addView(lesson);
		layout.addView(scroller);

	}
}

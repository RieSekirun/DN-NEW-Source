package angeloid.dreamnarae;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Donate extends Activity {

	// Layout
	TextView LayoutTitle;
	TextView paypal;
	TextView thank;
	TextView koreaaccount;
	Button gopaypal;
	ImageView accountimage;

	// Slide Holder
	private SlideMenu mSlideHolder;

	// Slide Menu
	Button main;
	Button update;
	Button spica;
	Button pure;
	Button save;
	Button prev;
	Button miracle;
	Button brand;
	Button spisave;
	Button delete;
	Button promoting;
	Button setting;
	Button developerinfo;
	Button donate;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.donate);

		// Layout
		LayoutTitle = (TextView) findViewById(R.id.tabtextview);
		LayoutTitle.setTypeface(MainActivity.Font);
		paypal = (TextView) findViewById(R.id.paypal);
		paypal.setTypeface(MainActivity.Font);
		thank = (TextView) findViewById(R.id.thank);
		thank.setTypeface(MainActivity.Font);
		koreaaccount = (TextView) findViewById(R.id.koreaaccount);
		koreaaccount.setTypeface(MainActivity.Font);
		gopaypal = (Button) findViewById(R.id.gopaypal);
		accountimage = (ImageView) findViewById(R.id.accountimage);

		// SlideHolder
		mSlideHolder = (SlideMenu) findViewById(R.id.slideHolder);

		// Slide Menu
		main = (Button) findViewById(R.id.mainscreen);
		update = (Button) findViewById(R.id.updatelog);
		spica = (Button) findViewById(R.id.spica);
		pure = (Button) findViewById(R.id.pure);
		save = (Button) findViewById(R.id.save);
		prev = (Button) findViewById(R.id.prev);
		miracle = (Button) findViewById(R.id.miracle);
		brand = (Button) findViewById(R.id.brand);
		spisave = (Button) findViewById(R.id.spisave);
		delete = (Button) findViewById(R.id.delete);
		promoting = (Button) findViewById(R.id.promoting);
		setting = (Button) findViewById(R.id.setting);
		developerinfo = (Button) findViewById(R.id.developerinfo);
		donate = (Button) findViewById(R.id.donate);

		// Slide Menu Fonts
		main.setTypeface(MainActivity.Font);
		update.setTypeface(MainActivity.Font);
		spica.setTypeface(MainActivity.Font);
		pure.setTypeface(MainActivity.Font);
		save.setTypeface(MainActivity.Font);
		prev.setTypeface(MainActivity.Font);
		miracle.setTypeface(MainActivity.Font);
		brand.setTypeface(MainActivity.Font);
		spisave.setTypeface(MainActivity.Font);
		delete.setTypeface(MainActivity.Font);
		promoting.setTypeface(MainActivity.Font);
		setting.setTypeface(MainActivity.Font);
		developerinfo.setTypeface(MainActivity.Font);
		donate.setTypeface(MainActivity.Font);

		//gopaypal.setOnClickListener(new View.OnClickListener() {

			//@Override
			//public void onClick(View v) {
			//	Uri uri = Uri
			//			.parse("https://www.paypal.com/cgi-bin/webscr?cmd=_donations&business=GQE4HTNUAP6CS&lc=KR&item_name=Angeloid%20Team&item_number=DR&currency_code=USD&bn=PP%2dDonationsBF%3abtn_donateCC_LG%2egif%3aNonHosted");
			//	Intent it = new Intent(Intent.ACTION_VIEW, uri);
			//	startActivity(it);
		//	}
		//});
	}

	public void mainscreen(View v) {
		startActivity(new Intent(this, MainActivity.class));
		finish();
	}

	public void updatelog(View v) {
		startActivity(new Intent(this, Update_Main.class));
		finish();
	}

	public void spicascreen(View v) {
		startActivity(new Intent(this, SPiCa.class));
		finish();
	}

	public void purescreen(View v) {
		startActivity(new Intent(this, Pure.class));
		finish();
	}

	public void savescreen(View v) {
		startActivity(new Intent(this, Save.class));
		finish();
	}

	public void prevscreen(View v) {
		startActivity(new Intent(this, Prev.class));
		finish();
	}

	public void miraclescreen(View v) {
		startActivity(new Intent(this, Miracle.class));
		finish();
	}

	public void brandscreen(View v) {
		startActivity(new Intent(this, Brand.class));
		finish();
	}

	public void spisavescreen(View v) {
		startActivity(new Intent(this, SPiSave.class));
		finish();
	}

	public void deletescreen(View v) {
		startActivity(new Intent(this, Delete.class));
		finish();
	}

	public void promotingscreen(View v) {
		Toast.makeText(this, R.string.promotingnot, Toast.LENGTH_SHORT).show();
	}

	public void settingscreen(View v) {
		startActivity(new Intent(this, Settings.class));
		finish();
	}

	public void developerinfoscreen(View v) {
		startActivity(new Intent(this, Developer_Info.class));
		finish();
	}

	public void donatescreen(View v) {
		// startActivity(new Intent(this, Donate.class));
	}
}
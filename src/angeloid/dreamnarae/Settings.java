package angeloid.dreamnarae;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Settings extends Activity {

	// Layout
	TextView LayoutTitle;
	TextView setting1_title;
	TextView setting2_title;
	TextView setting3_title;
	TextView setting4_title;
	TextView setting1_summary;
	TextView setting2_summary;
	TextView setting3_summary;
	TextView setting4_summary;
	CheckBox setting1_check;
	CheckBox setting2_check;
	Button applysetting;
	Button go1;
	Button go2;
	TextView LayoutTitle2;

	// Settings
	boolean bootcheck = true;
	boolean mainvoice = false;

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

	// Kakao Link / Story Link
	private String encoding = "UTF-8";

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.settings);

		// Setting
		SharedPreferences prefs = PreferenceManager
				.getDefaultSharedPreferences(Settings.this);
		boolean statboolean = prefs.getBoolean("bootcheck", false);
		boolean statvoice = prefs.getBoolean("mainvoice", false);
		bootcheck = statboolean;
		mainvoice = statvoice;
		LayoutTitle2 = (TextView) findViewById(R.id.tabtextview2);
		LayoutTitle2.setTypeface(MainActivity.Font);

		// Layout
		LayoutTitle = (TextView) findViewById(R.id.tabtextview);
		LayoutTitle.setTypeface(MainActivity.Font);
		setting1_title = (TextView) findViewById(R.id.setting1_title);
		setting2_title = (TextView) findViewById(R.id.setting2_title);
		setting3_title = (TextView) findViewById(R.id.setting3_title);
		setting4_title = (TextView) findViewById(R.id.setting4_title);
		setting1_summary = (TextView) findViewById(R.id.setting1_summary);
		setting2_summary = (TextView) findViewById(R.id.setting2_summary);
		setting3_summary = (TextView) findViewById(R.id.setting3_summary);
		setting4_summary = (TextView) findViewById(R.id.setting4_summary);
		setting1_title.setTypeface(MainActivity.Font);
		setting2_title.setTypeface(MainActivity.Font);
		setting3_title.setTypeface(MainActivity.Font);
		setting4_title.setTypeface(MainActivity.Font);
		setting1_summary.setTypeface(MainActivity.Font);
		setting2_summary.setTypeface(MainActivity.Font);
		setting3_summary.setTypeface(MainActivity.Font);
		setting4_summary.setTypeface(MainActivity.Font);
		setting1_check = (CheckBox) findViewById(R.id.setting1_check);
		setting2_check = (CheckBox) findViewById(R.id.setting2_check);
		applysetting = (Button) findViewById(R.id.applysetting);
		applysetting.setTypeface(MainActivity.Font);
		go1 = (Button) findViewById(R.id.go1);
		go2 = (Button) findViewById(R.id.go2);
		go1.setTypeface(MainActivity.Font);
		go2.setTypeface(MainActivity.Font);

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
		applysetting.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				ApplySetting();
			}
		});
		go1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Uri uri = Uri.parse("mailto:sirospace@sirospace.com");
				Intent it = new Intent(Intent.ACTION_SENDTO, uri);
				startActivity(it);
			}
		});
		go2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				licenseintent();
			}
		});
	}

	public void ApplySetting() {
		if (setting1_check.isChecked() == true) {
			SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
			SharedPreferences.Editor editor = pref.edit();
			editor.putString("bootcheck", "true");
			editor.commit();
		} else {
			SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
			SharedPreferences.Editor editor = pref.edit();
			editor.putString("bootcheck", "false");
			editor.commit();
		}
		if (setting2_check.isChecked() == true) {
			SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
			SharedPreferences.Editor editor = pref.edit();
			editor.putString("mainvoice", "true");
			editor.commit();
		} else {
			SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
			SharedPreferences.Editor editor = pref.edit();
			editor.putString("mainvoice", "false");
			editor.commit();
		}
		Toast.makeText(this, R.string.savedsetting, Toast.LENGTH_SHORT).show();
	}

	/**
	 * Send App data
	 */
	public void sendAppData(View v) throws NameNotFoundException {
		ArrayList<Map<String, String>> metaInfoArray = new ArrayList<Map<String, String>>();

		// If application is support Android platform.
		Map<String, String> metaInfoAndroid = new Hashtable<String, String>(1);
		metaInfoAndroid.put("os", "android");
		metaInfoAndroid.put("devicetype", "phone");
		metaInfoAndroid.put("installurl",
				"market://details?id=angeloid.dreamnarae");
		metaInfoAndroid.put("executeurl", "kakaoLinkTest://starActivity");

		// add to array
		metaInfoArray.add(metaInfoAndroid);

		// Recommended: Use application context for parameter.
		KakaoLink kakaoLink = KakaoLink.getLink(getApplicationContext());

		// check, intent is available.
		if (!kakaoLink.isAvailableIntent()) {
			alert("Not installed KakaoTalk.");
			return;
		}

		/**
		 * @param activity
		 * @param url
		 * @param message
		 * @param appId
		 * @param appVer
		 * @param appName
		 * @param encoding
		 * @param metaInfoArray
		 */
		String app_name = getString(R.string.app_name);
		String message = getString(R.string.kakaotalkmessage);
		kakaoLink
				.openKakaoAppLink(
						this,
						"market://details?id=angeloid.dreamnarae",
						message,
						getPackageName(),
						getPackageManager().getPackageInfo(getPackageName(), 0).versionName,
						app_name, encoding, metaInfoArray);
	}

	private void alert(String message) {
		new AlertDialog.Builder(this)
				.setIcon(android.R.drawable.ic_dialog_alert)
				.setTitle(R.string.app_name).setMessage(message)
				.setPositiveButton(android.R.string.ok, null).create().show();
	}

	public void licenseintent() {
		startActivity(new Intent(this, License.class));
		finish();
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
		try {
			sendAppData(v);
		} catch (NameNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void settingscreen(View v) {
		// startActivity(new Intent(this, Settings.class));
	}

	public void developerinfoscreen(View v) {
		startActivity(new Intent(this, Developer_Info.class));
		finish();
	}

	public void donatescreen(View v) {
		startActivity(new Intent(this, Donate.class));
		finish();
	}
}
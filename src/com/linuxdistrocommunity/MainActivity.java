package com.linuxdistrocommunity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceActivity;

public class MainActivity extends PreferenceActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.main);
		findPreference("website").setIntent(new Intent(Intent.ACTION_VIEW,
				Uri.parse(getString(R.string.website_url))));
		findPreference("irc").setIntent(new Intent(Intent.ACTION_VIEW,
				Uri.parse(getString(R.string.irc_url))));
		findPreference("forums").setIntent(new Intent(Intent.ACTION_VIEW,
				Uri.parse(getString(R.string.forums_url))));
		findPreference("mumble_viewer").setIntent(new Intent(Intent.ACTION_VIEW,
				Uri.parse(getString(R.string.mumble_viewer_url))));
		findPreference("contact").setIntent(new Intent(Intent.ACTION_VIEW,
				Uri.parse(getString(R.string.contact_url))));
	}
}
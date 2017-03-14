package com.example.zhongweizhou.maptest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.facebook.Profile;
import com.facebook.login.widget.ProfilePictureView;


/**
 * Created by zhongweizhou on 3/11/17.
 */

public class SocialActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);

        ProfilePictureView fbProfilePicture = (ProfilePictureView) findViewById(R.id.fb_profile_picture);
        fbProfilePicture.setPresetSize(ProfilePictureView.LARGE);
        fbProfilePicture.setProfileId(Profile.getCurrentProfile().getId());

    }

    public void printId(View view) {
        Toast.makeText(getApplicationContext(), Profile.getCurrentProfile().getId(), Toast.LENGTH_SHORT).show();
    }
}
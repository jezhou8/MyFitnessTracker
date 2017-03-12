package com.example.zhongweizhou.maptest;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.Profile;
import com.facebook.login.widget.ProfilePictureView;

import java.net.URL;

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

    public void printId(View view){
        Toast.makeText(getApplicationContext(), Profile.getCurrentProfile().getId(), Toast.LENGTH_SHORT).show();
    }

    public Bitmap getFacebookProfilePicture(String userID){
        try {
            URL imageURL = new URL("https://graph.facebook.com/" + userID + "/picture?type=large");
            Bitmap bitmap = BitmapFactory.decodeStream(imageURL.openConnection().getInputStream());
            return bitmap;

        }catch(Exception e){
            Toast.makeText(getApplicationContext(), "unable to get image", Toast.LENGTH_SHORT);
            e.printStackTrace();
            return null;
        }
    }


}

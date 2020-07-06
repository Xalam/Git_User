package com.example.githubuser;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_GITHUB = "extra_github";

    TextView tvFullname, tvFollowers, tvFollowing, tvRepository, tvUsername, tvLocation, tvCompany;
    ImageView imgAvatar;
    ImageButton btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvFullname = findViewById(R.id.tv_detail_fullname);
        tvFollowers = findViewById(R.id.tv_detail_followers);
        tvFollowing = findViewById(R.id.tv_detail_following);
        tvRepository = findViewById(R.id.tv_detail_repository);
        tvUsername = findViewById(R.id.tv_detail_username);
        tvLocation = findViewById(R.id.tv_detail_location);
        tvCompany = findViewById(R.id.tv_detail_company);
        imgAvatar = findViewById(R.id.img_avatar);
        btnBack = findViewById(R.id.btn_back);

        getDataObject();

        Window window = DetailActivity.this.getWindow();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(ContextCompat.getColor(DetailActivity.this, R.color.colorPurple));
        }

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailActivity.this, MainActivity.class);
                intent.putExtra("extra", "home");
                startActivity(intent);
                finish();
            }
        });
    }

    private void getDataObject(){
        if (getIntent().hasExtra(EXTRA_GITHUB)){
            GithubUser githubUser = getIntent().getParcelableExtra(EXTRA_GITHUB);

            tvFullname.setText(githubUser.getFullName());
            tvFollowers.setText(String.valueOf(githubUser.getFollowers()));
            tvFollowing.setText(String.valueOf(githubUser.getFollowing()));
            tvRepository.setText(String.valueOf(githubUser.getRepository()));
            tvUsername.setText(githubUser.getUserName());
            tvLocation.setText(githubUser.getLocation());
            tvCompany.setText(githubUser.getCompany());

            imgAvatar.setImageResource(githubUser.getAvatar());
        }
    }
}

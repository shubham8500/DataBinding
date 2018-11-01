package expar.com.databinding;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import expar.com.databinding.databinding.ActivityMainBinding;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ActivityMainBinding binding =
                DataBindingUtil.setContentView(this,R.layout.activity_main);
      //  setSupportActionBar(binding.toolbar);

       User user = new User();
        user.setUserName("Ravi Tamada");
        user.setUserEmail("ravi@androidhive.info");

        binding.setUser(user);

}

    public class MyHandlers  {
        Context context;

        MyHandlers (Context context) {
            this.context = context;
        }

        public void onClickButton() {
            Toast.makeText(context, "Button Clicked", Toast.LENGTH_SHORT).show();
        }
    }
}

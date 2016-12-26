package edu.niu.cs.z1760203.activitylifecycle;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends Activity {

    //declaring variables

    private String createMessage,
                   startMessage,
                   resumeMessage,
                   pauseMessage,
                   stopMessage,
                   restartMessage;

    //defining the onCreate method
    //Called when the activity is first created.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createMessage = (String) getResources().getText(R.string.createMsg);
        startMessage =  (String) getResources().getText(R.string.startMsg);
        resumeMessage =  (String) getResources().getText(R.string.resumeMsg);
        restartMessage =  (String) getResources().getText(R.string.restartMsg);
        stopMessage =  (String) getResources().getText(R.string.stopMsg);
        pauseMessage =  (String) getResources().getText(R.string.pauseMsg);

        Toast.makeText(this, createMessage, Toast.LENGTH_LONG).show();
        Log.d("Main Activity", createMessage);
    }

    //defining the onStart method
    //Called when the activity is becoming visible to the user.

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,startMessage,Toast.LENGTH_LONG).show();
        Log.d("MainActivity", startMessage);
    }

    //defining the onResume method
    //Called when the activity is becoming visible to the user.

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this,resumeMessage,Toast.LENGTH_LONG).show();
        Log.d("MainActivity", stopMessage);
    }

    //defining the onPause method
    //Called when the system is about to start resuming a previous activity.

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this,pauseMessage,Toast.LENGTH_LONG).show();
        Log.d("MainActivity", pauseMessage);
    }

    //defining the onStop method
    //Called when the activity is no longer visible to the user,
    //because another activity has been resumed and is covering this one.

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this,stopMessage,Toast.LENGTH_LONG).show();
        Log.d("MainActivity", stopMessage);
    }

    //defining the onRestart method
    //Called after your activity has been stopped, prior to it being started again.

    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(this,restartMessage,Toast.LENGTH_LONG).show();
        Log.d("MainActivity", restartMessage);
    }

}//activity ends


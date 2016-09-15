package pe.pedro.hilosejemplo;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_run_on_ui_thread).setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button_run_on_ui_thread:
                executeLongOnUiThread();
                break;
        }
    }


    private void executeLongOnUiThread(){
        final Dialog progressDialog=createProgressDialog();
        progressDialog.show();
        executeLongTask();
        progressDialog.dismiss();
    }


    private void executeLongTask(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private Dialog createProgressDialog(){
        final ProgressDialog progressDialog=new ProgressDialog(this);
        progressDialog.setTitle(R.string.loading);
        return progressDialog;
    }

    /*
    private void clicksito(View v){

    }
    */
}

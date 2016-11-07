package com.mohamedhedhili.button_animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   Button add,chat,send,company,mail  ;
    Animation anim_in , anim_out , animButton ;
    Boolean open =true  ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add= (Button)findViewById(R.id.btn_add) ;
        chat= (Button)findViewById(R.id.btn_chat) ;
        mail= (Button)findViewById(R.id.btn_mail) ;
        send= (Button)findViewById(R.id.btn_send) ;
        company= (Button)findViewById(R.id.btn_compagny) ;
        anim_in = AnimationUtils.loadAnimation(this,R.anim.anim_in) ;
        anim_out = AnimationUtils.loadAnimation(this,R.anim.anim_out) ;
        animButton = AnimationUtils.loadAnimation(this,R.anim.anim_button) ;
        add.bringToFront();
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (open) {
                    open=false ;
                    add.startAnimation(animButton);
                    chat.startAnimation(anim_in);
                    mail.startAnimation(anim_in);
                    send.startAnimation(anim_in);
                    company.startAnimation(anim_in);
                    mail.setVisibility(View.VISIBLE);
                    send.setVisibility(View.VISIBLE);
                    company.setVisibility(View.VISIBLE);
                    chat.setVisibility(View.VISIBLE);
                }
                else
                {
                    open=true ;
                    add.startAnimation(animButton);
                    chat.startAnimation(anim_out);
                    mail.startAnimation(anim_out);
                    send.startAnimation(anim_out);
                    company.startAnimation(anim_out);
                    mail.setVisibility(View.INVISIBLE);
                    send.setVisibility(View.INVISIBLE);
                    company.setVisibility(View.INVISIBLE);
                    chat.setVisibility(View.INVISIBLE);
                }
            }
        });


    }
}

package nelson.cracel1;

import android.app.ProgressDialog;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class MenuPrincipal extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private ProgressDialog progressDialog;
    ImageView imageView;
    Image image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        progressDialog = ProgressDialog.show(this, "Aguarde!!!.", "Abrindo aplicação..", true);
        setContentView(R.layout.activity_menu_principal);
        button1=(Button) findViewById(R.id.botao1);
        button2=(Button) findViewById(R.id.botao2);
        button3=(Button) findViewById(R.id.botao3);
        imageView=(ImageView)findViewById(R.id.imageView);
        imageView.setImageResource(R.mipmap.logocra1);

        progressDialog.dismiss();
        //Abre o site pra celular
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDialog.show();
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://186.228.61.250:82/cra/logincel.jsf"));
                startActivity(intent1);
                progressDialog.dismiss();
            }
        });


        //Abre o Site de Mídias Noticias
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDialog.show();
                Toast.makeText(MenuPrincipal.this, "Abrindo o site de midia", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cavalcanteramos.adv.br/midia"));
                startActivity(intent2);
                progressDialog.dismiss();
            }
        });



        //Finaliza o asite
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

                Toast.makeText(MenuPrincipal.this, "Saindo do Sistema.", Toast.LENGTH_SHORT).show();
            }
        });








    }


}

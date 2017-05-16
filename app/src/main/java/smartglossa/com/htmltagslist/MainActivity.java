package smartglossa.com.htmltagslist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button html=(Button)findViewById(R.id.htmlbutt);
        Button base=(Button)findViewById(R.id.basebutt);
        Button head=(Button)findViewById(R.id.headbutt);
        Button link=(Button)findViewById(R.id.likebutt);
        Button meta=(Button)findViewById(R.id.metabutt);
        Button style=(Button)findViewById(R.id.stylebutt);
        Button title=(Button)findViewById(R.id.titlebutt);
        Button addr=(Button)findViewById(R.id.addrbutt);
        Button article=(Button)findViewById(R.id.articlebutt);
        Button aside=(Button)findViewById(R.id.asidebutt);
        Button body=(Button)findViewById(R.id.bodybutt);
        Button footer=(Button)findViewById(R.id.footerbutt);
        Button hsix=(Button)findViewById(R.id.hsixbutt);

        html.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    startActivity(new Intent(MainActivity.this, Html_Activity.class));
            }

        });
        base.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Base_Activity.class));
            }

        });
        head.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Head_Activity.class));
            }

        });

        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LInk_Activity.class));
            }

        });
        meta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Meta_Activity.class));
            }

        });
        style.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Style_Activity.class));
            }

        });
        title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Title_Activity.class));
            }

        });
        addr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Addr_Activity.class));
            }

        });
        article.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Article_Activity.class));
            }

        });
        aside.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Aside_Activity.class));
            }

        });
        body.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Body_Activity.class));
            }

        });
        footer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Footer_Activity.class));
            }

        });
        hsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Hsix_Activity.class));
            }

        });
    }
}

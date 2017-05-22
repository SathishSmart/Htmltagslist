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
        Button header=(Button)findViewById(R.id.headerbutt);
        Button hgroup=(Button)findViewById(R.id.hgroupbutt);
        Button nav=(Button)findViewById(R.id.navbutts);
        Button section=(Button)findViewById(R.id.sectionbutt);
        Button blockquote=(Button)findViewById(R.id.blockquotebutts);
        Button breaks=(Button)findViewById(R.id.breakbutt);
        Button dd=(Button)findViewById(R.id.ddbutt);
        Button div=(Button)findViewById(R.id.divbutt);
        Button dl=(Button)findViewById(R.id.dlbutt1);
        Button dt=(Button)findViewById(R.id.dtbutt2);
        Button fig=(Button)findViewById(R.id.figcaptionbutt);
        Button figure=(Button)findViewById(R.id.figurebutt);
        Button hr=(Button)findViewById(R.id.hrbutt);
        Button li=(Button)findViewById(R.id.libutt);
        Button main=(Button)findViewById(R.id.mainbutt);
        Button ol=(Button)findViewById(R.id.olbutt);
        Button p=(Button)findViewById(R.id.pbutt);
        Button pre=(Button)findViewById(R.id.prebutt);
        Button uc=(Button)findViewById(R.id.ucbutt);
        Button a=(Button)findViewById(R.id.abutt);
        Button abbr=(Button)findViewById(R.id.abbrbutt);
        Button b=(Button)findViewById(R.id.bbutt);
        Button bdi=(Button)findViewById(R.id.bdibutt);
        Button bdo=(Button)findViewById(R.id.bdobutt);
        Button cite=(Button)findViewById(R.id.citebutt);
        Button code=(Button)findViewById(R.id.codebutt);
        Button del=(Button)findViewById(R.id.delbutt);
        Button dfn=(Button)findViewById(R.id.dfnbutt);
        Button em=(Button)findViewById(R.id.embutt);
        Button i=(Button)findViewById(R.id.ibutt);
        Button ins=(Button)findViewById(R.id.insbutt);
        Button kbd=(Button)findViewById(R.id.kbdbutt);
        Button mark=(Button)findViewById(R.id.markbutt);
        Button q=(Button)findViewById(R.id.qbutt);
        Button rp=(Button)findViewById(R.id.rpbutt);
        Button rt=(Button)findViewById(R.id.rtbutt);


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
        header.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Header_Activity.class));
            }

        });
        hgroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Hgroup_Activity.class));
            }

        });
        nav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Nav_Activity.class));
            }

        });
        section.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Section_Activity.class));
            }

        });
        blockquote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Blockquote_Activity.class));
            }

        });
        breaks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Break_Activity.class));
            }

        });
        dd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Dd_Activity.class));
            }

        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Div_Activity.class));
            }

        });
        dl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Dl_Activity.class));
            }

        });
        dt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Dt_Activity.class));
            }

        });
        fig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FigCaption_Activity.class));
            }

        });
        figure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Figure_Activity.class));
            }

        });
        hr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Hr_Activity.class));
            }

        });
        li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Li_Activity.class));
            }

        });
        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main_Activity.class));
            }

        });
        ol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Ol_Activity.class));
            }

        });
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, P_Activity.class));
            }

        });
        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Pre_Activity.class));
            }

        });
        uc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Ul_Activity.class));
            }

        });
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, A_Activity.class));
            }

        });
        abbr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Abbr_Activity.class));
            }

        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, B_Activity.class));
            }

        });
        bdi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Bdi_Activity.class));
            }

        });
        bdo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Bdo_Activity.class));
            }

        });
        cite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Cite_Activity.class));
            }

        });
        code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Code_Activity.class));
            }

        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Del_Activity.class));
            }

        });
        dfn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Header_Activity.class));
            }

        });
        em.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Em_Activity.class));
            }

        });
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, I_Activity.class));
            }

        });
        ins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Ins_Activity.class));
            }

        });
        kbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Kbd_Activity.class));
            }

        });
        mark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Mark_Activity.class));
            }

        });
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Q_Activity.class));
            }

        });
        rp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Rp_Activity.class));
            }

        });
        rt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Rt_Activity.class));
            }

        });
        header.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Header_Activity.class));
            }

        });
        header.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Header_Activity.class));
            }

        });
        header.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Header_Activity.class));
            }

        });
        header.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Header_Activity.class));
            }

        });
        header.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Header_Activity.class));
            }

        });
        header.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Header_Activity.class));
            }

        });
        header.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Header_Activity.class));
            }

        });



























    }
}

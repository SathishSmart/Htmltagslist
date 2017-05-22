package smartglossa.com.htmltagslist;

import android.content.Intent;
import android.support.v4.view.ActionProvider;
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
        Button ruby=(Button)findViewById(R.id.rubybutt);
        Button s=(Button)findViewById(R.id.sbutt);
        Button samp=(Button)findViewById(R.id.sampbutt);
        Button small=(Button)findViewById(R.id.smallbutt);
        Button span=(Button)findViewById(R.id.spanbutt);
        Button stong=(Button)findViewById(R.id.strongbutt);
        Button sub=(Button)findViewById(R.id.subbutt);
        Button sup=(Button)findViewById(R.id.supbutt);
        Button time=(Button)findViewById(R.id.timebutt);
        Button var=(Button)findViewById(R.id.varbutt);
        Button wbr=(Button)findViewById(R.id.wbrbutt);
        Button caption=(Button)findViewById(R.id.captionbutt);
        Button col=(Button)findViewById(R.id.colbutt);
        Button colgroup=(Button)findViewById(R.id.colgroupbutt);
        Button table=(Button)findViewById(R.id.tablebutt);
        Button tbody=(Button)findViewById(R.id.tbodybutt);
        Button td=(Button)findViewById(R.id.tdbutt);
        Button tfoot=(Button)findViewById(R.id.tfootbutt);
        Button th=(Button)findViewById(R.id.thbutt);
        Button thead=(Button)findViewById(R.id.theadbutt);
        Button tr=(Button)findViewById(R.id.trbutt);
        Button button1=(Button)findViewById(R.id.buttonbutt);
        Button data =(Button)findViewById(R.id.databutt);
        Button datalist=(Button)findViewById(R.id.datalistbutt);
        Button fieldlist=(Button)findViewById(R.id.fieldlistbutt);
        Button form=(Button)findViewById(R.id.formbutt);
        Button input=(Button)findViewById(R.id.inputbutt);
        Button label=(Button)findViewById(R.id.labelbutt);
        Button legend=(Button)findViewById(R.id.legendbutt);
        Button meter=(Button)findViewById(R.id.meterbutt);
        Button opt=(Button)findViewById(R.id.outputbutt);
        Button option=(Button)findViewById(R.id.optionbutt);
        Button output=(Button)findViewById(R.id.outputbutt);
        Button progress=(Button)findViewById(R.id.progressbutt);
        Button select=(Button)findViewById(R.id.selectbutt);
        Button textarea=(Button)findViewById(R.id.textareabutt);
        Button embed=(Button)findViewById(R.id.embedbutt);
        Button iframe=(Button)findViewById(R.id.iframebutt);
        Button img=(Button)findViewById(R.id.imgbutt);
        Button object=(Button)findViewById(R.id.objectbutt);
        Button param=(Button)findViewById(R.id.parambutt);
        Button source=(Button)findViewById(R.id.sourcebutt);
        Button area=(Button)findViewById(R.id.areabutt);
        Button audio=(Button)findViewById(R.id.audiobutt);
        Button map=(Button)findViewById(R.id.mapbutt);
        Button track=(Button)findViewById(R.id.trackbutt);
        Button video=(Button)findViewById(R.id.videobutt);
        Button detail=(Button)findViewById(R.id.detailbutt);
        Button dialog=(Button)findViewById(R.id.dialogbutt);
        Button menu=(Button)findViewById(R.id.menubutt);
        Button summary=(Button)findViewById(R.id.summarybutt);
        Button canvas=(Button)findViewById(R.id.canvasbutt);
        Button noscript=(Button)findViewById(R.id.noscriptbutt);
        Button script=(Button)findViewById(R.id.scriptbutt);








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
        ruby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Ruby_Activity.class));
            }

        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, S_Activity.class));
            }

        });
        samp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Samp_Activity.class));
            }

        });
        small.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Small_Activity.class));
            }

        });
        span.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Span_Activity.class));
            }

        });
        stong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Stong_Activity.class));
            }

        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Sub_Activity.class));
            }

        });
        sup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Sup_Activity.class));
            }

        });
        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Time_Activity.class));
            }

        });
        var.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Var_Activity.class));
            }

        });
        wbr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Wbr_Activity.class));
            }

        });
        caption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Caption_Activtiy.class));
            }

        });
        col.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Col_Activity.class));
            }

        });
        colgroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Colgroup_Activity.class));
            }

        });
        table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Table_Activity.class));
            }

        });
        tbody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Tbody_Activity.class));
            }

        });
        td.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Td_Activity.class));
            }

        });
        tfoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Tfoot_Activity.class));
            }

        });
        th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Th_Activity.class));
            }

        });
        thead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Thead_Activity.class));
            }

        });
        tr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Tr_Activity.class));
            }

        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Button_Activity.class));
            }

        });
        data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Data_Activity.class));
            }

        });
        datalist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Datalist_Activity.class));
            }

        });
        fieldlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Fileldlist_Activity.class));
            }

        });
        form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Form_Activity.class));
            }

        });
        input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Input_Activity.class));
            }

        });
        label.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Label_Activity.class));
            }

        });
        legend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Legand_Activity.class));
            }

        });
        meter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Meter_Activity.class));
            }

        });
        opt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Optgroup_Activity.class));
            }

        });
        option.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Option_Activity.class));
            }

        });
        output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Output_Activity.class));
            }

        });
        progress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Progress_Activity.class));
            }

        });
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Select_Activity.class));
            }

        });
        textarea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Textarea_Activity.class));
            }

        });
        embed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Embed_Activity.class));
            }

        });
        iframe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Iframe_Activity.class));
            }

        });
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Img_Activity.class));
            }

        });
        object.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Object_Activity.class));
            }

        });
        param.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Param_Activity.class));
            }

        });
        source.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Source_Activity.class));
            }

        });
        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Area_Activity.class));
            }

        });
        audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Audio_Activity.class));
            }

        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Map_Activity.class));
            }

        });
        track.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Track_Activity.class));
            }

        });
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Video_Activity.class));
            }

        });
        detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Detail_Activity.class));
            }

        });
        dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Dialog_Activity.class));
            }

        });
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Menu_Activity.class));
            }

        });
        summary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Summary_Activity.class));
            }

        });
        canvas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Canvas_main.class));
            }

        });
        noscript.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Noscript_Activity.class));
            }

        });
        script.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Script_Activity.class));
            }

        });




























    }
}

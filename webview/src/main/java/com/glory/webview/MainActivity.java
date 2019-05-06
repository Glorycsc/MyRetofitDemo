package com.glory.webview;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.util.Log;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static String data2 ="<!DOCTYPE html><html><head lang=\"en\"> <meta charset=\"UTF-8\"><title></title><style>img{width:100%;}</style></head><body><div id='foo'>哈哈哈<img src=\"http://www.fangwubook.com/static/refund/Img/20180912/5e7bca99-4e50-4f0a-992a-084d4ee5f5b4.jpg\"/><img src=\"http://www.fangwubook.com/static/refund/Img/20180912/cb5a7680-9240-40ee-8132-c0504535b857.jpg\"/></div></body></html>";
    // 定义为final的意思是
    private static String data = "<!DOCTYPE html><html><head lang=\"en\"> <meta charset=\"UTF-8\"><title></title><style>img{width:100%;}</style></head><body><div id='foo'><h2 style=\"padding: 0px; margin: 30px 0px 0px; font-variant-numeric: normal; font-variant-east-asian: normal; font-weight: 500; font-stretch: normal; font-size: 24px; line-height: 42px; font-family: \"Microsoft Yahei\"; width: 620px; height: 42px; color: rgb(51, 51, 51); white-space: normal; background-color: rgb(255, 255, 255);\"><span style=\"padding: 0px 10px 0px 0px; margin: 0px; display: block; width: 42px; height: 42px; background: url(\"https://res.cngoldres.com/zhubao/img/zhubao_sprite_v14.png\") 0px -313px no-repeat; font-variant-numeric: normal; font-variant-east-asian: normal; font-stretch: normal; line-height: 42px; font-family: Arial; text-align: center; color: rgb(255, 255, 255); float: left;\">1</span>什么是龟甲</h2><p><img alt=\"什么是龟甲\" height=\"446\" src=\"http://www.fangwubook.com/static/ueditor/image/20180816/1534384488955093409.jpg\" width=\"600\"/></p><p style=\"padding: 0px; margin-top: 15px; margin-bottom: 0px; text-indent: 28px; color: rgb(51, 51, 51); font-family: simsun, Arial; font-size: 14px; white-space: normal; background-color: rgb(255, 255, 255);\">龟甲透明度高，斑纹呈褐色至黄色的外观美丽；白底黑斑的稀少；带暗红色至红色斑块和“血丝”的比较常见。老龟下壳的薄的黄色龟板价值较高，最名贵的被称为黄肚的黄色龟板，取自上壳或老龟的下壳。</p><h2 style=\"padding: 0px; margin: 30px 0px 0px; font-variant-numeric: normal; font-variant-east-asian: normal; font-weight: 500; font-stretch: normal; font-size: 24px; line-height: 42px; font-family: \"Microsoft Yahei\"; width: 620px; height: 42px; color: rgb(51, 51, 51); white-space: normal; background-color: rgb(255, 255, 255);\"><span style=\"padding: 0px 10px 0px 0px; margin: 0px; display: block; width: 42px; height: 42px; background: url(\"https://res.cngoldres.com/zhubao/img/zhubao_sprite_v14.png\") 0px -313px no-repeat; font-variant-numeric: normal; font-variant-east-asian: normal; font-stretch: normal; line-height: 42px; font-family: Arial; text-align: center; color: rgb(255, 255, 255); float: left;\">2</span>龟甲产地在哪里</h2><p style=\"padding: 0px; margin-top: 15px; margin-bottom: 0px; text-indent: 28px; color: rgb(51, 51, 51); font-family: simsun, Arial; font-size: 14px; white-space: normal; background-color: rgb(255, 255, 255);\">玳瑁一般在海深18.3米以上的水域中活动，其一生中会在几个环境完全不同的栖息地生活。成年玳瑁主要在热带<a href=\"https://zhubao.cngold.org/zhishi/shanhujiao.html\" target=\"_blank\" style=\"padding: 0px; margin: 0px; color: rgb(14, 114, 201); text-decoration-line: none;\">珊瑚礁</a>中活动，白天时它们会在<a href=\"https://zhubao.cngold.org/shanhu/\" target=\"_blank\" style=\"padding: 0px; margin: 0px; color: rgb(14, 114, 201); text-decoration-line: none;\">珊瑚</a>礁中的许多洞穴和深谷中进进出出，而珊瑚礁中的许多洞穴和深谷给它提供休息的地方。作为一种常常洄游迁徙的海龟，它们的栖息地各种各样，包括广阔的海洋、礁湖甚至是入海口处的红树林沼泽。至今人们对处于生命早期阶段的幼年玳瑁所偏好的栖息地知之甚少，但人们推测它们像其他幼年海龟一样在大海中过着浮游生物般的生活，直到成年时才会离开它们的家。</p><h2 style=\"padding: 0px; margin: 30px 0px 0px; font-variant-numeric: normal; font-variant-east-asian: normal; font-weight: 500; font-stretch: normal; font-size: 24px; line-height: 42px; font-family: \"Microsoft Yahei\"; width: 620px; height: 42px; color: rgb(51, 51, 51); white-space: normal; background-color: rgb(255, 255, 255);\"><span style=\"padding: 0px 10px 0px 0px; margin: 0px; display: block; width: 42px; height: 42px; background: url(\"https://res.cngoldres.com/zhubao/img/zhubao_sprite_v14.png\") 0px -313px no-repeat; font-variant-numeric: normal; font-variant-east-asian: normal; font-stretch: normal; line-height: 42px; font-family: Arial; text-align: center; color: rgb(255, 255, 255); float: left;\">3</span>龟甲的价格</h2><p><img alt=\"龟甲的价格\" height=\"558\" src=\"http://www.fangwubook.com/static/ueditor/image/20180816/1534384488980069798.jpg\" width=\"600\"/></p><p style=\"padding: 0px; margin-top: 15px; margin-bottom: 0px; text-indent: 28px; color: rgb(51, 51, 51); font-family: simsun, Arial; font-size: 14px; white-space: normal; background-color: rgb(255, 255, 255);\">玳瑁的角质甲壳。玳瑁又名十三棱龟，是因其背甲中间五块、两边各四块共十三块而得此名。与一般龟甲不同之处在于这些龟甲相互层层叠置，而不是彼此镶嵌拼合。论其质地，中间五块优于周边八块。玳瑁龟甲色彩斑斓，花纹多种，易于用热压法作模压加工，也可在车床上切削成型，是制作<a href=\"https://zhubao.cngold.org/\" target=\"_blank\" style=\"padding: 0px; margin: 0px; color: rgb(14, 114, 201); text-decoration-line: none;\">珠宝</a>盒、鼻烟盒及刀柄、袖扣等的镶嵌材料，其制品与<a href=\"https://zhubao.cngold.org/bstj/xiangya.html\" target=\"_blank\" style=\"padding: 0px; margin: 0px; color: rgb(14, 114, 201); text-decoration-line: none;\">象牙</a>制品属相同档次。</p><h2 style=\"padding: 0px; margin: 30px 0px 0px; font-variant-numeric: normal; font-variant-east-asian: normal; font-weight: 500; font-stretch: normal; font-size: 24px; line-height: 42px; font-family: \"Microsoft Yahei\"; width: 620px; height: 42px; color: rgb(51, 51, 51); white-space: normal; background-color: rgb(255, 255, 255);\"><span style=\"padding: 0px 10px 0px 0px; margin: 0px; display: block; width: 42px; height: 42px; background: url(\"https://res.cngoldres.com/zhubao/img/zhubao_sprite_v14.png\") 0px -313px no-repeat; font-variant-numeric: normal; font-variant-east-asian: normal; font-stretch: normal; line-height: 42px; font-family: Arial; text-align: center; color: rgb(255, 255, 255); float: left;\">4</span>龟甲的功效与作用</h2><p style=\"padding: 0px; margin-top: 15px; margin-bottom: 0px; text-indent: 28px; color: rgb(51, 51, 51); font-family: simsun, Arial; font-size: 14px; white-space: normal; background-color: rgb(255, 255, 255);\">玳瑁鏻片花纹晶莹剔透，高贵典雅，是万年不朽，是装饰收藏之极品。玳瑁有剧毒不能食用，但作药用，其清热解毒之功效可比犀角，是名贵中药，有清热、解毒镇惊，降压</p><h2 style=\"padding: 0px; margin: 30px 0px 0px; font-variant-numeric: normal; font-variant-east-asian: normal; font-weight: 500; font-stretch: normal; font-size: 24px; line-height: 42px; font-family: \"Microsoft Yahei\"; width: 620px; height: 42px; color: rgb(51, 51, 51); white-space: normal; background-color: rgb(255, 255, 255);\"><span style=\"padding: 0px 10px 0px 0px; margin: 0px; display: block; width: 42px; height: 42px; background: url(\"https://res.cngoldres.com/zhubao/img/zhubao_sprite_v14.png\") 0px -313px no-repeat; font-variant-numeric: normal; font-variant-east-asian: normal; font-stretch: normal; line-height: 42px; font-family: Arial; text-align: center; color: rgb(255, 255, 255); float: left;\">5</span>龟甲的挑选</h2><p><img alt=\"龟甲的挑选\" height=\"523\" src=\"http://www.fangwubook.com/static/ueditor/image/20180816/1534384489094041453.jpg\" width=\"600\"/></p><p style=\"padding: 0px; margin-top: 15px; margin-bottom: 0px; text-indent: 28px; color: rgb(51, 51, 51); font-family: simsun, Arial; font-size: 14px; white-space: normal; background-color: rgb(255, 255, 255);\">龟甲在热水中煮变软，显微镜下薄处可见有球状颗粒结构和特有的斑纹结构，可以此区别于塑料、硬树脂等仿品。断面不平坦，整体透明至微透明，油脂状、蜡状光泽，折光率1 55，硬度2 5，密度1 29克/厘米3。性脆、可切成片，遇硝酸被腐蚀，与盐酸无反应，受热高时颜色变暗。市场上有多种人工仿制品出售。</p><h2 style=\"padding: 0px; margin: 30px 0px 0px; font-variant-numeric: normal; font-variant-east-asian: normal; font-weight: 500; font-stretch: normal; font-size: 24px; line-height: 42px; font-family: \"Microsoft Yahei\"; width: 620px; height: 42px; color: rgb(51, 51, 51); white-space: normal; background-color: rgb(255, 255, 255);\"><span style=\"padding: 0px 10px 0px 0px; margin: 0px; display: block; width: 42px; height: 42px; background: url(\"https://res.cngoldres.com/zhubao/img/zhubao_sprite_v14.png\") 0px -313px no-repeat; font-variant-numeric: normal; font-variant-east-asian: normal; font-stretch: normal; line-height: 42px; font-family: Arial; text-align: center; color: rgb(255, 255, 255); float: left;\">6</span>龟甲保养介绍</h2><p style=\"padding: 0px; margin-top: 15px; margin-bottom: 0px; text-indent: 28px; color: rgb(51, 51, 51); font-family: simsun, Arial; font-size: 14px; white-space: normal; background-color: rgb(255, 255, 255);\">1、避免碰撞硬物 以免刮花断裂</p><p style=\"padding: 0px; margin-top: 15px; margin-bottom: 0px; text-indent: 28px; color: rgb(51, 51, 51); font-family: simsun, Arial; font-size: 14px; white-space: normal; background-color: rgb(255, 255, 255);\">2、避免接触酸、碱性液体</p><p style=\"padding: 0px; margin-top: 15px; margin-bottom: 0px; text-indent: 28px; color: rgb(51, 51, 51); font-family: simsun, Arial; font-size: 14px; white-space: normal; background-color: rgb(255, 255, 255);\">3、避免用热水浸泡 否则会变软 变形（这是识别真假海宝鳞甲首饰主要方法）</p><p style=\"padding: 0px; margin-top: 15px; margin-bottom: 0px; text-indent: 28px; color: rgb(51, 51, 51); font-family: simsun, Arial; font-size: 14px; white-space: normal; background-color: rgb(255, 255, 255);\">4、使用后请用软布擦拭妥善保管</p><h2 style=\"padding: 0px; margin: 30px 0px 0px; font-variant-numeric: normal; font-variant-east-asian: normal; font-weight: 500; font-stretch: normal; font-size: 24px; line-height: 42px; font-family: \"Microsoft Yahei\"; width: 620px; height: 42px; color: rgb(51, 51, 51); white-space: normal; background-color: rgb(255, 255, 255);\"><span style=\"padding: 0px 10px 0px 0px; margin: 0px; display: block; width: 42px; height: 42px; background: url(\"https://res.cngoldres.com/zhubao/img/zhubao_sprite_v14.png\") 0px -313px no-repeat; font-variant-numeric: normal; font-variant-east-asian: normal; font-stretch: normal; line-height: 42px; font-family: Arial; text-align: center; color: rgb(255, 255, 255); float: left;\">7</span>龟甲真假鉴定方法</h2><p style=\"padding: 0px; margin-top: 15px; margin-bottom: 0px; text-indent: 28px; color: rgb(51, 51, 51); font-family: simsun, Arial; font-size: 14px; white-space: normal; background-color: rgb(255, 255, 255);\">1.强光照射法：将玳瑁在强光或电筒光下投射，真品可见通透的美丽花纹，透明的血丝状深入甲片内，其色斑 呈无数圆点状，如糜子小点聚集一起，形成边界参差不齐的不规则状。仿制品的血丝在表面成片状，斑纹呆板或呈团块状。</p><p style=\"padding: 0px; margin-top: 15px; margin-bottom: 0px; text-indent: 28px; color: rgb(51, 51, 51); font-family: simsun, Arial; font-size: 14px; white-space: normal; background-color: rgb(255, 255, 255);\">2.抛光法：玳瑁片经抛光后呈现一种独特光彩和神韵。仿制品则不具备这一特征。</p><p style=\"padding: 0px; margin-top: 15px; margin-bottom: 0px; text-indent: 28px; color: rgb(51, 51, 51); font-family: simsun, Arial; font-size: 14px; white-space: normal; background-color: rgb(255, 255, 255);\">3.燃烧法：刮削末点燃或以热针触之，真品火烧会有烧焦头发的味道。仿制品则为异味，电木发石酸气味；赛璐珞呈樟脑气味；安全赛璐珞和酪素塑胶则呈醋味。</p><p style=\"padding: 0px; margin-top: 15px; margin-bottom: 0px; text-indent: 28px; color: rgb(51, 51, 51); font-family: simsun, Arial; font-size: 14px; white-space: normal; background-color: rgb(255, 255, 255);\">4.手掂法：玳瑁密度为1.29g/cm3。塑料仿制品为1.05-1.10g/cm3，手感易分出。</p><p style=\"padding: 0px; margin-top: 15px; margin-bottom: 0px; text-indent: 28px; color: rgb(51, 51, 51); font-family: simsun, Arial; font-size: 14px; white-space: normal; background-color: rgb(255, 255, 255);\">5.切片观察法：将玳瑁用温水浸泡软化后，切片用放大镜或显微镜观察，可见红褐色球状颗粒，色斑呈圆形色素小点，具备清晰的斑纹结构。塑料制品具条状，可见界限明显的色带。</p><p style=\"padding: 0px; margin-top: 15px; margin-bottom: 0px; text-indent: 28px; color: rgb(51, 51, 51); font-family: simsun, Arial; font-size: 14px; white-space: normal; background-color: rgb(255, 255, 255);\">6.天然玳瑁与压制玳瑁的区别在于：仿制玳瑁因受热后颜色变深，且有空气泡，呈拉长状。天然玳瑁则相反。</p><p style=\"padding: 0px; margin-top: 15px; margin-bottom: 0px; text-indent: 28px; color: rgb(51, 51, 51); font-family: simsun, Arial; font-size: 14px; white-space: normal; background-color: rgb(255, 255, 255);\">7.拼合玳瑁是为了看去很厚，但从侧面观察，就可见不同片间有色泽区别；用放大镜观之，有粘胶痕迹及气泡残存。</p><p style=\"padding: 0px; margin-top: 15px; margin-bottom: 0px; text-indent: 28px; color: rgb(51, 51, 51); font-family: simsun, Arial; font-size: 14px; white-space: normal; background-color: rgb(255, 255, 255);\">8.玳瑁和牛角的区别,牛角普遍没有玳瑁的花纹,(也就是红黑透明黄夹杂的花斑)，玳瑁斑光泽好,花纹通透美丽.</p><p style=\"padding: 0px; margin-top: 15px; margin-bottom: 0px; text-indent: 28px; color: rgb(51, 51, 51); font-family: simsun, Arial; font-size: 14px; white-space: normal; background-color: rgb(255, 255, 255);\">9.大的玳瑁片从水中捞出瞬间，水会向四周散开，所以玳瑁能避雾水、风邪。</p><p style=\"padding: 0px; margin-top: 15px; margin-bottom: 0px; text-indent: 28px; color: rgb(51, 51, 51); font-family: simsun, Arial; font-size: 14px; white-space: normal; background-color: rgb(255, 255, 255);\">10.开水加热法:玳瑁经开水煮后,形状可以任意弯曲而不折断,而仿制玳瑁经开水煮后,弯曲易断。</p><p><br/></p></div></body></html>";
    String HTML_HEADER = "<!DOCTYPE html>" +
            "<html>" +
            "<head lang=\"en\">" +
            "   <meta charset=\"UTF-8\">" +
            "   <meta name=\"viewport\" content=\"width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no\" />\n" +
            "   <title></title>" +
            "   <style>img{width:100%;}</style>" +
            "   </head>" +
            "<body>" +
            "<div id='foo'>";
    String HTML_FOOTER = "</div>" +
            "</body>" +
            "</html>";


//    String HTML_HEADER = "<!DOCTYPE html>\n" +
//            "<html>\n" +
//            "<head>\n" +
//            "    <meta charset=\"UTF-8\">\n" +
//            "    <meta name=\"viewport\" content=\"width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no\" />\n" +
//            "    <title></title>\n" +
//            "</head><body>";
//    String HTML_FOOTER = "</body></html>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String dataStr = data.replaceAll("src=\"/static", "src=\"http://www.fangwubook.com/static");
        WebView webView = findViewById(R.id.webView);

//        data2.replaceAll("<img", "<img  width='100%' style=/\"word-wrap:break-word; font-family:Arial ");
//        dataStr = data2.replaceAll("src=\"/static", "src=\"http://www.fangwubook.com/static");

        webView.loadDataWithBaseURL(null,
                HTML_HEADER+ dataStr+HTML_FOOTER,
                "text/html",
                "UTF-8",
                null);

//        webView.getSettings().setJavaScriptEnabled(true);
//        webView.getSettings().setLoadsImagesAutomatically(true);
//        webView.getSettings().setJavaScriptEnabled(true);
//
//        webView.requestFocus();
//        webView.setWebViewClient(new WebViewClient() {
//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view, String url) {
//
//                view.loadUrl(url);
//                return true;
//            }
//        });


//        showText(dataStr);


//        webView51cto(webView,dataStr);
    }

    private void showText(String dataStr) {
        TextView textView = findViewById(R.id.textView);
        Log.e("glz", dataStr);
        textView.setText(Html.fromHtml(data2));
    }

    private void webView51cto(WebView webView, String dataStr) {
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        webView.setWebViewClient(new MyWebViewClient(this));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
        } else {
            settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        }
        webView.loadData(getHtmlData(dataStr), "text/html;charset=utf-8", "utf-8");
    }

    private String getHtmlData(String bodyHTML) {
        String head = "<head>" +
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no\"> " +
                "<style>html{padding:15px;} body{word-wrap:break-word;font-size:13px;padding:0px;margin:0px} p{padding:0px;margin:0px;font-size:13px;color:#222222;line-height:1.3;} img{padding:0px,margin:0px;max-width:100%; width:auto; height:auto;}</style>" +
                "</head>";
        return "<html>" + head + "<body>" + bodyHTML + "</body></html>";
    }


    static class MyWebViewClient extends WebViewClient {

        private Activity activity;

        public MyWebViewClient(Activity activity) {

            this.activity = activity;
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            view.loadUrl(url);
            return true;
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);

        }

        @Override
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            handler.proceed();
            super.onReceivedSslError(view, handler, error);
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);

        }
    }
}

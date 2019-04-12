package com.wong.screeninfodemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.tv);

        //关于屏幕显示的信息
        DisplayMetrics metrics = getResources().getDisplayMetrics();

        //屏幕可显示大小的绝对宽度，单位像素。
        float widthPixels = metrics.widthPixels;

        //屏幕可显示大小的绝对高度，单位像素。
        float heightPixels = metrics.heightPixels;

        //设备独立像素（Device Independent Pixel）：与设备无关的逻辑像素，代表可以通过程序控制使用的虚拟像素
        // density是显示屏的逻辑密度，这是一个密度独立像素单元的比例因子，它提供系统显示的基线。
        //dpi:dot per inch
        //在大约160dpi的屏幕上，1dip等于1像素。那么在120dpi的屏幕上，1dip就是0.75像素等等
        float density = metrics.density;
        //比例因子,用于显示在屏幕上的字体。与density是一样的。不同的是，它能够在运行时，根据用户对字体的大小偏好做调整This is the same
        float scaledDensity = metrics.scaledDensity;

        //屏幕密度，表达成dots-per-inch 每英寸的点数
        float densityDpi = metrics.densityDpi;

        //屏幕在y轴方向每英寸的物理像素
        float ydpi = metrics.ydpi;

        //屏幕在x轴方向每英寸的物理像素
        float xdpi = metrics.xdpi;


        String s = "density:"+density
                +"\nscaledDensity:"+scaledDensity
                +"\ndensityDpi:"+densityDpi
                +"\nydpi:"+ydpi
                +"\nheightPixels:"+heightPixels
                +"\nxdpi:"+xdpi
                +"\nwidthPixels:"+widthPixels;
        tv.setText(s);


    }
}

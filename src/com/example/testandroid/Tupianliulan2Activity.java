package com.example.testandroid;

import android.app.Activity;  
import android.content.Context;  
import android.os.Bundle;  
import android.view.View;  
import android.view.ViewGroup;  
import android.view.ViewGroup.LayoutParams;  
import android.view.Window;  
import android.view.animation.AnimationUtils;  
import android.widget.AdapterView;  
import android.widget.AdapterView.OnItemSelectedListener;  
import android.widget.BaseAdapter;  
import android.widget.Gallery;  
import android.widget.ImageSwitcher;  
import android.widget.ImageView;  
import android.widget.ViewSwitcher.ViewFactory;  
  
public class Tupianliulan2Activity extends Activity implements ViewFactory{  
      
    private ImageSwitcher imageSwitcher;  
    private Gallery gallery;  
  
    //图片集合  
	private int[] Images = new int[] { R.drawable.img11, R.drawable.img12,
			R.drawable.img13, R.drawable.img14, R.drawable.img15,
			R.drawable.img16, R.drawable.img17, R.drawable.img18,
			R.drawable.img19 }; // 声明并初始化一个保存要显示图像ID的数组
  
    @Override  
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
          
//        requestWindowFeature(Window.FEATURE_NO_TITLE);  
        setContentView(R.layout.activity_tupianliulan2);  
  
        imageSwitcher = (ImageSwitcher) findViewById(R.id.switcher);  
        //为他它指定一个ViewFactory，也就是定义它是如何把内容显示出来的，实现ViewFactory接口并覆盖对应的makeView方法。  
        imageSwitcher.setFactory(this);  
        //添加动画效果  
        imageSwitcher.setInAnimation(AnimationUtils.loadAnimation(this,  
                android.R.anim.fade_in));  
        imageSwitcher.setOutAnimation(AnimationUtils.loadAnimation(this,  
                android.R.anim.fade_out));  
  
        gallery = (Gallery) findViewById(R.id.gallery);  
        //添加适配器  
        gallery.setAdapter(new ImageAdapter(this));  
        //设置监听器  
        gallery.setOnItemSelectedListener(new onItemSelectedListener());  
    }  
    //重写makeView()方法  
    public View makeView() {  
        ImageView imageView = new ImageView(this);  
        imageView.setBackgroundColor(0xFF000000);  
        //设置填充方式  
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);  
        imageView.setLayoutParams(new ImageSwitcher.LayoutParams(  
                LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));  
        return imageView;  
    }  
  
    //适配器  
    public class ImageAdapter extends BaseAdapter {  
          
        private Context mContext;  
        public ImageAdapter(Context c) {  
            mContext = c;  
        }  
  
        public int getCount() {  
            return Images.length;  
        }  
  
        public Object getItem(int position) {  
            return position;  
        }  
  
        public long getItemId(int position) {  
            return position;  
        }  
  
        public View getView(int position, View convertView, ViewGroup parent) {  
            ImageView imageView = new ImageView(mContext);  
  
            imageView.setImageResource(Images[position]);  
            imageView.setAdjustViewBounds(true);  
            imageView.setLayoutParams(new Gallery.LayoutParams(  
                    LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));  
//            imageView.setBackgroundResource(R.drawable.e);  
            return imageView;  
        }  
  
    }  
    private class  onItemSelectedListener implements OnItemSelectedListener{  
  
        public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,  
                long arg3) {  
            imageSwitcher.setImageResource(Images[arg2]);  
        }  
  
        public void onNothingSelected(AdapterView<?> arg0) {  
        }  
          
    }  
}  
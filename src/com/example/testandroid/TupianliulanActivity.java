package com.example.testandroid;

import com.example.testandroid.R.id;

import android.R.string;
import android.app.Activity;  
import android.content.Intent;
import android.graphics.PointF;
import android.os.Bundle;  
import android.util.FloatMath;
import android.util.Log;
import android.view.MotionEvent;  
import android.view.View;  
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;  
import android.view.ViewGroup;  
import android.view.animation.AnimationUtils;  
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageSwitcher;  
import android.widget.ImageView;  
import android.widget.LinearLayout;  
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;  
import android.widget.TextView;
import android.widget.Toast;  
import android.widget.ViewSwitcher.ViewFactory;  

public class TupianliulanActivity extends Activity implements ViewFactory, OnTouchListener{
    private ImageSwitcher mImageSwitcher;  
    /** 
     * 图片id数组 
     */  
    private int currentPosition;  
    /** 
     * 按下点的X坐标 
     */  
    private float downX;  
    /** 
     * 装载点点的容器 
     */  
    private float oldDist; 
    private LinearLayout linearLayout;  
    /** 
     * 点点数组 
     */  
    private RelativeLayout relativeLayout; 
    private ImageView[] tips;  
	private int[] imageId = new int[] { R.drawable.img11, R.drawable.img12,
			R.drawable.img13, R.drawable.img14, R.drawable.img15,
			R.drawable.img16, R.drawable.img17, R.drawable.img18,
			R.drawable.img19 }; // 声明并初始化一个保存要显示图像ID的数组
	private String[] title = new String[]{"b1","b2","b3","b4","b5","b6","b7","b8","b9"}; // 声明并初始化一个保存要显示图像ID的数组
	private String[] detail = new String[]{"d1","d2","d3","d4","d5","d6","d7","d8","d9"};
	private int index = 0; // 当前显示图像的索引
	private ImageSwitcher imageSwitcher; // 声明一个图像切换器对象

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tupianliulan);
		mImageSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcher1); // 获取图像切换器
		// 设置动画效果
		mImageSwitcher.setInAnimation(AnimationUtils.loadAnimation(this,
				android.R.anim.fade_in)); // 设置淡入动画
		mImageSwitcher.setOutAnimation(AnimationUtils.loadAnimation(this,
				android.R.anim.fade_out)); // 设置淡出动画
        linearLayout = (LinearLayout) findViewById(R.id.viewGroup);  
        relativeLayout = (RelativeLayout) findViewById(R.id.relative1);
        relativeLayout.setVisibility(View.VISIBLE);  
		mImageSwitcher.setFactory(this);  
        //设置OnTouchListener，我们通过Touch事件来切换图片  
		mImageSwitcher.setOnTouchListener(this);  


        
//        tips = new ImageView[imageId.length];  
//        for(int i=0; i<imageId.length; i++){  
//            ImageView mImageView = new ImageView(this);  
//            tips[i] = mImageView;  
//            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(new ViewGroup.LayoutParams(LayoutParams.WRAP_CONTENT,      
//                    LayoutParams.WRAP_CONTENT));    
//            layoutParams.rightMargin = 3;  
//            layoutParams.leftMargin = 3;  
//              
//
//            mImageView.setBackgroundResource(R.drawable.page_indicator_unfocused);  
//            linearLayout.addView(mImageView, layoutParams);  
//        }  
        //这个我是从上一个界面传过来的，上一个界面是一个GridView  
        mImageSwitcher.setImageResource(imageId[0]);  
        setdetail(currentPosition);
          
//        setImageBackground(currentPosition); 
//        mImageSwitcher.setOnClickListener(new onClickListener()); 
        Button back = (Button) findViewById(id.back);
        back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				
			}
		});

          
		
	}
	 private void setdetail(int selectItems){    

	    	TextView biaoti = (TextView) findViewById(id.biaoti);
	    	biaoti.setText(title[selectItems]);
	    	TextView yema = (TextView) findViewById(id.yema);
	    	yema.setText(selectItems+1+"/"+imageId.length);
	    	TextView jianjie = (TextView) findViewById(id.jianjie);
	    	jianjie.setText(detail[selectItems]);
	    	  
    }   

	    private void setImageBackground(int selectItems){    
	        for(int i=0; i<tips.length; i++){    
	            if(i == selectItems){    
	                tips[i].setBackgroundResource(R.drawable.page_indicator_focused);    
	            }else{    
	                tips[i].setBackgroundResource(R.drawable.page_indicator_unfocused);    
	            }    
	        }    
	    }   

      
    @Override  
    public View makeView() {  
        final ImageView i = new ImageView(this);  
        i.setBackgroundColor(0xff000000);  
        i.setScaleType(ImageView.ScaleType.FIT_CENTER);  
        i.setLayoutParams(new ImageSwitcher.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));  
        return i ;  
    } 
    @Override  
    public boolean onTouch(View v, MotionEvent event) {  
    	int nCnt = event.getPointerCount(); 
    	System.out.println(nCnt);

    	if(nCnt==1){
    	
        switch (event.getAction()& MotionEvent.ACTION_MASK) {  
        case MotionEvent.ACTION_DOWN:{  
            //手指按下的X坐标  
            downX = event.getX();  
            break;  
        }  
        case MotionEvent.ACTION_UP:{  
            float lastX = event.getX();  
            //抬起的时候的X坐标大于按下的时候就显示上一张图片  
            
            if(lastX > downX+80){  
                if(currentPosition > 0){  
                    //设置动画，这里的动画比较简单，不明白的去网上看看相关内容  
                    mImageSwitcher.setInAnimation(AnimationUtils.loadAnimation(getApplication(), R.anim.left_in));  
                    mImageSwitcher.setOutAnimation(AnimationUtils.loadAnimation(getApplication(), R.anim.right_out));  
                    currentPosition --;  
                    mImageSwitcher.setImageResource(imageId[currentPosition % imageId.length]);  
                    setdetail(currentPosition);  
                }else{  
                    Toast.makeText(getApplication(), "已经是第一张", Toast.LENGTH_SHORT).show();  
                }  
            }   
              
            else if(lastX < downX-80){  
                if(currentPosition < imageId.length - 1){  
                    mImageSwitcher.setInAnimation(AnimationUtils.loadAnimation(getApplication(), R.anim.right_in));  
                    mImageSwitcher.setOutAnimation(AnimationUtils.loadAnimation(getApplication(), R.anim.lift_out));  
                    currentPosition ++ ;  
                    mImageSwitcher.setImageResource(imageId[currentPosition]);  
                    setdetail(currentPosition);  
                }else{  
                    Toast.makeText(getApplication(), "到了最后一张", Toast.LENGTH_SHORT).show();  
                }  
            }  
            
            else{
            	if(relativeLayout.isShown()){
            		relativeLayout.setVisibility(View.INVISIBLE); 
            	}
            	else{
            		relativeLayout.setVisibility(View.VISIBLE); 
            	}
            }
            break; 
            }  
        

              
             
        }  
    	}
    	else if(nCnt>=2){
    		switch (event.getAction()& MotionEvent.ACTION_MASK) {
    		
	        case MotionEvent.ACTION_POINTER_DOWN:{
	            oldDist = spacing(event);
	            break;
	            }
	        
	        case MotionEvent.ACTION_POINTER_UP:{
	        	float newDist = spacing(event);
	        	if(newDist>oldDist){
	        		Toast.makeText(getApplicationContext(), "放大", 3000).show();
	        	}
	        	else{
	        		Toast.makeText(getApplicationContext(), "缩小", 3000).show();
	        	}
	        	break; 	
	        }
	         
		}
    	}
        return true;  
    }  

    private float spacing(MotionEvent event) {
        float x = event.getX(0) - event.getX(1);
        float y = event.getY(0) - event.getY(1);
        System.out.println(FloatMath.sqrt(x * x + y * y));
        return FloatMath.sqrt(x * x + y * y);
    }
    
    private void midPoint(PointF point, MotionEvent event) {
        float x = event.getX(0) + event.getX(1);
        float y = event.getY(0) + event.getY(1);
        point.set(x/2, y/2);
    }
    
    private class  onClickListener implements OnClickListener{  

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			linearLayout.setVisibility(View.INVISIBLE);  
		}  
          
    }  
}

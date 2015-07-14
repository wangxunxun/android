package com.example.testandroid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.SimpleAdapter;

public class GridViewtActivity extends Activity{
	private int[] imageId = new int[] { R.drawable.img18, R.drawable.img19,
			R.drawable.img20, R.drawable.img21, R.drawable.img22,
			R.drawable.img23, R.drawable.img24, R.drawable.img25,
			R.drawable.img26, R.drawable.img27, R.drawable.img28,
			R.drawable.img29, }; // 定义并初始化保存图片id的数组
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gridview);
		GridView gridview = (GridView) findViewById(R.id.gridView1); // 获取GridView组件
		/***********************使用SimpleAdapter指定要显示的内容*********************************/
		String[] title = new String[] { "花开富贵", "海天一色", "日出", "天路", "一枝独秀",
				"云", "独占鳌头", "蒲公英花", "花团锦簇", "争奇斗艳", "和谐", "林间小路" }; // 定义并初始化保存说明文字的数组
		List<Map<String, Object>> listItems = new ArrayList<Map<String, Object>>();// 创建一个list集合
		// 通过for循环将图片id和列表项文字放到Map中，并添加到list集合中
		for (int i = 0; i < imageId.length; i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("image", imageId[i]);
			map.put("title", title[i]);
			listItems.add(map); // 将map对象添加到List集合中
		}

		SimpleAdapter adapter = new SimpleAdapter(this,
								listItems,
								R.layout.items,
								new String[] { "title", "image" },
								new int[] {R.id.title, R.id.image }
		); // 创建SimpleAdapter
		gridview.setAdapter(adapter); // 将适配器与GridView关联
		/*********************************************************************************/
		/**********************使用BaseAdapter指定要显示的内容*****************************/
//		BaseAdapter adapter=new BaseAdapter() {
//			
//			@Override
//			public View getView(int position, View convertView, ViewGroup parent) {
//				ImageView imageview;	//声明ImageView的对象
//				if(convertView==null){
//					imageview=new ImageView(MainActivity.this);	//实例化ImageView的对象
//					imageview.setScaleType(ImageView.ScaleType.CENTER_INSIDE);	//设置缩放方式
//					imageview.setPadding(5, 0, 5, 0);		//设置ImageView的内边距
//				}else{
//					imageview=(ImageView)convertView;
//				}
//				imageview.setImageResource(imageId[position]);	//为ImageView设置要显示的图片
//				return imageview;	//返回ImageView
//			}
//			
//			/* 
//			 * 功能：获得当前选项的ID
//			 * (non-Javadoc)
//			 * @see android.widget.Adapter#getItemId(int)
//			 */
//			@Override
//			public long getItemId(int position) {
//				return position;
//			}
//			
//			/* 
//			 * 功能：获得当前选项
//			 * (non-Javadoc)
//			 * @see android.widget.Adapter#getItem(int)
//			 */
//			@Override
//			public Object getItem(int position) {
//				return position;
//			}
//			
//			/*
//			 * 获得数量
//			 *  (non-Javadoc)
//			 * @see android.widget.Adapter#getCount()
//			 */
//			@Override
//			public int getCount() {
//				return imageId.length;
//			}
//		};
//		gridview.setAdapter(adapter); // 将适配器与GridView关联
		/*********************************************************************************/
	}

}

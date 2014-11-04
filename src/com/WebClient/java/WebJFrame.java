package com.WebClient.java;


import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Label;
public class WebJFrame extends JFrame{
	private Container webContaier;
	private GridBagLayout webLayout ;
	private GridBagConstraints webLayoutCon;
	/**
	 * 
	 * @param name 按钮名
	 * @param gridbag 布局器
	 * @param c 布局设置器
	 * @param gridx x坐标
	 * @param gridy y坐标
	 * @param gridwidth 宽度
	 * @param gridheight 高度
	 */
	protected void makebutton(String name,
			GridBagLayout gridbag,GridBagConstraints c,
			int gridx,int gridy,int gridwidth,int gridheight){
		Button button = new Button(name);
		c.gridx = gridx;
		c.gridy = gridy;
		c.gridwidth=gridwidth;
		c.gridheight=gridheight;
		gridbag.setConstraints(button,c);
		this.add(button);
	}
	/**
	 * @param name 标签名
	 * @param gridbag 布局器
	 * @param c 布局设置器
	 * @param gridx x坐标
	 * @param gridy y坐标
	 * @param gridwidth 标签宽度
	 * @param gridheight 标签宽度
	 */
	protected void makeLabel(String name,GridBagLayout gridbag,GridBagConstraints c,
			int gridx,int gridy,int gridwidth,int gridheight){
		Label label = new Label(name);
		label.setBackground(Color.BLACK);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Times new roman",Font.PLAIN,24));
		c.gridx = gridx;
		c.gridy = gridy;
		c.gridwidth=gridwidth;
		c.gridheight=gridheight;
		gridbag.setConstraints(label,c);
		this.add(label);
	}
	public WebJFrame()
	{
		this.setTitle("华东师范大学云盘客户端");
		this.setFont(new Font("SansSerif",Font.PLAIN,14));
		webContaier = getContentPane();
		webLayout = new GridBagLayout();
		webContaier.setLayout(webLayout);
		webLayoutCon  = new GridBagConstraints();
		
		webLayoutCon.fill = GridBagConstraints.BOTH;
		webLayoutCon.weightx = 0.0;
		
		makeLabel("    华师大云客户端    ", webLayout, webLayoutCon, 0, 0, 1, 1);
		makeLabel("    华东师范计算中心    ", webLayout, webLayoutCon, 5, 0, 1, 1);
		makebutton("上传", webLayout, webLayoutCon,0,2,1,1);
		makebutton("下载",webLayout,webLayoutCon,3,2,1,1);
		makebutton("新建文件夹",webLayout,webLayoutCon,5,2,2,1);
		makebutton("分享",webLayout,webLayoutCon,7,2,1,1);
//		webLayoutCon.gr
		this.setSize(500,500);
		this.setVisible(true);
		this.setLocationRelativeTo(null); 
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	public static void main(String []args){
		WebJFrame webJF=new WebJFrame(); 
	}
}

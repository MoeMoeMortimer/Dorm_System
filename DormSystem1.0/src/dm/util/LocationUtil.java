/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm.util;


import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;

/**
 * 用来设置窗口位置
 * @author ziyue
 */
public class LocationUtil {
    /**
    * 鑾峰彇灞忓箷澶у皬
    * @return
    */
   private static Dimension getScreenSize() {
        return Toolkit.getDefaultToolkit().getScreenSize();
    }
   /**
    * 设置组件最大化
    * @param comp
    */
  public static void setFullScreen(Component comp){
     comp.setSize(getScreenSize());
  }
  /**
   * 设置组件屏幕居中
   * @param comp
   */
  public static void setScreenCenter(Component comp){
    java.awt.Dimension Dcomp=comp.getSize();
    if(Dcomp.width>getScreenSize().width){
        Dcomp.width = getScreenSize().width;
    }
    if(Dcomp.height >getScreenSize().height){
        Dcomp.height = getScreenSize().height;
    }
      comp.setLocation((getScreenSize().width-Dcomp.width)/2,
                                          (getScreenSize().height-Dcomp.height)/4);
  }
  /**
   * 灏嗙獥浣撴樉绀哄湪鐖剁獥浣撲腑闂翠綅缃�
   * @param pcontainer
   * @param container
   */
  public static void setParentCenter (Container pcontainer,Container container ){
         java.awt.Dimension  Dpcontainer=pcontainer.getSize();
         java.awt.Dimension  Dcontainer=container.getSize();
         if(Dcontainer.height>Dpcontainer.height){
                Dcontainer.height=Dpcontainer.height;
         }
         if(Dcontainer.width>Dpcontainer.width){
                Dcontainer.width=Dpcontainer.width;
         }
        // container.setLocation((Dpcontainer.width-Dcontainer.width)/2,(Dpcontainer.height-Dcontainer.height)/2);
         container.setLocation((Dpcontainer.width-Dcontainer.width)/2,(Dpcontainer.height-Dcontainer.height)/4);
    }   
  
}

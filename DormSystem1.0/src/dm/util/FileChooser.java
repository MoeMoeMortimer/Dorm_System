/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm.util;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author LIUYIYU
 */
public class FileChooser {
    //新建一个文件
    public static File newFile(JInternalFrame frame){
        JFileChooser savefile = new JFileChooser();//文件选择对话框
        FileFilter filter = new FileNameExtensionFilter("Excel文件(*.xls)", "xls");
        savefile.addChoosableFileFilter(filter);
        savefile.setFileFilter(filter); //添加过滤器
        //打开文件选择对话框，showSaveDialog是保存，showOpenDialog是打开
        int flag = savefile.showSaveDialog(frame);
        File file = null;
        //如果点击了保存按钮
        if (flag == JFileChooser.APPROVE_OPTION) {
            file = savefile.getSelectedFile();//所选择的文件名（手写或选择）
            System.out.println("文件名：" + file.getAbsolutePath());
            String filename = file.getAbsolutePath();
            //截取文件扩展名（文件名长度后4位）
            String ftype = filename.substring(filename.length() - 4);
            if (!ftype.equals(".xls")) {
                //如果用户没有填写扩展名，自动添加扩展名.xls
                file = new File(filename + ".xls");
            }
        }
        return file;
    }
    
    //打开已有文件
    public static File selectFile(JInternalFrame frame){
        JFileChooser openfile = new JFileChooser();//文件选择对话框
        FileFilter filter = new FileNameExtensionFilter("Excel文件(*.xls)", "xls");
        openfile.addChoosableFileFilter(filter);
        openfile.setFileFilter(filter); //添加过滤器
        //打开文件选择对话框，showSaveDialog是保存，showOpenDialog是打开
        int flag = openfile.showOpenDialog(frame);
        File file = null;
        //如果点击了打开按钮
        if (flag == JFileChooser.APPROVE_OPTION) {
            file = openfile.getSelectedFile();
            String filename = file.getAbsolutePath();
            //截取文件扩展名（文件名长度后4位）
            String ftype = filename.substring(filename.length() - 4);
            if (!ftype.equals(".xls")) {
                JOptionPane.showMessageDialog(frame, "请选择Excel文件！");
                file = null;
            }
        }
        return file;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import jxl.Workbook;
import jxl.format.Colour;
import jxl.format.ScriptStyle;
import jxl.format.UnderlineStyle;
import jxl.write.*;

/**
 *
 * @author LIUYIYU
 */
public class ExportToExcel {
    public static boolean printTableContent(JTable myTable,File file) {
        //获得表格模型,按照数据库的顺序，获得表列名
         
        DefaultTableModel dtm = (DefaultTableModel) myTable.getModel();
        //获取类名
        int n = dtm.getColumnCount();
        List<String> column = new ArrayList<String>();
        for(int i = 0; i < n; i++){
            column.add(dtm.getColumnName(i));
        }
        try {
            //File file = new File("学生选课信息表.xls"); //创建Excel表格
            WritableWorkbook book = Workbook.createWorkbook(file); //创建特殊类型的变量使之与Excel表格对应以便于操作
            WritableSheet sheet1 = book.createSheet("第一页", 0); //在表格中创建第一页，参数指明页的名称和索引，索引从0开始
            
            sheet1.setRowView(0, 400); //设置某一行的高度
            //设置标题行每列的高度
            for(int i = 0; i < n; i++){
                sheet1.setColumnView(i, 20);
            }

            WritableFont font = new WritableFont(WritableFont.TIMES, 13, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.DARK_RED, ScriptStyle.NORMAL_SCRIPT); //创建字体，7个参数分别是字体名称，字号，是否粗体，是否斜体，下划线，颜色，上下标

            WritableFont font1 = new WritableFont(WritableFont.TIMES, 10, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.BLACK, ScriptStyle.NORMAL_SCRIPT);
            WritableCellFormat format = new WritableCellFormat(font); //将字体放入单元格式中

            WritableCellFormat format1 = new WritableCellFormat(font1);
            format1.setAlignment(Alignment.CENTRE); //对齐方式的设定

            format.setAlignment(Alignment.CENTRE); //对齐方式的设定
            //第0行是标题,并添加列名
            for(int i = 0; i < n; i++){
                Label labelID = new Label(i, 0, column.get(i), format); //写入字符串，确定内容、位置和格式
                //添加列名
                sheet1.addCell(labelID); //将设置好的字符串加入页
            }
            //取出table的内容，放到Excel中
            int row = dtm.getRowCount();
            for (int i = 0; i < row; i++) {
                //添加每一行内容
                for(int j = 0; j < n; j++){
                    //获取每一行数据，从第一行开始，第0行是标题
                    Label id = new Label(j, i+1, myTable.getValueAt(i, j).toString(), format1);
                    sheet1.addCell(id);
                
                }
            }
            //保存数据，存盘
            book.write();
            book.close();
        } catch (WriteException ex) {
          ex.printStackTrace();
          return false;

        } catch (IOException ex) {
           ex.printStackTrace();
           return false;
        }
        return true;
    }
}

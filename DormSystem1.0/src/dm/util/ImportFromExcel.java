/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm.util;

import static com.sun.org.apache.xerces.internal.util.FeatureState.is;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static jxl.biff.BaseCellFeatures.logger;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 *
 * @author LIUYIYU
 */
public class ImportFromExcel {
    public static boolean printTable(JTable myTable,File file) throws IOException {
        String filePath = file.getAbsolutePath();
        InputStream inp = new FileInputStream(filePath);
        Workbook wb = null;
        if (filePath.endsWith(".xls")) {
            wb = new HSSFWorkbook(new POIFSFileSystem(inp));
        }
        else if (filePath.endsWith(".xlsx")) {
            wb = new XSSFWorkbook(inp);
        }
        DefaultTableModel dtm = (DefaultTableModel) myTable.getModel();
        //获取类名
        
        try {
            //创建工作表sheet
            Sheet sheet = wb.getSheetAt(0);
            //获取sheet中数据的行数
            int rows = sheet.getPhysicalNumberOfRows();
            //获取表头单元格个数
            int n = sheet.getRow(0).getPhysicalNumberOfCells();
            
            for (int i = 1; i < rows; i++) {//第一行为标题栏，从第二行开始取数据
                Row row = sheet.getRow(i);
                Vector vt = new Vector();
                for(int j = 0; j < n; j++){
                    Cell cell = row.getCell(j);
                    if (null == cell) {
                        cell = row.createCell(j);
                    }
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    String value = null == cell.getStringCellValue()?"":cell.getStringCellValue();
                    vt.add(value);
                }
                dtm.addRow(vt);
            }
            
        } catch (Exception e) {
            logger.error(e);
        }finally{
            try {
                inp.close();//关闭流
            } catch (Exception e2) {
                logger.error(e2);
            }
        }
	return true;

	
    }
}

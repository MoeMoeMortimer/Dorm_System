/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm.view;

import dm.biz.AssetBiz;
import dm.biz.AssetBizImpl;
import dm.po.Asset;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieToolTipGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.*;
import org.jfree.data.*;
import org.jfree.*;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author LIUYIYU
 */
public class FixChartBuilder extends JFrame {
    String title;
    static HashMap<String, Integer> map;
    static AssetBiz abiz = new AssetBizImpl();
    public FixChartBuilder(String title, HashMap<String, Integer> map) {
        super(title);
        this.title = title;
        this.map = map;
        //设置关闭方式为销毁当前窗体
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.setContentPane(createPanel()); //将生成的图表面板设为内容面板

    }

    private static PieDataset createDataSet() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        Set<String> keyset = map.keySet();
        for (String s : keyset) {
            //图表数据，名称，横坐标
            dataset.setValue(s, map.get(s));
        }
        return dataset;
    }

    private static JFreeChart createJFreeChart(PieDataset dataset) {
        /**
         * 构建JFreeChart
         */
        //创建主题样式     
        StandardChartTheme standardChartTheme = new StandardChartTheme("CN");
        //设置标题字体     
        standardChartTheme.setExtraLargeFont(new Font("隶书", Font.BOLD, 20));
        //设置图例的字体    
        standardChartTheme.setRegularFont(new Font("宋书", Font.PLAIN, 15));
        //设置轴向的字体     
        standardChartTheme.setLargeFont(new Font("宋书", Font.PLAIN, 15));
        //应用主题样式   
        ChartFactory.setChartTheme(standardChartTheme);
        //与柱状图和折线图不同  
        //createPieChart 2D; createPieChart3D  3D
        JFreeChart chart = ChartFactory.createPieChart("宿舍易损物品统计", dataset, true, true, false);

        //设置标题字体,为了防止中文乱码
        //chart.setTitle(new TextTitle("宿舍易损物品统计", new Font("黑体", Font.ITALIC, 22)));

        //取得统计图标的第一个图例
        LegendTitle legend = chart.getLegend(0);
        //修改图例的字体,必须把显示图片设置为ture,否则会包空指针异常
        legend.setItemFont(new Font("宋体", Font.BOLD, 20));

        //取得图表显示对象(与柱状图和折线图不同)
        PiePlot plot = (PiePlot) chart.getPlot();
        //设置区块标签的字体==为了防止中文乱码：必须设置字体
        plot.setLabelFont(new Font("隶书", Font.BOLD, 22));
        //图形边框颜色
        plot.setBaseSectionOutlinePaint(Color.BLUE);
        //图形边框粗细
        plot.setBaseSectionOutlineStroke(new BasicStroke(0.5f));
        //设置饼状图的绘制方向,可以按顺时针方向绘制,也可以按逆时针方向绘制
        //plot.setDirection(Rotation.CLOCKWISE);//逆时针,Rotation.CLOCKWISE顺时针
        //设置绘制角度(图形旋转角度)
        plot.setStartAngle(70);
	//设置突出显示的数据块
        //plot.setExplodePercent(1, 0.5D);
        //plot.setExplodePercent("One", 0.5D);
        //扇区分离显示,对3D图不起效
        plot.setExplodePercent(dataset.getKey(0), 0.1d);
        //分类标签与图的连接线颜色
        plot.setLabelLinkPaint(Color.BLUE);
        //分类标签边框颜色
        plot.setLabelOutlinePaint(Color.black);
        //分类标签阴影颜色
        plot.setLabelShadowPaint(Color.RED);
        //指定分类饼的颜色
        plot.setSectionPaint(1, Color.BLACK);
        //饼状图标签显示百分比 :自定义,{0}表示选项,{1}表示数值,{2}表示所占比例,小数点后两位
        plot.setLabelGenerator(new StandardPieSectionLabelGenerator(
                "{0}:{1}\r\n{2}", NumberFormat.getNumberInstance(), new DecimalFormat("0.00%")));

        //图例显示百分比
        plot.setLegendLabelGenerator(new StandardPieSectionLabelGenerator("{0}={2}"));
        //指定显示的拼图为:圆形(true),还是椭圆形(false)
        plot.setCircular(true);
        //没有数据的时候显示的内容
        plot.setNoDataMessage("没有可用的数据...");

        //设置鼠标悬停提示
        plot.setToolTipGenerator(new StandardPieToolTipGenerator());
		//设置热点链接
        //plot.setURLGenerator(new StandardPieURLGenerator("detail.jsp"));

        return chart;
    }

    public static JPanel createPanel() {
        // 生成JFreeChart对象(依据数据生成图表)
        JFreeChart chart = createJFreeChart(createDataSet());
        // 将JFreeChar对象转成JPanel
        return new ChartPanel(chart);
    }

    public static void main(String[] args) {

    }
}

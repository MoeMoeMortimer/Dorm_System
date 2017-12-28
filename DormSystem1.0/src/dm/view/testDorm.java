package dm.view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import dm.biz.SDBiz;
import dm.biz.SDBizImpl;
import dm.biz.StudentBiz;
import dm.biz.StudentBizImpl;
import dm.biz.tManageStuBiz;
import dm.biz.tManageStuBizImpl;
import dm.dao.tManageStuDao;
import dm.po.Student;
import dm.vo.SD;
import dm.vo.tManageStu;

public class testDorm {
	tManageStuDao tdao = new tManageStuDao();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("请输入宿舍号:");
		String sd = sc.next();
		tManageStuBiz tbiz = new tManageStuBizImpl();
		List<tManageStu> list = tbiz.findByDno(sd);
		tManageStu t = new tManageStu();
		t.setSno("1234");
		t.setDno("1#999");
		t.setSdept("123");
		t.setSgrade(2015);
		t.setSname("qwer");
		t.setSsex("yui");
		
		Date date = new Date();
	    DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
	    String time = format.format(date);
	 
	    t.setScin(date);
	    System.out.println(date);
	    tbiz.add(t);
		if(list==null){
			System.out.println("132131456543");
		}
		else {
			System.out.println("adsagfsdfds");
		}

		
	}

}

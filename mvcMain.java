

public class mvcMain {
	 public static void main(String[] args)
	    {
	        Model model  =new Model();
	        //retriveStudentFromDatabase();
	 model.setName("sathish");
	 model.setRollNum(101);
	        View view = new View();
	 
	        Controller controller = new Controller(model, view);
	        controller.seeDetails();
	        controller.setModelName("mani");
	        controller.setRollNum(200);
	        controller.seeDetails();
	    }
	 
	    private static Model retriveStudentFromDatabase()
	    {
	        Model m1 = new Model();
	        m1.setName("Lokesh Sharma");
	        m1.setRollNum(12345);
	        return m1;
	    }

}
//-------------------------------model class---------------------------
public class Model {
  private String name;
  private int rollNum;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRollNum() {
	return rollNum;
}
public void setRollNum(int rollNum) {
	this.rollNum = rollNum;
}
  
}
public class Controller {
	private Model m;
	private View v;
	//-----------------------Controller class----------------------------------
public Controller(Model m,View v) {
	this.m=m;
	this.v=v;
}
public void setModelName(String name) {
	m.setName(name);
}
public String getModelName() {
	return m.getName();
}
public void setRollNum(int rollNum) {
	m.setRollNum(rollNum);
}
public int getRollNum() {
	return m.getRollNum();
}
public void seeDetails() {
	v.viewDetail(m.getName(),m.getRollNum() );
}
}
//--------------------View classs-------------------------
public class View {
	public void viewDetail(String name,int rollNum) {
		System.out.println("The student Details");
		System.out.println(name);
		System.out.println(rollNum);

	}
}


/**
 *@auther: Suraj Dubey
 *@JAVA Notepad (JNotepad)
 *@version# 2.0
 */
 

//import the packages for using the classes in them into this class
import java.awt.*;
/**
 *A PUBLIC CLASS FOR CENTER.JAVA
 */
public class Center{
	Notepad n; //for using the object in the Notepad.java
	Fonts f; //for using the object in the Fonts.java
	public Center(Notepad n){
		this.n = n;
	}
	public Center(Fonts f){
		this.f = f;
	}
	public void nCenter(){
		//Centering the window
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		n.setLocation((screenSize.width-n.getWidth())/2,(screenSize.height-n.getHeight())/2);
	}
	public void fCenter(){
		//Centering the window
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		f.setLocation((screenSize.width-f.getWidth())/2,(screenSize.height-f.getHeight())/2);
	}
}
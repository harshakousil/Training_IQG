package attrs;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class AttrTag extends TagSupport
{
	protected int length = 50;

	public int doEndTag() 
	{
		try {
			JspWriter out = pageContext.getOut();
			out.print( length );
		} catch(Exception e) {
			System.out.println("Error generating number : " + e);
		}
		return EVAL_PAGE;
	}

	public void setLength(String len) 
	{
		try {
			length = Integer.parseInt(len);
		} catch(NumberFormatException nfe) 
		{	len = 50;	}
	}
}
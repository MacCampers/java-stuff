package listener;

import java.util.ArrayList;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import model.Personne;

/**
 * Application Lifecycle Listener implementation class Listener1
 *
 */
@WebListener
public class Listener1 implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public Listener1() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  { 
    	System.out.println("test");
		ArrayList<Personne> list = new ArrayList<Personne>();
		list.add(new Personne("aaa", "bbb"));
		list.add(new Personne("ccc", "ddd"));
		list.add(new Personne("eee", "fff"));
		
		HttpSession session = arg0.getSession();
		session.setAttribute("list", list);
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    }
	
}
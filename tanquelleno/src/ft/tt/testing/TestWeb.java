package ft.tt.testing;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;

import com.mongodb.*;



public class TestWeb {

	public String sayHello(String name){
		return "QUE ONDA " + name;
	}
	
}

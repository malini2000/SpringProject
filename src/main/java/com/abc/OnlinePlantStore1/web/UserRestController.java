package com.abc.OnlinePlantStore1.web;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.abc.OnlinePlantStore1.dto.LoginDTO;
import com.abc.OnlinePlantStore1.exceptions.InvalidUserException;
import com.abc.OnlinePlantStore1.service.UserService;
import com.abc.OnlinePlantStore1.validate.ValidateEntry;


@RestController
@RequestMapping("/user")

public class UserRestController {
       @Autowired
       UserService userser;
       @PostMapping("/login")
       public boolean doLogin(@RequestBody com.abc.PlantStore.dto.LoginDTO loginObj,HttpServletRequest req)throws InvalidUserException{
    	   String username=loginObj.getUsername();
    	   String password=loginObj.getPassword();
    	   if(ValidateEntry.validateNullEntry(username)&&ValidateEntry.validateNullEntry(password)){
    		   String role=userSer.login(username,password);
    		   if(role!=null)
    		   {
    			   //generate new session
    			   HttpSession session=req.getSession(true);
    			   session.setAttribute("role",role);
    			   session.setAttribute("username",username);
    			   return true;
    		   }
    		   else
    		   {
    			   throw new InvalidUserException("","");
    		   }
    	   }
       }
       
}

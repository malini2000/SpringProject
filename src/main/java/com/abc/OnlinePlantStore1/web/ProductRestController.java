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



public class ProductRestController {
	@Autowired
	ProductService ProdSer;
	@GetMapping("product/{product}")
	public Product getProduct(@PathVariable int product) {
		Product obj=ProdSer.searchProd(product);
		return obj;
	}
	@GetMapping("/ProductHtoL")
	public List<Product>list=ProdSer.filterByCostHtol();
	return list;

}
@GetMapping("/ProductLtoH")
public List<Product>ProductLtoH(){
	List<Product>list2=ProdSer.filterByCostLtoH();
	return list2;
}

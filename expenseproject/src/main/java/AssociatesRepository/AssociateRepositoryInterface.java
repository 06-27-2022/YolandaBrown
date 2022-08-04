package AssociatesRepository;
import java.util.List;
import com.loginRepository.LoginModel;

public interface AssociateRepositoryInterface {

	
	List<LoginModel> findALLAssociates();
	
	void save(LoginModel associate);
	void update(LoginModel associate);
	
	LoginModel findbyId(int empid);
}

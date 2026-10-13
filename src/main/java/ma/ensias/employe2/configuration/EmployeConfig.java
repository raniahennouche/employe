package ma.ensias.employe2.configuration;
import ma.ensias.employe2.service.EmployeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.modelmapper.ModelMapper;

@Configuration
public class EmployeConfig {

    @Bean
    public EmployeService employeBean() {
        return new EmployeService();
    }
    @Bean
    public ModelMapper modelMapperBean() {
        return new ModelMapper();
    }
}

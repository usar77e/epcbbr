package cl.epcbbr.backend;


import java.util.ArrayList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
		public static final Contact DEFAULT_CONTACT = new Contact("Erick", "localhost:591",
		      "eriquelme@bbr.cl");

		  public static final ApiInfo DEFAULT_API_INFO = new ApiInfo("Documentacion EPCBBR API",
		      "EPCBBR", "0.8", "PREMIUM", DEFAULT_CONTACT, "Apache 2.0",
		      "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList<VendorExtension>());

		  @Bean
		  public Docket api() {
		    return new Docket(DocumentationType.SWAGGER_2).apiInfo(DEFAULT_API_INFO);
		  }
}

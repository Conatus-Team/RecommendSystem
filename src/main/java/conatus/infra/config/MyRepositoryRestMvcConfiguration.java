package conatus.infra.config;

import java.net.URI;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@Configuration
public class MyRepositoryRestMvcConfiguration extends RepositoryRestConfigurerAdapter {

	   @Override
	   public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config)
	   {
	      config.setBasePath("/recommend");
	   }
}

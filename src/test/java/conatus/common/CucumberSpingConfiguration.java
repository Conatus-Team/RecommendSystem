package conatus.common;

import conatus.RecommendSystemApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { RecommendSystemApplication.class })
public class CucumberSpingConfiguration {}

package co.develhope.Angelo.DeployEnvironmentsVariables02.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @Autowired
    private Environment environment;

    @Value("${myCustomEnvs.welcomeMsg}")
    String welcomeMsgFromProd;

    @GetMapping("/")
    public String welcomeMsg (){
        String welcomeMsgString = environment.getProperty("myCustomEnvs.welcomeMsg");
        return welcomeMsgString;
    }
}

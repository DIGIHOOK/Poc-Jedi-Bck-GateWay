package poc.jedi.bck.gateway.cucumber.stepdefs;

import poc.jedi.bck.gateway.PocJediBckGateWayApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = PocJediBckGateWayApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}

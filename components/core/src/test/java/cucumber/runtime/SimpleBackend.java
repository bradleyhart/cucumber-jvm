package cucumber.runtime;

import cucumber.StepDefinition;
import cucumber.runtime.java.ObjectFactory;

import java.util.List;

public class SimpleBackend implements Backend {
    private final List<StepDefinition> stepDefinitions;
    private final ObjectFactory objectFactory;

    public SimpleBackend(List<StepDefinition> stepDefinitions, ObjectFactory objectFactory) {
        this.stepDefinitions = stepDefinitions;
        this.objectFactory = objectFactory;
    }

    public List<StepDefinition> getStepDefinitions() {
        return stepDefinitions;
    }

    public void newScenario() {
        objectFactory.createObjects();
    }
}
package org.moussaud.micropets.pets;

import org.springframework.cloud.bindings.Binding;
import org.springframework.cloud.bindings.Bindings;
import org.springframework.cloud.bindings.boot.BindingsPropertiesProcessor;
import org.springframework.core.env.Environment;

import java.util.List;
import java.util.Map;

public final class OpenAIBindingsPropertiesProcessor implements BindingsPropertiesProcessor  {

    public static final String TYPE = "openai";

    @Override    
    public void process(Environment environment, Bindings bindings, Map<String, Object> properties) {
        System.out.println("process------");
        List<Binding> myBindings = bindings.filterBindings(TYPE);
        if (myBindings.size() == 0) {
            return;
        }
        properties.put("openai.apikey", myBindings.get(0).getSecret().get("apikey"));
        properties.put("openai.enabled", true);
    }
    
}
